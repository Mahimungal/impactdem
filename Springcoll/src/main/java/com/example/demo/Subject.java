package com.example.demo;

public class Subject {
	private int id;
	private String name;
	private String author;
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Subject(int id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Subject [id=" + id + ", name=" + name + ", author=" + author + "]";
	}
	

}
