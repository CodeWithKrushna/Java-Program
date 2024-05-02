package com.haibernet.demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.haibernet.demo.entity.Child;
import com.haibernet.demo.entity.Parent;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory sessionFactory=cfg.buildSessionFactory();
    	Session session=sessionFactory.openSession();
    	
    	Transaction tr=session.beginTransaction();
    	
    	Parent perent =new Parent();
    	
    	Child child1 = new Child();
    	
    	child1.setcId(1);
    	child1.setcName("Abhishekh");
    	child1.setParent(perent);
    	
    	Child child2 = new Child();
    	child2.setcId(2);
    	child2.setcName("Omkar");
    	child2.setParent(perent);
    	
    	perent.setpId(1);
    	perent.setpName("Jayesh");
    	
    	
    	ArrayList list =new ArrayList();
    	
    	list.add(child1);
    	list.add(child2);
    	perent.setChid(list);
    	
    	session.save(perent);
    	session.save(list);
    	tr.commit();
    	session.close();
    	System.out.println("=======");
    	
    	
    }
}
