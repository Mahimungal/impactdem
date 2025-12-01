package com.example.service;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.example.dbconnection.DbConnection;
import com.example.entity.Student;
import com.example.repository.StudentRepo;

public class StudentService  implements StudentRepo{

	@Override
	public void operation() throws SQLException, IOException {
		String str="select id,name,city,dept from tblStudent where id=? AND name=?";
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter Student id ");
		int id=s1.nextInt();

		System.out.println("Enter Student Name ");
		String name=s1.next();
		PreparedStatement ps=DbConnection.dbCon().prepareStatement(str);
		Student s2=new Student();
		s2.setId(id);
		s2.setName(name);
		ps.setInt(1, s2.getId());
		ps.setString(2, s2.getName());
     	ResultSet rs=ps.executeQuery();
     	while(rs.next())
     	{
     		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4) );
     		
     	}

	}

}
