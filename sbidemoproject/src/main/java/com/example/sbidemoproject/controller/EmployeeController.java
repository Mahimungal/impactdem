package com.example.sbidemoproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sbidemoproject.entity.Employee;
import com.example.sbidemoproject.repository.EmployeeRespository;

@RestController
@RequestMapping("/Home")
public class EmployeeController {
	@Autowired
	EmployeeRespository employeeRespository;


	public EmployeeController(EmployeeRespository employeeRespository) {
		super();
		this.employeeRespository = employeeRespository;
	}

	@GetMapping()
	public List<Employee> getData()
	{
		List<Employee> l1=employeeRespository.findAll();
		return l1;


	}
}
