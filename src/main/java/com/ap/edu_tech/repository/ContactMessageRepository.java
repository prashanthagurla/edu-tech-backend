package com.ap.edu_tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.edu_tech.model.ContactMessage;

@Repository
public interface ContactMessageRepository extends JpaRepository<ContactMessage,Long> {
 
}
