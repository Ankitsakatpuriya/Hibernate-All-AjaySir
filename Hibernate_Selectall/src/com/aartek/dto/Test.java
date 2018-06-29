package com.aartek.dto; 


import java.awt.List;
import java.util.Iterator;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Test
{  
@SuppressWarnings("deprecation")
public static void main(String[] args)throws Exception  {  
      
     
    Configuration cfg = new Configuration();  
   
    cfg.configure("hibernate.cfg.xml");  
      
      
    SessionFactory factory = cfg.buildSessionFactory();  
      
      
    Session session = factory.openSession();  
      
      
    Transaction t = session.beginTransaction();  
    Query qry = session.createQuery("select from Product p");
    		 
    		 List l =(List) qry.list();
    		 System.out.println("Total Number Of Records : "+l.size());
    		 Iterator it = ((java.util.List) l).iterator();
    		 
    		 while(it.hasNext())
    		 {
    		 Integer i = (Integer)it.next();
    	
	 System.out.println("Product id : "+i.intValue());
    		 System.out.println("---------------------------");
    
   
    session.close();  
      
    System.out.println("successfully saved");  
    		 }}}