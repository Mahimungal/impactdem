package com.example.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Dept {
	@Id
	private int dId;
	private String name;
	private String building;
	@OneToMany(targetEntity = Student.class)
	private List stud;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	public List getStud() {
		return stud;
	}
	public void setStud(List stud) {
		this.stud = stud;
	}

}
