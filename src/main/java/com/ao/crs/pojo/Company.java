package com.ao.crs.pojo;

import org.springframework.stereotype.Component;

@Component
public class Company {
    private Integer companyId;

    private String companyname;

    private String address;

    private String email;

    private String leader;

    private String createtime;

    private String username;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader == null ? null : leader.trim();
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime == null ? null : createtime.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyId=" + companyId +
                ", companyname='" + companyname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", leader='" + leader + '\'' +
                ", createtime='" + createtime + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}