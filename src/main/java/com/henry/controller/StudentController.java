package com.henry.controller;


import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.henry.entity.Student;
import com.henry.service.StudentService;

@Controller
public class StudentController {
	
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
	
	@RequestMapping("/addUser")
	public String addUser(Student student) {
		studentService.insert(student);
		return "redirect:/listStudent";
	}
}
