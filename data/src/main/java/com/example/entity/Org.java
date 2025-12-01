package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Org {
	@Id
	private int id;
	private String name;
	private String loc;
	@OneToMany(targetEntity = Employee.class,cascade = CascadeType.PERSIST)
	private List emp;
	public Org() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List getEmp() {
		return emp;
	}
	public void setEmp(List emp) {
		this.emp = emp;
	}
	
	

}
