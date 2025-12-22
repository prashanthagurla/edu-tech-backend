package com.ap.edu_tech.service;

import com.ap.edu_tech.dto.authDTO;
import com.ap.edu_tech.model.RoleModel;
import com.ap.edu_tech.repository.RoleRepository;
import org.springframework.stereotype.Service;

import com.ap.edu_tech.model.Users;
import com.ap.edu_tech.repository.UsersRepository;

import java.util.Set;

@Service
public class UsersService {
	private UsersRepository usersRepository;
	private RoleRepository roleRepository;

	public UsersService(UsersRepository usersRepository, RoleRepository roleRepository) {
		this.usersRepository = usersRepository;
		this.roleRepository = roleRepository;
	}

	public Users signUp(authDTO userDTO) {

		Users newUser = new Users();
		newUser.setFullName(userDTO.getFullName());
		newUser.setEmail(userDTO.getEmail());
		newUser.setPassword(userDTO.getPassword());
		newUser.setConfirmPassword(userDTO.getConfirmPassword());
		String roleName = userDTO.getRole();
		RoleModel role = roleRepository.findByName(roleName);
		newUser.setRole(Set.of(role));

		Users savedUser = usersRepository.save(newUser);
		
		return savedUser;
	}

}
