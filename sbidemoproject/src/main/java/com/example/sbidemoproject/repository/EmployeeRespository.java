package com.example.sbidemoproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.sbidemoproject.entity.Employee;
@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
