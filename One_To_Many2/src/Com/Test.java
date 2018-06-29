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
		
		
		Employee v =new Employee();
		            
		            v.setEid(101);
		            v.setEname("Ankit");
		       
		            
		            Department c1=new Department();
		             
		             c1.setId(504);
		             c1.setDname("Prshant");
		  
		             
		             Department c2=new Department();
		             
		             c2.setId(505);
		             c2.setDname("Om"); 
		
		             
		             Department c3=new Department();
		             
		             c3.setId(506);
		             c3.setDname("Rajput");
		       
		             
		             
		             
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
