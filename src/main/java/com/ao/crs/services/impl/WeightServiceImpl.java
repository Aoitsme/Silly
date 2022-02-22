package com.ao.crs.services.impl;

import com.ao.crs.dao.WeightMapper;
import com.ao.crs.pojo.Weight;
import com.ao.crs.services.IWeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WeightServiceImpl implements IWeightService {

@Autowired
private WeightMapper weightMapper;

    @Override
    public Weight findWeightByJobId(String jobId) {

        Integer intjobId = Integer.valueOf(jobId);
        Weight list= weightMapper.findWeightByJobId(intjobId);
        return list;

    }

    @Override
    public void deleteWeightByJobId(String jobId) {

    }

    @Override
    public Weight editWeightByJobId(String jobId) {
        Weight weight =new Weight();
        weight.setJobId( Integer.valueOf(jobId));
        weightMapper.updateByPrimaryKey(weight);
        return weight;
    }



    @Override
    public void addWeightByJobId(String jobId,String weighttype,String weightvalue) {
        weightMapper.addWeightType(jobId,weighttype,weightvalue);
    }
}
