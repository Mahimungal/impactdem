package com.example.demo;

import java.util.HashSet;
import java.util.Set;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee(1, "joe", "HR", 12345);
		Employee e2=new Employee(1, "joe", "HR", 12345);
		Employee e3=new Employee(3, "max", "Dev", 4125);
		Employee e4=new Employee(2, "Tim", "HR", 6464);
		Set<Employee> s1=new HashSet<>();
		s1.add(e1);
		s1.add(e2);
		s1.add(e3);
		s1.add(e4);
		System.out.println(s1);
	}
}
