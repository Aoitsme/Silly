package com.ao.crs.services.impl;


import com.ao.crs.dao.UserMapper;
import com.ao.crs.pojo.Company;
import com.ao.crs.pojo.User;
import com.ao.crs.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /*
求职者注册 判断是否存在用户名
 */
    @Override
    public boolean hasUserName(User record) {
        User user = userMapper.selectByUserName(record.getUsername());
        if (user!=null){
            return true;
        }else
        {
            return false;
        }
    }
    /*
    求职者注册
     */
    @Override
    public void userregister(User user){

        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        user.setValid(true);
        String password =encoder.encode(user.getPassword());
        user.setPassword(password);
        userMapper.insert(user);
    }


    @Override
    public List<User> findAll() {

        return userMapper.findAll();
    }

    @Override
    public List<User> findbyauthority() {

        return userMapper.findbyauthority(1);
    }


    @Override
    public User findById(String userId) {
        Integer intId = Integer.parseInt(userId);
        return  userMapper.selectByPrimaryKey(intId);
    }

//根据username查询user
    @Override
    public User selectUserByUserName(String username) {
        User user = userMapper.selectByUserName(username);
        return user;
    }

    @Override
    public void deleteById(Integer uid) {

    }
    @Override
    public void updateUser(Integer uid, User user) {

    }

    @Override
    public void saveResume(User user) {

    }

}
