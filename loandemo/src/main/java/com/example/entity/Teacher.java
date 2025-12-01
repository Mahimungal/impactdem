package com.example.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Teacher {
	@Id
	private int tId;
	private String name;
	private String dept;
	private float salary;
	private String city;
	@ManyToMany(targetEntity = Subject.class,cascade = CascadeType.PERSIST)
	private Set subject;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set getSubject() {
		return subject;
	}
	public void setSubject(Set subject) {
		this.subject = subject;
	}
	

}
