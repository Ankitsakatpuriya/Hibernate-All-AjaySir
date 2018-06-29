package com.aartek.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDTO {

	public static void main(String[] args) {
		
		UserDTO ud = new UserDTO();
		ud.setFirstname("Ankit");
		ud.setLastname("Sakatpuriya");
		ud.setMobile("8871349426");
		
		
		UserDTO2 ud2 = new UserDTO2();
		ud2.setAddress("Dewaan");
		ud2.setCity("itarsi");
		ud2.setPiccode("46111");
		
		
		Configuration cfg = new Configuration();  
		   
	    cfg.configure("hibernate.cfg.xml");  
	      
	      
	    SessionFactory factory = cfg.buildSessionFactory();  
	      
	      
	    Session session = factory.openSession();  
	      
	      
	    Transaction t = session.beginTransaction(); 
	    session.save(ud); 
	    session.save(ud2);
	    
	    t.commit();  
	    session.close();  
	      
	    System.out.println("successfully saved");  
	   

}}