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
		
		Student v =new Student();
		            
		            v.setSId(1);
		            v.setSName("PPoint");
		            
		            
		            
		 PP c1=new PP();
		             
		             c1.setPPId(501);
		             c1.setPPName("1");
		             c1.setfId(1); 
		 PP c2=new PP();
		             
		             c2.setPPId(502);
		             c2.setPPName("2");           
		             c2.setfId(1);
         PP c3=new PP();
        
         c3.setPPId(503);
         c3.setPPName("3"); 
         c3.setfId(1);           
         PP c4=new PP();
         
         c2.setPPId(505);
         c2.setPPName("5");           
         c2.setfId(1);
             
		             
		             
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
		