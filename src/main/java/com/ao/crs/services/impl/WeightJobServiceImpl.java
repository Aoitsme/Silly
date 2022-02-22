package com.ao.crs.services.impl;

import com.ao.crs.dao.JobMapper;
import com.ao.crs.dao.UserMapper;
import com.ao.crs.dao.WeightjobMapper;
import com.ao.crs.pojo.Job;
import com.ao.crs.pojo.Weightjob;
import com.ao.crs.services.IWeightJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class WeightJobServiceImpl implements IWeightJobService {

    @Autowired
    private WeightjobMapper weightjobMapper;
    @Autowired
    private JobMapper jobMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public int addWeightJob(Weightjob weightjob) {
        //根据weightjob中的jobId查出对应的jobname重新封装进weightjob
        String jobname = jobMapper.selectByPrimaryKey(weightjob.getJobId()).getJobName();
        weightjob.setJobName(jobname);
        weightjobMapper.insert(weightjob);
        return 1;
    }

    @Override
    public int deleteWeightJob(Integer weightjobId) {

        return  weightjobMapper.deleteByPrimaryKey(weightjobId);
    }

    @Override
    public int updataWeightJob(Weightjob weightjob) {
        String jobName = jobMapper.selectByPrimaryKey(weightjob.getJobId()).getJobName();
        weightjob.setJobName(jobName);
        weightjobMapper.updateByPrimaryKey(weightjob);
        return 0;
    }

    @Override
    public List<Weightjob> selectWeightJobByJobId(Integer jobId) {
       List<Weightjob>  list  =  weightjobMapper.selectByJobId(jobId);
        return list;
    }

    @Override
    public List<Weightjob> selectWeightJobByweightjobId(Integer weightjobId) {
        List<Weightjob>  list  =  weightjobMapper.selectByweightjobId(weightjobId);
        return list;
    }

    @Override
    public Double selectValueByJobId(Integer jobId) {
        List<Weightjob> weightjobList =  weightjobMapper.selectByJobId(jobId);
        //计算Sn
        Double sumXn = 0.0;
        for (int i = 0; i < weightjobList.size(); i++) {

            sumXn += Double.parseDouble(weightjobList.get(i).getWeightvalue());
        }
        List<Double> sn = new ArrayList<Double>();

        for (int i = 0; i < weightjobList.size(); i++) {
            Weightjob weightjob = weightjobList.get(i);
            Double weightValue = Double.parseDouble(weightjob.getWeightvalue());
            sn.add((weightValue/sumXn));
        }

        //计算综合价值value
        Double sumSn =0.0;
        Double finalValue =0.0;
        for (int i = 0; i < sn.size(); i++) {
            sumSn += sn.get(i);
        }
        for (int i = 0; i < sn.size(); i++) {
            finalValue = (sn.get(i)/sumSn)*1000;
        }

        //若引入求职者sn则修改
//        for (int i = 0; i < sn.size(); i++) {
//            finalValue += (sn.get(i)*(userMapper.selectValue())/sumSn)*1000;
//        }
        return finalValue;
    }
}
