package com.demo.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		BeanFactory bf=new ClassPathXmlApplicationContext("applicationContext.xml");
		Student s1=	(Student) bf.getBean("s1");
		System.out.println("Student id is :"+s1.getId());
		System.out.println("Student name is :"+s1.getName());
		System.out.println("Student Dept is :"+s1.getDept());
	}
}
