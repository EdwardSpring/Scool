package com.scool.beans;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long studentID;
	
	@Embedded
	private PersonDetail personDetail;

	public Student() {}
	
	public Student(PersonDetail personDetail) {this.personDetail = personDetail;}

	public long getStudentID() {return studentID;}
	public void setStudentID(long studentID) {this.studentID = studentID;}

	public PersonDetail getPersonDetail() {return personDetail;}
	public void setPersonDetail(PersonDetail personDetail) {this.personDetail = personDetail;}
	
	

}
