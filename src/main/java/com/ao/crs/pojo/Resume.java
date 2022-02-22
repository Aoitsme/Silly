package com.ao.crs.pojo;

import org.springframework.stereotype.Component;

@Component
public class Resume {
    private Integer resumeId;

    private Integer userId;

    private Long idNumber;

    private String username;

    private String sexy;

    private String birthday;

    private Integer age;

    private String nationnality;

    private String nation;

    private String politicalStatus;

    private String residence;

    private String householdProvince;

    private String householdCity;

    private String academicDegree;

    private String educationType;

    private String graduationTime;

    private String major;

    private String school;

    private Long phonenumber;

    private String email;

    private String workingLife;

    private String profession;

    private String photoAddress;

    private String expectedPlace;

    private String expectedFunction;

    private String expectedSalary;

    private String timeToWork;

    private String introduce;

    private String createTime;

    private Boolean status;

    public Integer getResumeId() {
        return resumeId;
    }

    public void setResumeId(Integer resumeId) {
        this.resumeId = resumeId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Long idNumber) {
        this.idNumber = idNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSexy() {
        return sexy;
    }

    public void setSexy(String sexy) {
        this.sexy = sexy == null ? null : sexy.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getNationnality() {
        return nationnality;
    }

    public void setNationnality(String nationnality) {
        this.nationnality = nationnality == null ? null : nationnality.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus == null ? null : politicalStatus.trim();
    }

    public String getResidence() {
        return residence;
    }

    public void setResidence(String residence) {
        this.residence = residence == null ? null : residence.trim();
    }

    public String getHouseholdProvince() {
        return householdProvince;
    }

    public void setHouseholdProvince(String householdProvince) {
        this.householdProvince = householdProvince == null ? null : householdProvince.trim();
    }

    public String getHouseholdCity() {
        return householdCity;
    }

    public void setHouseholdCity(String householdCity) {
        this.householdCity = householdCity == null ? null : householdCity.trim();
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree == null ? null : academicDegree.trim();
    }

    public String getEducationType() {
        return educationType;
    }

    public void setEducationType(String educationType) {
        this.educationType = educationType == null ? null : educationType.trim();
    }

    public String getGraduationTime() {
        return graduationTime;
    }

    public void setGraduationTime(String graduationTime) {
        this.graduationTime = graduationTime == null ? null : graduationTime.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getWorkingLife() {
        return workingLife;
    }

    public void setWorkingLife(String workingLife) {
        this.workingLife = workingLife == null ? null : workingLife.trim();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession == null ? null : profession.trim();
    }

    public String getPhotoAddress() {
        return photoAddress;
    }

    public void setPhotoAddress(String photoAddress) {
        this.photoAddress = photoAddress == null ? null : photoAddress.trim();
    }

    public String getExpectedPlace() {
        return expectedPlace;
    }

    public void setExpectedPlace(String expectedPlace) {
        this.expectedPlace = expectedPlace == null ? null : expectedPlace.trim();
    }

    public String getExpectedFunction() {
        return expectedFunction;
    }

    public void setExpectedFunction(String expectedFunction) {
        this.expectedFunction = expectedFunction == null ? null : expectedFunction.trim();
    }

    public String getExpectedSalary() {
        return expectedSalary;
    }

    public void setExpectedSalary(String expectedSalary) {
        this.expectedSalary = expectedSalary == null ? null : expectedSalary.trim();
    }

    public String getTimeToWork() {
        return timeToWork;
    }

    public void setTimeToWork(String timeToWork) {
        this.timeToWork = timeToWork == null ? null : timeToWork.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Resume{" +
                "resumeId=" + resumeId +
                ", userId=" + userId +
                ", idNumber=" + idNumber +
                ", username='" + username + '\'' +
                ", sexy='" + sexy + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                ", nationnality='" + nationnality + '\'' +
                ", nation='" + nation + '\'' +
                ", politicalStatus='" + politicalStatus + '\'' +
                ", residence='" + residence + '\'' +
                ", householdProvince='" + householdProvince + '\'' +
                ", householdCity='" + householdCity + '\'' +
                ", academicDegree='" + academicDegree + '\'' +
                ", educationType='" + educationType + '\'' +
                ", graduationTime='" + graduationTime + '\'' +
                ", major='" + major + '\'' +
                ", school='" + school + '\'' +
                ", phonenumber=" + phonenumber +
                ", email='" + email + '\'' +
                ", workingLife='" + workingLife + '\'' +
                ", profession='" + profession + '\'' +
                ", photoAddress='" + photoAddress + '\'' +
                ", expectedPlace='" + expectedPlace + '\'' +
                ", expectedFunction='" + expectedFunction + '\'' +
                ", expectedSalary='" + expectedSalary + '\'' +
                ", timeToWork='" + timeToWork + '\'' +
                ", introduce='" + introduce + '\'' +
                ", createTime='" + createTime + '\'' +
                ", status=" + status +
                '}';
    }
}