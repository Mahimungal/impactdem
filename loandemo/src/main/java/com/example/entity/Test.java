package com.example.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("mapping");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Teacher t1=new Teacher();
		t1.settId(101);
		t1.setName("joe");
		t1.setCity("pune");
		t1.setDept("MCA");
		t1.setSalary(12345);
		Teacher t2=new Teacher();
		t2.settId(102);
		t2.setName("Max");
		t2.setCity("Hyd");
		t2.setDept("MCA");
		t2.setSalary(74858);
		Teacher t3=new Teacher();
		t3.settId(103);
		t3.setName("Tim");
		t3.setCity("Delhi");
		t3.setDept("MCA");
		t3.setSalary(45124);
		
		Teacher t4=new Teacher();
		t4.settId(104);
		t4.setName("john");
		t4.setCity("Delhi");
		t4.setDept("MCA");
		t4.setSalary(45124);
		
		
		
		
		
		
		Subject s1=new Subject();
		s1.setsId(1);
		s1.setName("Java");
		s1.setPrice(200);
		Subject s2=new Subject();
		s2.setsId(2);
		s2.setName("Mysql");
		s2.setPrice(500);
		Subject s3=new Subject();
		s3.setsId(3);
		s3.setName("Python");
		s3.setPrice(300);
		Subject s4=new Subject();
		s4.setsId(4);
		s4.setName("Aws");
		s4.setPrice(450);
		Subject s5=new Subject();
		s5.setsId(5);
		s5.setName("DS");
		s5.setPrice(250);
		Subject s6=new Subject();
		s6.setsId(6);
		s6.setName("OS");
		s6.setPrice(450);
		Subject s7=new Subject();
		s7.setsId(7);
		s7.setName("AI");
		s7.setPrice(750);
		
		Set<Subject> ss=new HashSet<>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		Set<Subject> ss1=new HashSet<>();
		ss1.add(s4);
		ss1.add(s5);
		Set<Subject> ss2=new HashSet<>();
		ss2.add(s6);
		ss2.add(s7);
		
		
		
		Set<Teacher> tt= new HashSet<>();
		tt.add(t1);
		tt.add(t2);
		
		Set<Teacher> tt1= new HashSet<>();
		tt1.add(t3);
		tt1.add(t4);
		
		
		t1.setSubject(ss);
		t2.setSubject(ss1);
		t3.setSubject(ss2);
		t4.setSubject(ss);
		
		s1.setTeacher(tt1);
		s2.setTeacher(tt);
		s3.setTeacher(tt);
		s4.setTeacher(tt1);
		
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);	
		em.persist(s4);
		em.persist(s5);
		em.persist(s6);
		em.persist(s7);
		
		em.persist(t1);
		em.persist(t2);
		em.persist(t3);	
		em.persist(t4);
		
		
		
		
		
		
		
		
		
		em.getTransaction().commit();
	}
}
