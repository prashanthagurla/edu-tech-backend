package com.ap.edu_tech.service;

import org.springframework.stereotype.Service;

import com.ap.edu_tech.model.StudentModel;
import com.ap.edu_tech.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentRepository;
	
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	public StudentModel addEmployee(StudentModel  student) {
		return studentRepository.save(student);
		
		 
		// TODO Auto-generated method stub
		
	}
	

}
