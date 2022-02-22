package com.ao.crs.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ao.crs.pojo.Company;
import com.ao.crs.pojo.Resume;
import com.ao.crs.pojo.User;
import com.ao.crs.services.ICompanyService;
import com.ao.crs.services.IResumeService;
import com.ao.crs.services.IUserService;
import com.ao.crs.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ResumeController {
    @Autowired
    private IResumeService iResumeService;
    @Autowired
    private ICompanyService iCompanyService;
    @Autowired
    private MailUtils mailUtils;
    @Autowired
    private IUserService iUserService;
    @Autowired
    private  User user;

    @GetMapping(value = "/sendmail")
    @ResponseBody
    public String emailtouser(HttpServletRequest request) throws MessagingException {

        String to = request.getParameter("to");
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String smtp = request.getParameter("smtp");
        String host = request.getParameter("host");

        String sendPort = request.getParameter("sendPort");
        String accoutname = request.getParameter("accoutname");
        String userPwd = request.getParameter("userPwd");

        String username = SecurityContextHolder.getContext().getAuthentication().getName();
       Company company = iCompanyService.selectCompanyByUserName(username);
        String sendName = company.getEmail();

        System.out.println();
        mailUtils.send(to,title,content,smtp,host,sendName,sendPort,accoutname,userPwd);
        return "";
    }


    @PostMapping(value = "/deleteResume")
    @ResponseBody
    public String deleteresume(HttpServletRequest request, @RequestBody Resume resume) {
        iResumeService.deleteresume(resume);
        return "";
    }
    @PostMapping(value = "/updateResume")
    @ResponseBody
    public String updateresume(HttpServletRequest request, @RequestBody Resume resume) {
        System.out.println(resume);
        iResumeService.updateresume(resume);
        return "";
    }

    @PostMapping(value = "/addResume")
    @ResponseBody
    public String addresume(HttpServletRequest request, @RequestBody Resume resume) {
        iResumeService.addresume(resume);
        return "";
    }

    @GetMapping(value = "/selectResume")
    @ResponseBody
    public JSON selectResume() {
        List<Resume> list = iResumeService.findAll();
        JSONObject json = new JSONObject();
        json.put("code", 0);
        json.put("msg", "");
        json.put("count", list.size());
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        return json;
    }
}
