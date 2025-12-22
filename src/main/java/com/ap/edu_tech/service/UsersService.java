package com.ap.edu_tech.service;

import com.ap.edu_tech.dto.AuthDTO;
import com.ap.edu_tech.model.RoleModel;
import com.ap.edu_tech.repository.RoleRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ap.edu_tech.model.Users;
import com.ap.edu_tech.repository.UsersRepository;

import java.util.Set;

@Service
public class UsersService {
	private UsersRepository usersRepository;
	private RoleRepository roleRepository;
	private PasswordEncoder passwordEncoder;

	public UsersService(UsersRepository usersRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
		this.usersRepository = usersRepository;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
	}

	public Users signUp(AuthDTO userDTO) {
		
		
		System.out.println("hello ");

		Users newUser = new Users();
		newUser.setFullName(userDTO.getFullName());
		newUser.setEmail(userDTO.getEmail());
		newUser.setPassword(passwordEncoder.encode(userDTO.getPassword()));
		String roleName = userDTO.getRole();
		RoleModel role = roleRepository.findByName(roleName)
				.orElseThrow(()-> new IllegalArgumentException("Invalid role."+userDTO.getRole()));
		
		
		newUser.setRole(Set.of(role));

		Users savedUser = usersRepository.save(newUser);
		
		return savedUser;
	}

}
