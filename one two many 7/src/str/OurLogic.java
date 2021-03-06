package str;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OurLogic {

	public static void main(String args[])
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		
	     Country v =new Country();
		            
		            v.setCid(1);
		            v.setCountryname("Ankit");
		            
		            
		            
		 State c1=new State();
		             
		             c1.setSId(504);
		             c1.setStateName("A");
		             c1.setFid(1);
		 State c2=new State();
		             
		             c2.setSId(505);
		             c2.setStateName("B");           
		             c2.setFid(1);
         State c3=new State();
		             
		             c3.setSId(506);
		             c3.setStateName("C");
		             c3.setFid(1);
		             
		             
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