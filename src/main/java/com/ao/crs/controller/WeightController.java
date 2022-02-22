package com.ao.crs.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ao.crs.pojo.Weight;
import com.ao.crs.services.IWeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WeightController {

    @Autowired
    IWeightService iWeightService;

    @GetMapping(value ="/selectWeightByJobId")
    @ResponseBody
    public JSON selectCompany(HttpServletRequest request) {
        List<Weight> list = new ArrayList<Weight>();
        String jobId = request.getParameter("jobId");
        System.out.println(jobId);
        Weight weight = iWeightService.findWeightByJobId(jobId);
        list.add(weight);

        JSONObject json = new JSONObject();
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        json.put("code", 0);
        json.put("msg", "");
        json.put("count", list.size());
        return json;
    }

    @PostMapping(value = "/deleteWeightByJobId")
    @ResponseBody
    public String deleteWeightByJobId(HttpServletRequest request) {
        String jobId = request.getParameter("jobId");
        System.out.println(jobId);
        iWeightService.deleteWeightByJobId(jobId);
        return "";
    }
    @PostMapping(value = "/editWeightByJobId")
    @ResponseBody
    public String editWeightByJobId(HttpServletRequest request) {
        String jobId = request.getParameter("jobId");
        System.out.println(jobId);
        iWeightService.editWeightByJobId(jobId);
        return "";
    }

    @PostMapping(value = "/addWeightByJobId")
    @ResponseBody
    public String addWeightByJobId(HttpServletRequest request) {
        String jobId = request.getParameter("jobId");
        String weighttype = request.getParameter("weighttype");
        String weightvalue = request.getParameter("weightvalue");
        System.out.println(jobId+weighttype+weightvalue);
        iWeightService.addWeightByJobId(jobId,weighttype,weightvalue);
        return "";
    }


}
