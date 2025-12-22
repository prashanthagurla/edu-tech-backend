package com.ap.edu_tech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.edu_tech.dto.TeacherDTO;
import com.ap.edu_tech.model.TeacherModel;
import com.ap.edu_tech.service.AdminService;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
	
	private AdminService adminService;
	
	@PostMapping("/add-teacher")
	public ResponseEntity<TeacherModel> addTeacher(TeacherDTO teacherDTO){
		TeacherModel teacher = adminService.saveTeacher(teacherDTO);
		return ResponseEntity.ok(teacher);
	}
	

}
