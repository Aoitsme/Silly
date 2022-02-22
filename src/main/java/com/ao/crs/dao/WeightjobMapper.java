package com.ao.crs.dao;

import com.ao.crs.pojo.Weightjob;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WeightjobMapper {
    int deleteByPrimaryKey(Integer weightjobId);

    int insert(Weightjob record);

    int insertSelective(Weightjob record);

    Weightjob selectByPrimaryKey(Integer weightjobId);

    int updateByPrimaryKeySelective(Weightjob record);

    int updateByPrimaryKey(Weightjob record);


    List<Weightjob> selectByJobId(Integer jobId);

    List<Weightjob> selectByweightjobId(Integer weightjobId);



}