package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentCotroller {

	StudentService studentservice;
	
	public StudentCotroller(StudentService studentservice) {
		super();
		this.studentservice = studentservice;
	}
	public StudentCotroller() {
		super();
		// TODO Auto-generated constructor stub
	}
	@PostMapping("/AddStudent")
	 public void savaData(Student student)
	 
	 {
		 studentservice.addStudent(student);
	 }

}
