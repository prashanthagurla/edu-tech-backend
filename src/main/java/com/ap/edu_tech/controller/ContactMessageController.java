package com.ap.edu_tech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ap.edu_tech.model.ContactMessage;
import com.ap.edu_tech.service.ContactMessageService;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/")
public class ContactMessageController {
	
	private ContactMessageService contactMessageService;

	public ContactMessageController(ContactMessageService contactMessageService) {
		super();
		this.contactMessageService = contactMessageService;
	}
	
	@PostMapping("save-message")
	public String saveContactMessage(@RequestBody ContactMessage message){
		Boolean isSaved =  contactMessageService.saveContactMessage(message);
		if(isSaved) {
			return "Success";
		}
		
		return "failed";
		
	}
	
	

}
