package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {
	Employee updateEmployee(Employee employee);
	Employee addEmployee(Employee employee);
	List<Employee> fetchEmployee();
	Employee fetchEmployee(int id);
	void deleteEmployee(Integer id);
}
