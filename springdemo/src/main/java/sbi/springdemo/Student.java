package sbi.springdemo;

public class Student {
	public int id;
	String name;
	 void add()
	 {
		 
	 }
	 
	 
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

}
