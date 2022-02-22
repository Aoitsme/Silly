package com.ao.crs.dao;

import com.ao.crs.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    // 根据authority查询求职者
    List<User> findbyauthority(Integer authorityId);



    User selectByUserName(String record);

    List<User> findAll();
}