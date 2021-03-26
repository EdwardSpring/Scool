package com.scool;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.scool.beans.Department;
import com.scool.beans.DepartmentDetail;
import com.scool.beans.PersonDetail;
import com.scool.beans.Staff;
import com.scool.beans.Student;
import com.scool.repo.DepartmentDetailRepo;
import com.scool.repo.DepartmentRepo;
import com.scool.repo.StaffRepo;
import com.scool.repo.StudentRepo;

@SpringBootApplication
public class AppScoolApplication implements CommandLineRunner {

	@Autowired
	StudentRepo studentRepo;

	@Autowired
	DepartmentRepo departmentRepo;
	
	@Autowired
	DepartmentDetailRepo departmentDetailRepo;
	
	@Autowired
	StaffRepo staffRepo;

	public static void main(String[] args) {
		SpringApplication.run(AppScoolApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Add Departments
		ArrayList<Department> departmentList = new ArrayList<>();
		departmentList.add(new Department(401, "Banking and Finance"));
		departmentList.add(new Department(402, "Business Administration"));
		departmentList.add(new Department(403, "Public Administration"));
		departmentList.add(new Department(404, "Accounancy"));
		departmentList.add(new Department(405, "Marketing"));
		departmentList.add(new Department(406, "Entrepreneurship"));
		departmentRepo.saveAll(departmentList);

		// Add Students
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student(new PersonDetail("John", "Stone", "js@gmail.com", "0805684943", new Department(401))));
		studentList.add(new Student(new PersonDetail("Emeka", "Anyanwu", "js@gmail.com", "0805684943", new Department(401))));
		studentList.add(new Student(new PersonDetail("Pam", "Beasly", "pb@gmail.com", "080345665765", new Department(404))));
		studentList.add(new Student(new PersonDetail("Jim", "Hap", "jh@gmail.com", "080345665765", new Department(404))));
		studentList.add(new Student(new PersonDetail("Dwight", "Schrudt", "ds@gmail.com", "08034584343", new Department(404))));
		studentList.add(new Student(new PersonDetail("Creed", "Baxton", "cb@gmail.com", "080345665765", new Department(404))));
		studentRepo.saveAll(studentList);

		// Add Staff
		ArrayList<Staff> staffList = new ArrayList<>();
		staffList.add(new Staff(new PersonDetail("Henry ", "Okafor", "ho@gmail.com", "0803354943", new Department(401)),"teaching"));
		staffList.add(new Staff(new PersonDetail("Amadi ", "Okonkwo", "ao@gmail.com", "0803354943", new Department(402)),"teaching"));
		staffList.add(new Staff(new PersonDetail("Vincent ", "Ugu", "vu@gmail.com", "0803354943", new Department(403)),"teaching"));
		staffList.add(new Staff(new PersonDetail("Utazi ", "Kakashi", "uk@gmail.com", "0803354943", new Department(404)),"teaching"));
		staffList.add(new Staff(new PersonDetail("Aba ", "Mohammed", "am@gmail.com", "0803354943", new Department(405)),"teaching"));
		staffList.add(new Staff(new PersonDetail("Ooh ", "Lala", "oh@gmail.com", "0803354943", new Department(406)),"teaching"));
		staffList.add(new Staff(new PersonDetail("Somto ", "Ikeagugom", "si@gmail.com", "0803354943", new Department(406)),"cleaning"));
		staffList.add(new Staff(new PersonDetail("Michael", "Scott", "ms@gmail.com", "0803354943", new Department(404)),"teaching"));
		staffList.add(new Staff(new PersonDetail("Karen", "Filipeli", "ms@gmail.com", "0803354943", new Department(403)),"teaching"));
		staffList.add(new Staff(new PersonDetail("Josh", "Brown", "ms@gmail.com", "0803354943", new Department(401)),"teaching"));
		staffRepo.saveAll(staffList);
		
		// Add Department Detail
		ArrayList<DepartmentDetail> departmentDetailList = new ArrayList<>();
		departmentDetailList.add(new DepartmentDetail(401, "Banking and Finance", new Staff(1)));
		departmentDetailList.add(new DepartmentDetail(402, "Business Administration", new Staff(2)));
		departmentDetailList.add(new DepartmentDetail(403, "Public Administration", new Staff(3)));
		departmentDetailList.add(new DepartmentDetail(404, "Accounancy", new Staff(4)));
		departmentDetailList.add(new DepartmentDetail(405, "Marketing", new Staff(5)));
		departmentDetailList.add(new DepartmentDetail(406, "Entrepreneurship", new Staff(6)));
		departmentDetailRepo.saveAll(departmentDetailList);
		
		

	}

}
