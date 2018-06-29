package com.aartek.dto; 


import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.mapping.List;

public class Test
{  
public static void main(String[] args)throws Exception  {  
      
     
    Configuration cfg = new Configuration();  
   
    cfg.configure("hibernate.cfg.xml");  
      
      
    SessionFactory factory = cfg.buildSessionFactory();  
      
      
    Session session = factory.openSession();  
      
      
    Transaction t = session.beginTransaction();  
          
    
    
       
    System.out.println("successfully saved");  
      
}  
}  