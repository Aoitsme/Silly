package com.ao.crs.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ao.crs.pojo.Company;
import com.ao.crs.pojo.User;
import com.ao.crs.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * 求职者
 */
@Controller
public class UserController {

    @Autowired
    private IUserService iUserService;

    @PostMapping(value = "/userregister")
    @ResponseBody
    public String register(HttpServletRequest request, @RequestBody User user) {

        boolean state = iUserService.hasUserName(user);
        if (state == true) {//用户名已经存在 返回首页重新注册
            return "1";
        } else {//用户名允许注册 跳转登录界面
            iUserService.userregister(user);
            return "2";
        }
    }




    @GetMapping(value = "/selectUser")
    @ResponseBody
    public JSON selectUser() {
        List<User> list = iUserService.findAll();
        JSONObject json = new JSONObject();
        json.put("code", 0);
        json.put("msg", "");
        json.put("count", list.size());
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        System.out.println(json.toString());
        return json;
    }


    @GetMapping(value = "/selectUserByUserId")
    @ResponseBody
    public User selectUserByUserId(String userId) {
        User user = iUserService.findById(userId);
        return user;
    }

    //在usermsg
    @GetMapping(value = "/selectUserByUserName")
    @ResponseBody
    public JSON selectUserByUserName(HttpServletRequest request, @RequestParam("username") String username) {
        User user = iUserService.selectUserByUserName(username);
        System.out.println(user.toString());
        List<User> list = new ArrayList<User>();
        list.add(user);
        JSONObject json = new JSONObject();
        json.put("data", JSONArray.parseArray(JSON.toJSONString(list)));// List转json);
        return json;
    }



}
