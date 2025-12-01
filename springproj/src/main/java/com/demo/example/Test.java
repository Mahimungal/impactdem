package com.demo.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	Org  o=	(Org) ac.getBean("o1");
	System.out.println(o.getId());
	System.out.println(o.getEmployee());
	}
}
