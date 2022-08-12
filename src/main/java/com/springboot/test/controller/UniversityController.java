package com.springboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.entity.University;
import com.springboot.test.service.UniversityService;

@RestController
public class UniversityController {
	
	@Autowired
	UniversityService service;
	
	@PostMapping("/adduni")
	public University addUniversity(@RequestBody University university)
	{
		return service.saveUniversity(university);
	}
	
	
	@PostMapping("/addunis")
	public List<University> addUniversities(@RequestBody List<University> universities)
	{
		return service.saveAllUniversity(universities);
	}
	
	@GetMapping("/universities")
	public List<University> findAllUniversities()
	{
		return service.getUniversity();
	}
	
	@GetMapping("/universitiesById/{id}")
	public University findUniversitById(@PathVariable int id)
	{
		return service.getById(id);
	}
	
	@GetMapping("/universitiesByName/{name}")
	public University findUniversitById(@PathVariable String name)
	{
		return service.getByName(name);
	}

}
