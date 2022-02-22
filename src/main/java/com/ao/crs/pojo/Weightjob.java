package com.ao.crs.pojo;

import org.springframework.stereotype.Component;

@Component
public class Weightjob {
    private Integer weightjobId;

    private Integer jobId;

    private String jobName;

    private String weightitem;

    private String weightvalue;

    public Integer getWeightjobId() {
        return weightjobId;
    }

    public void setWeightjobId(Integer weightjobId) {
        this.weightjobId = weightjobId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getWeightitem() {
        return weightitem;
    }

    public void setWeightitem(String weightitem) {
        this.weightitem = weightitem == null ? null : weightitem.trim();
    }

    public String getWeightvalue() {
        return weightvalue;
    }

    public void setWeightvalue(String weightvalue) {
        this.weightvalue = weightvalue == null ? null : weightvalue.trim();
    }

    @Override
    public String toString() {
        return "Weightjob{" +
                "weightjobId=" + weightjobId +
                ", jobId=" + jobId +
                ", jobName='" + jobName + '\'' +
                ", weightitem='" + weightitem + '\'' +
                ", weightvalue='" + weightvalue + '\'' +
                '}';
    }
}