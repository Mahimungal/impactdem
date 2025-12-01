package com.example.service;

import javax.persistence.EntityManager;

import com.example.dbconnection.DbConnection;
import com.example.entity.College;
import com.example.entity.Principal;
import com.example.repository.Create;

public class CreateService  implements Create{

	@Override
	public void addData() {
		EntityManager em=DbConnection.dbConn().createEntityManager();
		em.getTransaction().begin();
		Principal p1=new Principal();
		p1.setId(101);
		p1.setName("Ajay");
		p1.setEmail("ajay@gmail.com");
		p1.setCity("Pune");
		p1.setSalary(12345);
		College c1=new College();
		c1.setRegNo(101);
		c1.setName("PVPIT");
		c1.setLoc("pune");
		p1.setCollege(c1);
		c1.setPrincipal(p1);
		em.persist(c1);
		em.persist(p1);
		em.getTransaction().commit();
	}

}
