package com.ao.crs.dao;

import com.ao.crs.pojo.Weight;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeightMapper {
    int deleteByPrimaryKey(Integer weightId);

    int insert(Weight record);

    int insertSelective(Weight record);

    Weight selectByPrimaryKey(Integer weightId);

    int updateByPrimaryKeySelective(Weight record);

    int updateByPrimaryKey(Weight record);

    Weight findWeightByJobId(Integer jobId);
    void addWeightType(String jobId,String weighttype,String weightvalue);
}