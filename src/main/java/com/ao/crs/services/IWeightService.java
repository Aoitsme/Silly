package com.ao.crs.services;


import com.ao.crs.pojo.Weight;

import java.util.List;

public interface IWeightService {

    Weight findWeightByJobId(String jobId);

    void deleteWeightByJobId(String jobId);

    Weight editWeightByJobId(String jobId);


    //数据库表设计失误 此方法需要更改字段名
    void addWeightByJobId(String jobId,String weighttype,String weightvalue);
}
