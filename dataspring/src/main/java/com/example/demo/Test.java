package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		//		Student  s1=(Student)ac.getBean("data");
		//		System.out.println(s1.getId());
		//		System.out.println(s1.getName());
		Employee e1=(Employee) ac.getBean("mm");
		System.out.println(e1.toString());
	}
}
