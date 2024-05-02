package com.haibernet.demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory=cfg.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction tr =session.beginTransaction();
    	
    	Student stu=new Student();
    	
    	stu.setstudentId(2);
    	stu.setName("Krushna");
    	stu.setAdd("Jalgaon");
    	stu.setPhono(11);
    	stu.setMarks(99);
    	
    	session.save(stu);
    	tr.commit();
    	
    	session.close();
    	
    	System.out.println("Student Added");
    	
    }
}
