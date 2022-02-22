package com.ao.crs.pojo;

public class Authority {

    private Integer id;

    private String authority;

    private String authorityName;



    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority == null ? null : authority.trim();
    }

    public String getAuthorityName() {
        return authorityName;
    }

    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName == null ? null : authorityName.trim();
    }
}