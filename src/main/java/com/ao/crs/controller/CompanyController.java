package com.ao.crs.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ao.crs.pojo.Company;
import com.ao.crs.pojo.User;
import com.ao.crs.services.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CompanyController {

    @Autowired
    private ICompanyService iCompanyService;


    @PostMapping(value = "/updatecompany")
    @ResponseBody
    public String updatecompany(HttpServletRequest request, @RequestBody Company company, ModelMap modelMap) {
        iCompanyService.updatecompany(company);
        boolean state = iCompanyService.updatecompany(company);
        if (state == true) {//更新公司信息成功
            modelMap.put("state","1");
            return "";
        } else {//更新公司信息失败
            modelMap.put("state","2");
            return "";
        }
    }

    @PostMapping(value = "/insertcompany")
    @ResponseBody
    public void insertcompany(HttpServletRequest request, @RequestBody Company company, ModelMap modelMap) {
        System.out.println("在controller"+company.toString());
        iCompanyService.insertcompany(company);
    }

    @GetMapping(value = "/selectCompany")
    @ResponseBody
    public JSON selectCompany() {
        List<Company> list = iCompanyService.findAll();
        JSONObject json = new JSONObject();
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        return json;
    }


//在companymsg
    @GetMapping(value = "/selectCompanyByUserName")
    @ResponseBody
    public JSON selectCompanyByUserName(HttpServletRequest request, @RequestParam("username") String username) {
        Company company = iCompanyService.selectCompanyByUserName(username);
        List<Company> list = new ArrayList<Company>();
        list.add(company);
        JSONObject json = new JSONObject();
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        return json;
    }



}
