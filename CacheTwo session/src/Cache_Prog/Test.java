package Cache_Prog;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class Test {

	

	public static void main(String[] args) {

		
					
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 
						
		 	UserDTO u=(UserDTO)session.load(UserDTO.class,1);
			System.out.println(u.getId()+" "+u.getFirstname()+" "+u.getNickname());
		   session.close();
	 
			
			Session session1 = factory.openSession();
			 
			
		 	UserDTO u1 =(UserDTO)session1.load(UserDTO.class,1);
			System.out.println(u1.getId()+" "+u1.getFirstname()+" "+u1.getNickname());
			session1.close();
	 
			
			
			
			
			
			
			
			
			
		 System.out.println("Object saved successfully.....!!"); 
		 }
		
		}
