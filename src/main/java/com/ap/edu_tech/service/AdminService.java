package com.ap.edu_tech.service;

import org.springframework.stereotype.Service;

import com.ap.edu_tech.dto.TeacherDTO;
import com.ap.edu_tech.model.TeacherModel;
import com.ap.edu_tech.repository.TeacherRepository;

@Service
public class AdminService {
	
	private TeacherRepository teacherRepository;
	
	
	public TeacherModel saveTeacher(TeacherDTO teacherDTO) {
		
		TeacherModel newTeacher = new TeacherModel();
		newTeacher.setName(teacherDTO.getName());
		newTeacher.setAge(teacherDTO.getAge());
		newTeacher.setSubject(teacherDTO.getSubject());
		TeacherModel result = teacherRepository.save(newTeacher);
		
		
		return result;
		
	}

}
