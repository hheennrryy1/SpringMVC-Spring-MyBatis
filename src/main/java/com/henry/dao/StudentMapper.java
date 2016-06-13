package com.henry.dao;

import java.util.List;

import com.henry.entity.Student;

public interface StudentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);
    
    List<Student> getAll();
    
    List<Student> getStudentAndScore();
    
    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}