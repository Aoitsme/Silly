package com.ao.crs.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ao.crs.pojo.Job;
import com.ao.crs.services.ICompanyService;
import com.ao.crs.services.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class JobController{

    @Autowired
    private  IJobService iJobService;

    @Autowired
    private ICompanyService iCompanyService;

    @PostMapping(value = "/deleteJob")
    @ResponseBody
    public String deletejob(HttpServletRequest request, @RequestBody Job job) {
        iJobService.deletejob(job);
        return "";
    }
    @PostMapping(value = "/editJob")
    @ResponseBody
    public String updatejob(HttpServletRequest request, @RequestBody Job job) {
        iJobService.updatejob(job);
        return "";
    }

    @PostMapping(value = "/addJob")
    @ResponseBody
    public String addJob(HttpServletRequest request, @RequestBody Job job) {
        String username = request.getParameter("username");
        Integer companyId =  iCompanyService.selectCompanyByUserName(username).getCompanyId();
        job.setCompanyId(companyId);
       iJobService.addjob(job);
       return "1";
    }

    @GetMapping(value = "/selectJob")
    @ResponseBody
    public JSON selectUser(HttpServletRequest request) {
        String username = request.getParameter("username");

        Integer companyId =  iCompanyService.selectCompanyByUserName(username).getCompanyId();

        List<Job> list =  iJobService.selectJobByCompanyId(companyId);

        JSONObject json = new JSONObject();
        json.put("code", 0);
        json.put("msg", "");
        json.put("count", list.size());
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        return json;
    }


}
