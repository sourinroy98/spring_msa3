package com.springboot.test.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.test.entity.University;

public interface UniversityRepository extends JpaRepository<University, Integer>{

	public Optional<University> findByName(String name);
	
	

}
