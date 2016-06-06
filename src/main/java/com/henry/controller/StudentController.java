package com.henry.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.henry.entity.Score;
import com.henry.entity.Student;

@Controller
public class StudentController {
	@RequestMapping("/hello")
	@ResponseBody
	public Student hello() {
		List<Score> scores = new ArrayList<>();
		scores.add(new Score(1, 17, "math", new Student(1, "henry", null, scores)));
		scores.add(new Score(2, 17, "math", new Student(1, "henry", null, null)));
		scores.add(new Score(3, 17, "math", new Student(1, "henry", null, null)));
		scores.add(new Score(4, 17, "math", new Student(1, "henry", null, null)));
		scores.add(new Score(5, 17, "math", new Student(1, "henry", null, scores)));
		Student student = new Student(1, "henry", null, scores);
		return student;
	}
}
