package com.aartek.dto; 


import org.hibernate.*;
import org.hibernate.cfg.*;

public class TestDTO
{  
public static void main(String[] args)throws Exception  {  
      
     
    Configuration cfg = new Configuration();  
   
    cfg.configure("hibernate.cfg.xml");  
      
      
    SessionFactory factory = cfg.buildSessionFactory();  
      
      
    Session session = factory.openSession();  
      
      
    Transaction t = session.beginTransaction();  
          
    UserDTO dto = (UserDTO) session.get(UserDTO.class, 1);
    System.out.println(dto.getId());
    System.out.println(dto.getFirstname());
    System.out.println("successfully saved"); 
    t.commit();  
    session.close();  
      
      
      
}  
}  