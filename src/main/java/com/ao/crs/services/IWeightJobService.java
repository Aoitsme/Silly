package com.ao.crs.services;

import com.ao.crs.pojo.Weightjob;

import java.util.List;

public interface IWeightJobService {

    int addWeightJob(Weightjob weightjob);

    int deleteWeightJob(Integer weightjobId);

    int updataWeightJob(Weightjob weightjob);

    List<Weightjob> selectWeightJobByJobId(Integer jobId);

    List<Weightjob> selectWeightJobByweightjobId(Integer weightjobId);

    Double  selectValueByJobId(Integer jobId);

}
