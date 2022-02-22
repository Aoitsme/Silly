package com.ao.crs.services;

import com.ao.crs.pojo.Job;

import java.util.List;

public interface IJobService {

    /**
     * 添加岗位
     */
    public void addjob(Job job);

    /**
     * 删除岗位
     */
    public void deletejob(Job job);

    /**
     * 编辑岗位
     */
    public void updatejob(Job job);

//根据companyId查询job
    List<Job> selectJobByCompanyId(Integer companyId);

    /**
     * 查询所有岗位
     */
    public List<Job> findAll();

}
