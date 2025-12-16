package com.ap.edu_tech.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.edu_tech.model.StudentModel;
import com.ap.edu_tech.repository.StudentRepository;
import com.ap.edu_tech.service.StudentService;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins  = "*")
public class StudentController {
	
	private StudentRepository studentRepository;
	private StudentService studentService;
	
	
	public StudentController(StudentRepository studentRepository,StudentService studentService) {
		super();
		this.studentRepository = studentRepository;
		this.studentService = studentService;
	}

    //get employee rest api
	@GetMapping("/get")
	public List<StudentModel> getStudents(){
		return studentRepository.findAll();
		
	}
	// create employee rest api
	@PostMapping("/add")
	public ResponseEntity<StudentModel> addEmployee(@RequestBody StudentModel student) {
		
		StudentModel saved = studentService.addEmployee(student);
		return ResponseEntity.ok(saved);

		
	}
	
	
	

}
