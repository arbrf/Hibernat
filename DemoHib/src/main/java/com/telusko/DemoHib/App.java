package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    
    {
    	AlienName alienName=new AlienName();
    	alienName.setFname("Mohammad");
    	alienName.setLname("Ibrahim");
    	alienName.setSurname("Shaik");
        Aliens telusko= new Aliens();
        telusko.setAid(101);
        telusko.setAcolor("Green");
        telusko.setAname(alienName);
        
      Configuration con= new Configuration().configure().addAnnotatedClass(Aliens.class);
   
      SessionFactory sf=con.buildSessionFactory();
      Session session=sf.openSession();
      Transaction tx = session.beginTransaction();
      session.save(telusko);
      tx.commit();
      


        
    }
}
