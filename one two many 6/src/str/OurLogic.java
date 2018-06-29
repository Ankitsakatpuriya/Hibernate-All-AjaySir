package str;

import java.util.HashSet;
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
		
		Cart v =new Cart();
		            
		            v.setCId(1);
		            v.setCName("Ankit");
		            
		            
		            
		 Item c1=new Item();
		             
		             c1.setIId(504);
		             c1.setIName("A");
		             c1.setfId(1);
		 Item c2=new Item();
		             
		             c2.setIId(505);
		             c2.setIName("B");           
		             c2.setfId(1);
         Item c3=new Item();
		             
		             c3.setIId(506);
		             c3.setIName("C");
		             c3.setfId(1);
		             
		             
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
