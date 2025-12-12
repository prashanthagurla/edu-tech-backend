package com.ap.edu_tech.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contact_message")
public class ContactMessage {
	
	private Long messageId;
	
	private String fullName;
	
	private String email;
	
	private String message;
	
	private LocalDateTime createdAt;
	
	public ContactMessage() {
		super();
	}
	
	public ContactMessage(Long messageId, String fullName, String email, String message, LocalDateTime createdAt) {
		super();
		this.messageId = messageId;
		this.fullName = fullName;
		this.email = email;
		this.message = message;
		this.createdAt = createdAt;
	}
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "message_id",unique = true, nullable = false)
	public Long getMessageId() {
		return messageId;
	}
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
	
	
	

}
