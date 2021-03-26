package com.scool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scool.beans.Department;

public interface DepartmentRepo extends JpaRepository<Department, Long> {
	

}
