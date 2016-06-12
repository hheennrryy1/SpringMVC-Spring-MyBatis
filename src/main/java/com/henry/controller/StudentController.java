package com.henry.controller;


import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.henry.entity.Student;
import com.henry.service.StudentService;

@Controller
public class StudentController {
	
	Logger logger = Logger.getLogger(StudentController.class);
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/listStudent")
	public ModelAndView listUser(ModelAndView mav) {
		mav.setViewName("listStudent");
		List<Student> list = studentService.getAll();
		mav.addObject("studentList", list);
		return mav;
	}
	
	@RequestMapping("/input")
	public String input() {
		return "input";
	}
	
	@RequestMapping("/addStudent")
	public String addStudent(Student student) {
		logger.info(student.getBirthday());
		studentService.insert(student);
		return "redirect:/listStudent";
	}
	
	@RequestMapping(value="/deleteStudent")
	public String deleteStudent(Integer id) {
		studentService.delete(id);
		return "redirect:/listStudent";
	}
	
	@RequestMapping(value="/updateStudentUI")
	public ModelAndView updateUserUI(Integer id, ModelAndView mav) {
		mav.setViewName("updateStudent");
		Student student = studentService.selectByPrimaryKey(id);
		mav.addObject("student", student);
		return mav;
	}
	
	@RequestMapping(value="/updateStudent")
	public String updateStudent(Student student) {
		studentService.updateByPrimaryKeySelective(student);
		return "redirect:/listStudent";
	}
}
