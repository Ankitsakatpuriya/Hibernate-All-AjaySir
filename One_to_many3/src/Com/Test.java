package Com;

import java.util.HashSet;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

	



public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
		
		
		Assignments v =new Assignments();
		            
		            v.setAid(2);
		            v.setAname("Ankit");
		       
		            
		            Questions c1=new Questions();
		             
		             c1.setQid(201);
		             c1.setQno("2");
		             c1.setForevenid(2);
		  
		             
		             Questions c2=new Questions();
		             
		             c2.setQid(202);
		             c2.setQno("3"); 
		             c2.setForevenid(2);
		
		             
		             Questions c3=new Questions();
		             
		             c3.setQid(203);
		             c3.setQno("4");
		             c3.setForevenid(2);
		       
		             
		             
		             
		   Set s=new HashSet();
		  
				        s.add(c1);
				        s.add(c2);
				        s.add(c3);
		        
		        
		              v.setChildren(s);
		              
		    Transaction tx = session.beginTransaction();
		    
		                
	           session.save(v);
                          
               tx.commit();
               session.close();  
               System.out.println("One To Many is Done..!!");
               factory.close();
		             

	}

}
