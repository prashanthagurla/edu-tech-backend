package com.ap.edu_tech.service;



import org.springframework.stereotype.Service;

import com.ap.edu_tech.exception.ResourceNotFoundException;
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

	public StudentModel findStudentById(Long id) {
	    return studentRepository.findById(id)
	            .orElseThrow(() ->
	                    new ResourceNotFoundException("Student Not found with given Id"+id)
	            );
	}

	public StudentModel updateStudnet(Long id,StudentModel studentDetails) {
		StudentModel student = studentRepository.findById(id)
        .orElseThrow(() ->
                new ResourceNotFoundException("Student Not found with given Id"+id)
        );
		student.setFirstName(studentDetails.getFirstName());
		student.setLastName(studentDetails.getLastName());
		student.setEmailId(studentDetails.getEmailId());
		StudentModel updatedStudent =  studentRepository.save(student);
		return updatedStudent;
	}

	public String deleteStudnet(Long id) {
		StudentModel student = studentRepository.findById(id)
		        .orElseThrow(() ->
		                new ResourceNotFoundException("Student Not found with given Id"+id)
		        );
		if(student!=null) {
		    studentRepository.delete(student);
		}
		
		return "Deleted successfully";
	}

	

}
