package com.demo.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
	public static void main(String[] args) {
		BeanFactory bf= new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee e1=(Employee) bf.getBean("e1");
		System.out.println(e1);
	}

}
