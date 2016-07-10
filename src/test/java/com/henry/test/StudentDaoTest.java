package com.henry.test;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.henry.dao.StudentMapper;
import com.henry.entity.Student;
import com.henry.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:Spring.xml", "classpath:Spring-Mybatis.xml"})
public class StudentDaoTest {
	
	Logger logger = Logger.getLogger(StudentDaoTest.class);
	
	@Autowired
	private StudentService service;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Autowired
	StudentMapper mapper;
	
	@Test
	@Ignore
	public void insert() {
		SqlSession session = sqlSessionFactory.openSession();
		Student student = new Student(5, "ry", new Date());
		mapper.insert(student);
		session.commit();
		session.close();
	}
	
	@Test
	public void select() {
		SqlSession session = sqlSessionFactory.openSession();
		Student student = mapper.selectByPrimaryKey(new Integer(1));
		System.out.println(student.getName());
		session.commit();
		session.close();
	}
	
	@Test
	@Ignore
	public void update() {
		SqlSession session = sqlSessionFactory.openSession();
		Student student = new Student(1, "frank", null);
		mapper.updateByPrimaryKeySelective(student);
		session.commit();
		session.close();
	}
	
	@Test
	@Ignore
	public void getStudentAndScore() {
		SqlSession session = sqlSessionFactory.openSession();
		List<Student> list = mapper.getStudentAndScore();
		System.out.println(list.get(0).getScores().get(1).getSubject());
		session.commit();
		session.close();
	}
}
