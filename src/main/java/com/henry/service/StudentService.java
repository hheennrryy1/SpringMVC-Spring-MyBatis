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
}
