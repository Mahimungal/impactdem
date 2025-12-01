package com.example.dbconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	public static Connection dbCon() throws SQLException, IOException
	{
		File f1=new File("C:\\Users\\Payal\\impact\\loandemo\\src\\main\\resources\\db.properties");
		FileInputStream f2=new FileInputStream(f1);
		Properties p1=new Properties();
		p1.load(f2);
		String url=p1.getProperty("url");
		String user=p1.getProperty("user");
		String pass=p1.getProperty("password");
		Connection con=DriverManager.getConnection(url,user,pass);
		return con;

	}
}
