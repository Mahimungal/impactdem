package com.example.demo.serviceimple;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImple implements EmployeeService {
	EmployeeRepository employeeRepository;
	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		Employee e1=employeeRepository.save(employee);
		return e1;
	}

	@Override
	public List<Employee> fetchEmployee() {
		List<Employee> l1=employeeRepository.findAll();
		return l1;
	}

	@Override
	public Employee fetchEmployee(int id) {
		Employee e=employeeRepository.findById(id).get();
		return e;
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);

	}

}
