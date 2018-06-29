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
					 dto.setId (2);
					 session.delete(dto);
					 	 

						System.out.println("Object saved successfully.....!!");
						tx.commit();
					 
					 
						session.close();
					 
									
	}

}
