package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Student;

@RestController // @Controller + @ResponseBody
@RequestMapping("/students")
public class StudentController {
	public StudentController() {
		System.out.println("in ctor of " + getClass());
	}

	// add REST end point to return list of students
	@GetMapping
	public List<Student> getAllStudents()
	{
		List<Student> students=List.of(new Student(10, "s1", "java"),
				new Student(20, "s2", "DBT"),new Student(30, "s3", "JS"));
		return students;
	}
}
