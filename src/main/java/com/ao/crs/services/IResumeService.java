package com.ao.crs.services;

import com.ao.crs.pojo.Resume;

import java.util.List;

public interface IResumeService {

  void addresume(Resume resume);


     void deleteresume(Resume resume);


     void updateresume(Resume resume) ;



   List<Resume> findAll();
}
