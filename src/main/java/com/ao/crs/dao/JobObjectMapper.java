package com.ao.crs.dao;

import com.ao.crs.pojo.JobObject;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JobObjectMapper {
    int deleteByPrimaryKey(Integer jobobjectId);

    int insert(JobObject record);

    int insertSelective(JobObject record);

    JobObject selectByPrimaryKey(Integer jobobjectId);

    int updateByPrimaryKeySelective(JobObject record);

    int updateByPrimaryKey(JobObject record);
}