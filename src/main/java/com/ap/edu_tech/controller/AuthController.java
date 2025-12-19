package com.ap.edu_tech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ap.edu_tech.model.Users;
import com.ap.edu_tech.service.UsersService;

@RestController("/api/auth")
public class AuthController {
	private UsersService usersService;
	
	

	public AuthController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}



	@PostMapping("/signUp")
	public ResponseEntity<String> signUp(@RequestBody Users newUser) {
		Users savedUser = usersService.signUp(newUser);

		return null;

	}

}
