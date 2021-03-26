package com.scool.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scool.beans.DepartmentDetail;

public interface DepartmentDetailRepo extends JpaRepository<DepartmentDetail, Long> {

}
