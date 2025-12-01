package com.example.entity;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql");
	 System.out.println("table created");
	}
}
