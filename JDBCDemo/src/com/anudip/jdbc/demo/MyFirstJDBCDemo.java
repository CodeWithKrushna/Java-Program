package com.anudip.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class MyFirstJDBCDemo
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		// step 1. Register the Driver
		//com.mysql.cj.jdbc.Driver. (my sql driver name)
		//url name :- jdbc:mysql://localhost:3306/mydb ('mydb' is the name of database.
		// (java) API : 
		
		
		// step 1. Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step 2 : establish connection to mysql
		//jdbc API which
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Root");     
		// creating the statement
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate("Insert into emp values(7,'Kalpeshh','Coder ','Python Developer',20000)");
		System.out.println("Table add hau");
		con.close();
	
	
	}
}
