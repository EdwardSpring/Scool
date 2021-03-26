package com.scool.controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scool.repo.StaffRepo;

@RestController
@CrossOrigin(value = "*", origins = "*")
public class StaffController {
	
	HashMap<Object, Object> map = new LinkedHashMap<>();

	@Autowired
	StaffRepo repo;

	public StaffController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/staff")
	public Object getAllStaff() {
		map.clear();
		map.put("result", repo.findAll());
		return map;
	}

}
