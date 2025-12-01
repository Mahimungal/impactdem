package com.example.data;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1=(Employee) ac.getBean("Emp");
		System.out.println(e1.getId());
		System.err.println(e1.getName());
		System.err.println(e1.getSalary());
		System.out.println(e1.getAddress());
		
	}
}
