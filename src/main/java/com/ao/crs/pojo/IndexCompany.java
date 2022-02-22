package com.ao.crs.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class IndexCompany {

    private String companyName;

    private String jobName;

    private Double value;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

}
