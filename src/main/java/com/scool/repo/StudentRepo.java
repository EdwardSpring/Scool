package com.scool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scool.beans.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
