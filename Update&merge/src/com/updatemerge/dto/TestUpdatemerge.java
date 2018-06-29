package com.updatemerge.dto;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestUpdatemerge 
{

	//private static final String Swati = null;

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      
      
      Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session1 = factory.openSession();
		
		StudentDTO s1 = null;
		Object o = session1.get(StudentDTO.class, 1);
		s1 = (StudentDTO)o;
		session1.merge(s1);
		s1.setStdName("A");
		
	
	session1.close();
}	 
		
		 
				
		  
		
	

}
