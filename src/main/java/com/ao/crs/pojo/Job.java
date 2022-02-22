package com.ao.crs.pojo;

import org.springframework.stereotype.Component;

@Component
public class Job {
    private Integer jobId;

    private Integer companyId;

    private String jobName;

    private String jobTime;

    private Integer perNum;

    private String jobPlace;

    private String jobRequire;

    private String reqeduType;

    private String reqworkLife;

    private String reqexpSalary;

    private String reqworkProvince;

    private String reqworkCity;

    private String reqproType;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }

    public String getJobTime() {
        return jobTime;
    }

    public void setJobTime(String jobTime) {
        this.jobTime = jobTime == null ? null : jobTime.trim();
    }

    public Integer getPerNum() {
        return perNum;
    }

    public void setPerNum(Integer perNum) {
        this.perNum = perNum;
    }

    public String getJobPlace() {
        return jobPlace;
    }

    public void setJobPlace(String jobPlace) {
        this.jobPlace = jobPlace == null ? null : jobPlace.trim();
    }

    public String getJobRequire() {
        return jobRequire;
    }

    public void setJobRequire(String jobRequire) {
        this.jobRequire = jobRequire == null ? null : jobRequire.trim();
    }

    public String getReqeduType() {
        return reqeduType;
    }

    public void setReqeduType(String reqeduType) {
        this.reqeduType = reqeduType == null ? null : reqeduType.trim();
    }

    public String getReqworkLife() {
        return reqworkLife;
    }

    public void setReqworkLife(String reqworkLife) {
        this.reqworkLife = reqworkLife == null ? null : reqworkLife.trim();
    }

    public String getReqexpSalary() {
        return reqexpSalary;
    }

    public void setReqexpSalary(String reqexpSalary) {
        this.reqexpSalary = reqexpSalary == null ? null : reqexpSalary.trim();
    }

    public String getReqworkProvince() {
        return reqworkProvince;
    }

    public void setReqworkProvince(String reqworkProvince) {
        this.reqworkProvince = reqworkProvince == null ? null : reqworkProvince.trim();
    }

    public String getReqworkCity() {
        return reqworkCity;
    }

    public void setReqworkCity(String reqworkCity) {
        this.reqworkCity = reqworkCity == null ? null : reqworkCity.trim();
    }

    public String getReqproType() {
        return reqproType;
    }

    public void setReqproType(String reqproType) {
        this.reqproType = reqproType == null ? null : reqproType.trim();
    }
}