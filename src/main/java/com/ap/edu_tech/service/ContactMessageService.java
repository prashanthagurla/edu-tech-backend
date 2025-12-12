package com.ap.edu_tech.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.ap.edu_tech.model.ContactMessage;
import com.ap.edu_tech.repository.ContactMessageRepository;

@Service
public class ContactMessageService {
	private ContactMessageRepository contactMessageRepository;

	public ContactMessageService(ContactMessageRepository contactMessageRepository) {
		super();
		this.contactMessageRepository = contactMessageRepository;
	}
	
	public Boolean saveContactMessage(ContactMessage message) {
		message.setCreatedAt(LocalDateTime.now());
		
		contactMessageRepository.save(message);
		
		return true;
		
	}

}
