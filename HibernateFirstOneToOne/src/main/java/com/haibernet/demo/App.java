package com.haibernet.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args, Wife wife )
    {
    	// configure the hibernate,cfg,xml
       Configuration cfg =new Configuration();
       cfg.configure("hibernate.cfg.xml");
       // build the session Factory
       SessionFactory sessionFactory=cfg.buildSessionFactory();
       //open the session for transaction
       Session session = sessionFactory.openSession();
       // begin transaction
       Transaction tr=session.beginTransaction();
       
       Husband hs = new Husband();
       Wife wi = new Wife();
       
       hs.setHid(1);
       hs.setHname("Amitabh");
       hs.setWife(wi);
       
       wi.setwId(1);
       wi.setwName("Jaya");
       wi.setHusband(hs);
       
       session.save(wi);
       session.save(hs);
       
       tr.commit();
       session.close();
       
       System.out.println("Run Zal");
       
       
       
       
       
       
    }
}
