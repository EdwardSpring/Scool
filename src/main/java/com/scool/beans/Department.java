package com.scool.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@Column(name = "department_id")
	private long departmentID;

	@Column(name = "department_name", length = 50)
	private String departmentName;

	public Department() {}
	
	public Department(long departmentID) {this.departmentID = departmentID;}
	
	public Department(long departmentID, String departmentName) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}
	
	public long getDepartmentID() {return departmentID;}
	public void setDepartmentID(long departmentID) {this.departmentID = departmentID;}

	public String getDepartmentName() {return departmentName;}
	public void setDepartmentName(String departmentName) {this.departmentName = departmentName;}

	
	

}
