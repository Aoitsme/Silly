package com.ao.crs.services.impl;

import com.ao.crs.dao.JobMapper;
import com.ao.crs.pojo.Job;
import com.ao.crs.services.IJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class JobServiceImpl implements IJobService {

    @Autowired
    private JobMapper jobMapper;


    @Override
    public void addjob(Job job) {
        jobMapper.insert(job);
    }

    @Override
    public void deletejob(Job job) {
        jobMapper.deleteByPrimaryKey(job.getJobId());
    }

    @Override
    public void updatejob(Job job) {
        String jobname = SecurityContextHolder.getContext().getAuthentication().getName();
        jobMapper.updateByPrimaryKeySelective(job);
    }

    @Override
    public List<Job> selectJobByCompanyId(Integer companyId) {
        return jobMapper.selectJobByCompanyId(companyId);
    }

    @Override
    public List<Job> findAll() {
        return jobMapper.findAll();
    }
}
