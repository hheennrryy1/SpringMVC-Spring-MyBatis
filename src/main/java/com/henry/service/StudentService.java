package com.henry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henry.dao.StudentMapper;
import com.henry.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentMapper mapper;
	
	public void insert(Student student) {
		mapper.insert(student);
	}
	
	public List<Student> getAll() {
		return mapper.getAll();
	}
	
	public List<Student> getStudentAndScore() {
		return mapper.getStudentAndScore();
	}
	
	public void delete(Integer id) {
		mapper.deleteByPrimaryKey(id);
	}
	
	public Student selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}
	
	public void updateByPrimaryKeySelective(Student student) {
		mapper.updateByPrimaryKeySelective(student);
	}
}
