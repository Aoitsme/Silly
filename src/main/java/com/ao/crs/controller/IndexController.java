package com.ao.crs.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ao.crs.pojo.*;
import com.ao.crs.services.ICompanyService;
import com.ao.crs.services.IJobService;
import com.ao.crs.services.IUserService;
import com.ao.crs.services.IWeightJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ICompanyService iCompanyService;

    @Autowired
    private IUserService iUserService;

    @Autowired
    private IJobService iJobService;

    @Autowired
    private IWeightJobService iWeightJobService;

    //用于显示首页公司排行榜
    @GetMapping(value = "/selectCompanyWithValue")
    @ResponseBody
    public JSON selectCompanyWithValue() {

        List<IndexCompany> list= new ArrayList<IndexCompany>();

        List<Company> companylist = iCompanyService.findAll();

        String companyname;

       for (int i = 0; i < companylist.size(); i++) {

           Company company = companylist.get(i);
           //把查询出的companyName封装进indexCompnay的companyName属性

           companyname = company.getCompanyname();

           //根据companyName查询companyId
           Integer companyId = companylist.get(i).getCompanyId();
           List<Job> jobList =  iJobService.selectJobByCompanyId(companyId);

           for (int j = 0; j < jobList.size(); j++){
               IndexCompany indexCompany = new IndexCompany();
               indexCompany.setCompanyName(companyname);
               Job job = jobList.get(j);
               //把jobName
               indexCompany.setJobName(job.getJobName());
               Double value = iWeightJobService.selectValueByJobId(job.getJobId());

               indexCompany.setValue(value);

               list.add(indexCompany);
           }

       }

        JSONObject json = new JSONObject();
        json.put("code", 0);
        json.put("msg", "");
        json.put("count", list.size());
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        return json;
    }


    //用于显示首页求职者排行榜,设定authorityid为1
    @GetMapping(value = "/selectUserWithValue")
    @ResponseBody
    public JSON selectUserWithValue() {

        List<User> list = iUserService.findbyauthority();
        JSONObject json = new JSONObject();
        json.put("code", 0);
        json.put("msg", "");
        json.put("count", list.size());
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        return json;
    }

}
