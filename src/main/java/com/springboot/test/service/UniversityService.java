package com.springboot.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.test.exception.ResourceNotFoundException;
import com.springboot.test.entity.University;
import com.springboot.test.repository.UniversityRepository;

@Service
public class UniversityService {
	
	@Autowired
	UniversityRepository repo;
	
	public University saveUniversity(University university)
	{
		return repo.save(university);
	}
	
	public List<University> saveAllUniversity(List<University> universities)
	{
		return repo.saveAll(universities);
	}
	
	public List<University> getUniversity()
	{
		return repo.findAll();
	}
	
	public University getById(int id)
	{
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Invalid not present in database:"+id));
	}
	
	public University getByName(String name)
	{
		return repo.findByName(name).orElseThrow(() -> new ResourceNotFoundException("Invalid not present in database:"+name));
	}

}
