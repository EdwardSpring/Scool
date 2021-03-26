package com.scool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scool.beans.Staff;

public interface StaffRepo extends JpaRepository<Staff, Long> {

}
