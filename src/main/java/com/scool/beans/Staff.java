package com.scool.beans;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Staff {
	
	@Id
	@Column(name = "staff_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long staffID;
	
	@Embedded
	private PersonDetail personDetail;
	
	private String type;
	

	public Staff() {}
	
	public Staff(long staffID) {this.staffID = staffID;}

	public Staff(PersonDetail personDetail, String type) {
		this.personDetail = personDetail;
		this.type = type;
	}


	public long getStaffID() {return staffID;}
	public void setStaffID(long staffID) {this.staffID = staffID;}

	public PersonDetail getPersonDetail() {return personDetail;}
	public void setPersonDetail(PersonDetail personDetail) {this.personDetail = personDetail;}

	public String getType() {return type;}
	public void setType(String type) {this.type = type;}
	
	

}
