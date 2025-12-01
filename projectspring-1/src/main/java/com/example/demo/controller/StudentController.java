package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/Student")
@CrossOrigin("https://localhhost:5500")
public class StudentController {
	@Autowired
	StudentService studentService;
	@PostMapping("/add")
	public Student addData(@RequestBody Student student)
	{
		Student s1=studentService.addStudent(student);
		return s1;
	}
	@PutMapping("/update/{id}")
	public Student updateData(@RequestBody Student student,@PathVariable Integer id)
	{
		Student s1=studentService.updateStudent(student,id);
		return s1;
	}
	@GetMapping("/get")
	public List<Student> fetchData()
	{
		List<Student> l1=studentService.getData();
		return l1;
	}
	@GetMapping("/get/{id}")
	public Student fetchData(@PathVariable Integer id)
	{
		Student l1=studentService.getData(id);
		return l1;
	}
	@DeleteMapping("/{id}")
	public void deleteD(@PathVariable Integer id)
	{ 
		studentService.deleteData(id);
	}

}

