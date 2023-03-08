package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.dao.StudentRepository;
import com.app.pojos.Student;

@Controller
@RequestMapping("/students")
public class StudentController {
	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/list")
	public String showStudentList(Model model) {
		model.addAttribute("students", studentRepository.findAll());
		return "list";
	}

	@GetMapping("/add")
	public String showSignUpForm(Student student123) {
		//modelMap.addAttribute("student",new Student());
		return "add-student";
	}

	@PostMapping("/add")
	public String addStudent(@Valid Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "add-student";
		}
		studentRepository.save(student);
		return "redirect:/students/list";
	}

	@GetMapping("/edit")
	public String showUpdateForm(@RequestParam int id, Model model) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
		model.addAttribute("student", student);//model(Student) ---> view (Thymeleaf)
		return "update-student";
	}

	@PostMapping("/update")
	public String updateStudent(@RequestParam int id, @Valid Student student, BindingResult result) {
		if (result.hasErrors()) {
			student.setId(id);
			return "update-student";
		}
		studentRepository.save(student);

		return "redirect:/students/list";
	}

	@GetMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		Student student = studentRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid student Id:" + id));
		studentRepository.delete(student);

		return "redirect:/students/list";
	}
}
