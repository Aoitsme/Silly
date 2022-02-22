package com.ao.crs.pojo;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Component;

@Component
public class User {
    private Integer userId;

    private Long phonenumber;

    private String username;

    private String email;

    private String password;

    private Boolean valid;

    private Integer authorityId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Integer getAuthorityId() {
        return authorityId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", phonenumber=" + phonenumber +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", valid=" + valid +
                ", authorityId=" + authorityId +
                '}';
    }

    public void setAuthorityId(Integer authorityId) {
        this.authorityId = authorityId;
    }

//    @Override
//    public String toString() {
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("userName", username);
//        jsonObject.put("age", age);
//        if (sex == 1) {
//            jsonObject.put("sex", "男");
//        } else {
//            jsonObject.put("sex", "女");
//        }
//        jsonObject.put("email", email);
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
//        jsonObject.put("createTime", ft.format(createTime));
//        return jsonObject.toString();
//    }
}