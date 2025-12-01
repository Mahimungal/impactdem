package com.example.dbconnection;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DbConnection {
	
	private DbConnection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static  EntityManagerFactory dbConn()
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mappingdemo");
		return emf;

	}
}
