package com.ao.crs.pojo;

public class Weight {
    private Integer weightId;

    private Integer jobobjectId;

    private Integer jobId;

    private String jobName;

    private Integer perNum;

    private String genderNeeds;

    private String ageNeeds;

    private String marriageNeeds;

    private String statusNeeds;

    private String eduNeeds;

    private Double edudegWeight;

    private Double workyearWeight;

    private Double expsalaryWeight;

    private Double workplaceWeight;

    private Double majorWeight;

    public Integer getWeightId() {
        return weightId;
    }

    public void setWeightId(Integer weightId) {
        this.weightId = weightId;
    }

    public Integer getJobobjectId() {
        return jobobjectId;
    }

    public void setJobobjectId(Integer jobobjectId) {
        this.jobobjectId = jobobjectId;
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
        this.jobName = jobName;
    }

    public Integer getPerNum() {
        return perNum;
    }

    public void setPerNum(Integer perNum) {
        this.perNum = perNum;
    }

    public String getGenderNeeds() {
        return genderNeeds;
    }

    public void setGenderNeeds(String genderNeeds) {
        this.genderNeeds = genderNeeds == null ? null : genderNeeds.trim();
    }

    public String getAgeNeeds() {
        return ageNeeds;
    }

    public void setAgeNeeds(String ageNeeds) {
        this.ageNeeds = ageNeeds == null ? null : ageNeeds.trim();
    }

    public String getMarriageNeeds() {
        return marriageNeeds;
    }

    public void setMarriageNeeds(String marriageNeeds) {
        this.marriageNeeds = marriageNeeds == null ? null : marriageNeeds.trim();
    }

    public String getStatusNeeds() {
        return statusNeeds;
    }

    public void setStatusNeeds(String statusNeeds) {
        this.statusNeeds = statusNeeds == null ? null : statusNeeds.trim();
    }

    public String getEduNeeds() {
        return eduNeeds;
    }

    public void setEduNeeds(String eduNeeds) {
        this.eduNeeds = eduNeeds == null ? null : eduNeeds.trim();
    }

    public Double getEdudegWeight() {
        return edudegWeight;
    }

    public void setEdudegWeight(Double edudegWeight) {
        this.edudegWeight = edudegWeight;
    }

    public Double getWorkyearWeight() {
        return workyearWeight;
    }

    public void setWorkyearWeight(Double workyearWeight) {
        this.workyearWeight = workyearWeight;
    }

    public Double getExpsalaryWeight() {
        return expsalaryWeight;
    }

    public void setExpsalaryWeight(Double expsalaryWeight) {
        this.expsalaryWeight = expsalaryWeight;
    }

    public Double getWorkplaceWeight() {
        return workplaceWeight;
    }

    public void setWorkplaceWeight(Double workplaceWeight) {
        this.workplaceWeight = workplaceWeight;
    }

    public Double getMajorWeight() {
        return majorWeight;
    }

    public void setMajorWeight(Double majorWeight) {
        this.majorWeight = majorWeight;
    }
}