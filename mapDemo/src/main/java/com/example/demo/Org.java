package com.example.demo;

import java.util.Map;

public class Org {
	private int regNo;
	private String name;
	private String city;
	private Map<Employee, Address> emp;
	public Org() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Map<Employee, Address> getEmp() {
		return emp;
	}
	public void setEmp(Map<Employee, Address> emp) {
		this.emp = emp;
	}
	

}
