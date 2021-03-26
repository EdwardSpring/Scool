package com.scool.beans;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Embeddable
public class PersonDetail {
	
	@Column(name = "first_name", length = 40)
	private String firstName;
	
	@Column(name = "last_name", length = 40)
	private String lastName;
	
	@Column(name = "email", length = 20)
	private String email;
	
	@Column(name = "phone", length = 20)
	private String phone;
	
	@Column(name = "password", length = 20)
	private String password = "pass";
	
	@Column(name = "level", length = 20)
	private String level;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@JoinColumn(name = "department")
//	@JsonIdentityInfo(generator=ObjectIdGenerators.UUIDGenerator.class, property="@id")
	private Department department;

	public PersonDetail() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonDetail(String firstName, String lastName, String email, String phone, Department department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
	

}
