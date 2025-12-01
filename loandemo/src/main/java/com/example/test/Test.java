package com.example.test;

import java.io.IOException;
import java.sql.SQLException;

import com.example.repository.StudentRepo;
import com.example.service.StudentService;

public class Test {
	public static void main(String[] args) throws SQLException, IOException {
		StudentRepo s1=new StudentService();
		s1.operation();
	}
}
