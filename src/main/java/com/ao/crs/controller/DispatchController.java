package com.ao.crs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DispatchController {

    @GetMapping(value = "/")
    public String index(){
        return "/index";
    }

    @GetMapping(value = "/test")
    public String test(){
        return "/test";
    }


    @GetMapping(value = "/register")
    public String register(){
        return "/register";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "/login";
    }

    @GetMapping(value = " /error/403")
    public String  page404(){
        return "/error/403";
    }


    /**
     *企业相关跳转
     */
//    企业后台布局
    @GetMapping(value = "/company/companybackend")
    public String companybackend(){
        return "company/companybackend";
    }
    //    企业后台首页
    @GetMapping(value = "company/companymain")
    public String companymain(){
        return "company/companymain";
    }
//    企业信息管理
    @GetMapping(value = "/company/companymsg")
    public String companymsg(){
        return "company/companymsg";
    }
//    岗位信息管理
    @GetMapping(value = "/company/jobmsg")
    public String jobmsg(){
        return "company/jobmsg";
    }

    @GetMapping(value = "/company/table/add")
    public String companytableadd(){
        return "/company/table/add";
    }
    @GetMapping(value = "/company/table/edit")
    public String companytableedit(){
        return "/company/table/edit";
    }
    @GetMapping(value = "/company/table/weightadd")
    public String companytableweightadd(){
        return "/company/table/weightadd";
    }
    @GetMapping(value = "/company/table/weightedit")
    public String companytableweightedit(){
        return "/company/table/weightedit";
    }
    @GetMapping(value = "/company/table/resumeadd")
    public String companytableresumeadd(){
        return "/company/table/resumeadd";
    }
    @GetMapping(value = "/company/table/resumeedit")
    public String companytableresumetedit(){
        return "/company/table/resumeedit";
    }
    @GetMapping(value = "/company/table/emailtouser")
    public String companytableemailtouser(){
        return "/company/table/emailtouser";
    }


    //    权重信息管理
    @GetMapping(value = "/company/weightmsg")
    public String weightmsg(){
        return "company/weightmsg";
    }
    //    新权重信息管理
    @GetMapping(value = "/company/newweightmsg")
    public String newweightmsg(){
        return "company/newweightmsg";
    }
//    简历查看
    @GetMapping(value = "/company/resumequery")
    public String resumequery(){
        return "company/resumequery";
    }

    /**
     *求职者相关跳转
     */
    @GetMapping(value = "/user/userbackend")
    public String userbackend(){
        return "/user/userbackend";
    }
    @GetMapping(value = "/user/usermain")
    public String userusermain(){
        return "/user/usermain";
    }

    @GetMapping(value = "/user/resumemsg")
    public String resumemsg(){
        return "user/resumemsg";
    }
    @GetMapping(value = "/user/usermsg")
    public String usermsg(){
        return "user/usermsg";
    }

    @GetMapping(value = "/user/comprecommend")
    public String comprecommend(){
        return "user/comprecommend";
    }

    @GetMapping(value = "/user/resumedelivery")
    public String resumedelivery(){
        return "user/resumedelivery";
    }

/*
管理员相关
 */
@GetMapping(value = "/admin/adminbackend")
public String adminbackend(){
    return "/admin/adminbackend";
}
    //    管理员后台首页
    @GetMapping(value = "/admin/adminmain")
    public String adminmain(){
        return "/admin/adminmain";
    }

    @GetMapping(value = "/admin/usermsg")
    public String adminusermsg(){
        return "/admin/usermsg";
    }






}
