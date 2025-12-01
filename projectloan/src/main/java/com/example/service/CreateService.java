package com.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.example.dbconnection.DbConnection;
import com.example.entity.Dept;
import com.example.entity.Student;
import com.example.respository.Create;

public class CreateService implements Create {

	@Override
	public void addData() {
		// Scanner s1=new Scanner(System.in);
		//System.out.println("Enter Dept "); 
		EntityManager em=DbConnection.dbCon().createEntityManager();
		em.getTransaction().begin();
		Student s1=new Student();
		s1.setId(101);
		s1.setName("joe");
		s1.setGrade("A");
		s1.setCity("hyd");
		Student s2=new Student();
		s2.setId(102);
		s2.setName("max");
		s2.setGrade("A");
		s2.setCity("pune");
		em.persist(s2);
		em.persist(s1); 
		List<Student> ss=new ArrayList<>();
		ss.add(s2);
		ss.add(s1);
		Dept d1=new Dept();
		d1.setdId(1);
		d1.setName("COMP");
		d1.setBuilding("C");
		d1.setStud(ss);
		em.persist(d1);		
		em.getTransaction().commit();

	}

}
