package com.ao.crs.services.impl;

import com.ao.crs.dao.CompanyMapper;
import com.ao.crs.pojo.Company;
import com.ao.crs.services.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CompanyServiceImpl implements ICompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public void insertcompany(Company company) {
        companyMapper.insert(company);
    }

    @Override
    public void deletecompany(Company company) {

    }

    @Override
    public boolean updatecompany(Company record) {
        //根据用户名获取companyid后更新记录
        record.setCompanyId(companyMapper.selectByUserName(record.getUsername()).getCompanyId()) ;
        companyMapper.updateByPrimaryKey(record);
        return true;
    }


    @Override
    public List<Company> findAll() {

        return companyMapper.findAll();
    }

    @Override
    public Company selectCompanyByUserName(String username) {
        //根据username查询company
        Company company =  companyMapper.selectByUserName(username);
        return company;
    }


}
