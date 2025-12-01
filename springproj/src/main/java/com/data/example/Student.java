package com.data.example;

import com.exqample.data.Address;

public class Student {
	private int rollNo;
	private String  name;
	private Address address;

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public Student(Address address) {
		super();
		this.address = address;
	}
	

}
