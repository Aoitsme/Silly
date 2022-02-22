package com.ao.crs.services;

import com.ao.crs.pojo.Company;
import com.ao.crs.pojo.User;

import java.util.List;


public interface IUserService {

    /**
     * 用户注册
     */
    void userregister(User user);
    /*
    用户是否存在
     */
      boolean hasUserName(User record);
    // 查询所有用户
     List<User> findAll();

    // 根据authority查询求职者
     List<User> findbyauthority();


    User selectUserByUserName(String username);


    // 根据id查询用户
     User findById(String userId);







    // 根据id删除用户
    public void deleteById(Integer uid);

    // 修改
    public void updateUser(Integer uid, User user);


    public void saveResume(User user);
}
