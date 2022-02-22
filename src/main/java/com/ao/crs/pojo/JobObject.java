package com.ao.crs.pojo;

import org.springframework.stereotype.Component;

@Component
public class JobObject {
    private Integer jobobjectId;

    private Integer resumeId;

    private String expectedJob;

    private Byte status;

    private Double value;


    public Integer getJobobjectId() {
        return jobobjectId;
    }

    public void setJobobjectId(Integer jobobjectId) {
        this.jobobjectId = jobobjectId;
    }

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public String getExpectedJob() {
        return expectedJob;
    }

    public void setExpectedJob(String expectedJob) {
        this.expectedJob = expectedJob == null ? null : expectedJob.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}