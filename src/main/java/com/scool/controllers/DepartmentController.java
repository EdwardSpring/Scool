package com.scool.controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.scool.beans.Department;
import com.scool.beans.DepartmentDetail;
import com.scool.repo.DepartmentDetailRepo;
import com.scool.repo.DepartmentRepo;

@RestController
@CrossOrigin(value = "*", origins = "*")
public class DepartmentController {
	
	@Autowired
	DepartmentDetailRepo repo;
	
	
	
	HashMap<Object, Object> map = new LinkedHashMap<>();
	
	public DepartmentController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/department/{id}")
	public Object getDepartment(@PathVariable("id") long id) {
		map.clear();
		map.put("result", repo.findById(id));
		return map;
	}
	
	@GetMapping("/department/")
	public Object getDepartments() {
		map.clear();
		map.put("result", repo.findAll());
		return map;
	}
	
	@PutMapping(value = "/department/", consumes = {"application/json"})
	public Object editDepartment(@RequestBody DepartmentDetail obj) {
		System.out.println("Into edit department");
		map.clear();
		repo.save(obj);
		map.put("result", true);
		return map;
	}

}
