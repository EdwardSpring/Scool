package com.scool.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class DepartmentDetail implements Serializable{
	private static final long serialVersionUID = 1L;

//	@OneToOne
	@Id
//	@PrimaryKeyJoinColumn(name = "department_id")
	private long departmentID;
	
	@Column(name = "department_name", length = 50)
	private String departmentName;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "hod")
//	@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@id")
	private Staff hod;
	
	public DepartmentDetail() {}

	public DepartmentDetail(long departmentID, String departmentName, Staff hod) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.hod = hod;
	}
	
	

	public long getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(long departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Staff getHod() {return hod;}
	public void setHod(Staff hod) {this.hod = hod;}


}
