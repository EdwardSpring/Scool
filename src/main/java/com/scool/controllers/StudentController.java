package com.scool.controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scool.repo.StudentRepo;

@RestController
@CrossOrigin(value = "*", origins = "*")
public class StudentController {
	
	HashMap<Object, Object> map = new LinkedHashMap<>();

	@Autowired
	StudentRepo repo;
	
	public StudentController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/students")
	public Object getAllStudents() {
		map.clear();
		map.put("result", repo.findAll());
		return map;
	}

}
