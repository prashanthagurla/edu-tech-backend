package com.ap.edu_tech.service;

import org.springframework.stereotype.Service;

import com.ap.edu_tech.model.Users;
import com.ap.edu_tech.repository.UsersRepository;

@Service
public class UsersService {
	private UsersRepository usersRepository;

	public UsersService(UsersRepository usersRepository) {
		super();
		this.usersRepository = usersRepository;
	}
	
	public Users signUp(Users newUser) {
		Users savedUser = usersRepository.save(newUser);
		
		return savedUser;
	}

}
