package com.ao.crs.services;

import com.ao.crs.pojo.Company;

import java.util.List;

public interface ICompanyService {
    /**
     * 添加岗位
     */
    void insertcompany(Company company);

    /**
     * 删除岗位
     */
     void deletecompany(Company company);

    /**
     * 编辑岗位
     */
     boolean updatecompany(Company company);
    /**
     * 查询所有岗位
     */
     List<Company> findAll();

    Company selectCompanyByUserName(String str);

}
