package com.ao.crs.services.impl;

import com.ao.crs.dao.ResumeMapper;
import com.ao.crs.pojo.Resume;
import com.ao.crs.services.IResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResumeServiceImpl implements IResumeService{

    @Autowired
    private ResumeMapper resumeMapper;
    @Override
    public void addresume(Resume resume) {
        resumeMapper.insert(resume);
    }

    @Override
    public void deleteresume(Resume resume) {
        resumeMapper.deleteByPrimaryKey(resume.getResumeId());
    }

    @Override
    public void updateresume(Resume resume) {

        resumeMapper.updateByPrimaryKeySelective(resume);
    }

    @Override
    public List<Resume> findAll() {
        return resumeMapper.findAll();
    }
}
