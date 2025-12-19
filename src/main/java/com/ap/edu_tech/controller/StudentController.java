package com.ap.edu_tech.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    //get student rest api
	@GetMapping("/get")
	public List<StudentModel> getStudents(){
		return studentRepository.findAll();
		
	}
	// create student rest api
	@PostMapping("/add")
	public ResponseEntity<StudentModel> addStudent(@RequestBody StudentModel student) {
		
		StudentModel saved = studentService.addEmployee(student);
		return ResponseEntity.ok(saved);

		
	}
	//get student by id
	@GetMapping("/getById/{id}")
	public ResponseEntity<StudentModel> getStudentById( @PathVariable("id") Long id){
		StudentModel result = studentService.findStudentById(id);
		return ResponseEntity.ok(result);
		
	}
	//update student by id
	@PutMapping("/update/{id}")
	public ResponseEntity<StudentModel> updateStudent(@PathVariable Long id,@RequestBody StudentModel student){
		System.out.println("hello!!!");
		StudentModel updatedStudent = studentService.updateStudnet(id,student);
		return ResponseEntity.ok(updatedStudent);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable Long id){
		System.out.println("hello!!!");
		String result = studentService.deleteStudnet(id);
		return ResponseEntity.ok(Map.of("message", result));

	}

	
	
	

}
