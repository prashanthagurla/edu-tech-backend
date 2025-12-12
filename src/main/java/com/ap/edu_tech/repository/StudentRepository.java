package com.ap.edu_tech.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ap.edu_tech.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel,Long> {

}
