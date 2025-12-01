package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		Teacher tt=	(Teacher) ac.getBean("t1");
		System.out.println(tt.getId());
		System.out.println(tt.getSubjects());


	}
}
