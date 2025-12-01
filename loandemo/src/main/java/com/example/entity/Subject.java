package com.example.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
	private int sId;
	private String name;
	private float price;
	@ManyToMany(targetEntity = Teacher.class,cascade = CascadeType.PERSIST)
	private Set teacher;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Set getTeacher() {
		return teacher;
	}
	public void setTeacher(Set teacher) {
		this.teacher = teacher;
	}

}
