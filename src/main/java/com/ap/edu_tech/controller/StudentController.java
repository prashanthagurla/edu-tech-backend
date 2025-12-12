package com.ap.edu_tech.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.edu_tech.model.StudentModel;
import com.ap.edu_tech.repository.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentController {
	
	private StudentRepository studentRepository;
	
	
	public StudentController(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@GetMapping("/get")
	public List<StudentModel> getStudents(){
		return studentRepository.findAll();
		
	}
	

}
