package com.anudip.jdbc.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStudentDemo
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Root");
		
		int id;
		String name,desig ,dept;
		int sal;
		
		Scanner Sc=new Scanner(System.in);
		System.out.println("Please Fill Your Employee Details");
		
		System.out.println("Enter The Id");
		id=Sc.nextInt();
		
		System.out.println("Enter Your name");
		name=Sc.next();
		
		System.out.println("Enter The Designation");
		desig=Sc.next();
		
		System.out.println("Enter The Department");
		dept=Sc.next();
		
		System.out.println("Enter your Salary");
		sal=Sc.nextInt();
		
		PreparedStatement pstmt=con.prepareStatement("Insert into emp value(?,?,?,?,?)");
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setString(3, desig);
		pstmt.setString(4, dept);
		pstmt.setInt(5, sal);
		
		int i=pstmt.executeUpdate();
		
		con.close();
		System.out.println(i +" Successfully Add the Value");
		
		}
	

}
