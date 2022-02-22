package com.ao.crs.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ao.crs.pojo.Company;
import com.ao.crs.pojo.Job;
import com.ao.crs.pojo.Weight;
import com.ao.crs.pojo.Weightjob;
import com.ao.crs.services.IWeightJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WeightJobController {

    @Autowired
    private IWeightJobService iWeightJobService;

    @GetMapping(value ="/selectWeightJobByJobId")
    @ResponseBody
    public JSON selectWeightJobByJobId(HttpServletRequest request) {
        List<Weightjob> list = new ArrayList<Weightjob>();
        String jobId = request.getParameter("jobId");
        list = iWeightJobService.selectWeightJobByJobId(Integer.parseInt(jobId));

        JSONObject json = new JSONObject();
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        json.put("code", 0);
        json.put("msg", "");
        json.put("count", list.size());
        return json;
    }

    @PostMapping(value = "/addWeightJobByJobId")
    @ResponseBody
    public String addWeightJobByJobId(HttpServletRequest request, @RequestBody Weightjob weightjob) {
        Integer jobId= Integer.parseInt(request.getParameter("jobId"));
        weightjob.setJobId(jobId);
        iWeightJobService.addWeightJob(weightjob);
        return "1";
    }
    @PostMapping(value = "/editWeightJobByWeightJobId")
    @ResponseBody
    public String editWeightJobByWeightJobId(HttpServletRequest request, @RequestBody Weightjob weightjob) {
        System.out.println("在controller:"+weightjob.toString());
     int state = iWeightJobService.updataWeightJob(weightjob);
        if (state ==1) {//更新公司信息成功
            return "1";
        } else {//更新公司信息失败
            return "0";
        }
    }

    @GetMapping(value ="/selectWeightJobByWeightJobId")
    @ResponseBody
    public JSON selectWeightByWeightJobId(HttpServletRequest request) {
        String weightjobId = request.getParameter("weightjobId");
        List<Weightjob> list = iWeightJobService.selectWeightJobByweightjobId(Integer.parseInt(weightjobId));
        JSONObject json = new JSONObject();
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        return json;
    }

    @PostMapping(value = "/deleteWeightJob")
    @ResponseBody
    public String deleteWeightJob(HttpServletRequest request) {
        String weightjobId = request.getParameter("weightjobId");
        iWeightJobService.deleteWeightJob(Integer.parseInt(weightjobId));
        return "1";
    }
}
