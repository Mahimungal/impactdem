package sbi.springproj;

import java.io.Serializable;

public class Demo implements Serializable {//bean class
	 private int id;
	 private String name;
	 private String dept;
	 
	public Demo() {
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	 

}
