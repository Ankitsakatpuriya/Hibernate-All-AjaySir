package com.aartek.dto;
import org.hibernate.*;
import org.hibernate.cfg.*;
public class TestDTO {

	public static void main(String[] args)throws Exception {
		
			Configuration cfg = new Configuration();
			 cfg.configure("hibernate.cfg.xml"); 
			 
			 SessionFactory factory = cfg.buildSessionFactory();
			 Session session = factory.openSession();
			 Transaction tx = session.beginTransaction();
			 UserDTO dto = new UserDTO();
			    
			    dto.setFirstname("Ankit");
				dto.setLastname("Sakatpuri");
				dto.setMobile("81349426");
				dto.setPincode("461111");
				
					
				dto.setFirstname("Om");
				dto.setLastname("Patidar");
				dto.setMobile("8269");
				dto.setPincode("444");
			
				
				dto.setFirstname("Swati");
				dto.setLastname("Rajput");
				dto.setMobile("877");
				dto.setPincode("0000");
			
				dto.setFirstname("Prshant");
				dto.setLastname("Chouhan");
				dto.setMobile("85269852");
				dto.setPincode("462010");
			 
				
				
				session.save(dto);
				 System.out.println("Object saved successfully.....!!");
				 tx.commit();
				 
				 
				 session.close();
				 
				 }
				
				}


	

