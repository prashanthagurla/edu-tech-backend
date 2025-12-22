package com.ap.edu_tech.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ap.edu_tech.dto.AuthDTO;
import com.ap.edu_tech.model.Users;
import com.ap.edu_tech.service.UsersService;

@CrossOrigin(origins = "*")
@RestController()
@RequestMapping("/api/auth")
public class AuthController {
	private UsersService usersService;	
	public AuthController(UsersService usersService) {
		super();
		this.usersService = usersService;
	}
	
	@GetMapping("/hello")
	public ResponseEntity<?> test(){
		return ResponseEntity.ok("Test Methods !");
	}
	
	@PostMapping("/signup")
	public ResponseEntity<Users> signUp(@RequestBody AuthDTO newUser) {
		Users savedUser = usersService.signUp(newUser);
		return ResponseEntity.ok(savedUser);
	}
}
