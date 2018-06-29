package Com;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
	
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		 Transaction tx = s.beginTransaction();
		
		
		
		 Vendor c1=new Vendor();
		 c1.setId(100);
		 c1.setName("James");
		 c1.setCompany("A");
		 
		 Customer s2=new Customer();
		 s2.setId(101);
		 s2.setCustomername("Lee");
		 s2.setAddress("a");
		 

		 Customer s3=new Customer();
		 s3.setId(102);
		 s3.setCustomername("Leeee");
		 s3.setAddress("aaa");
		 
		
		 
		 Set<Customer> s1 =new HashSet<Customer>();
		       s1.add(s2);
		       s1.add(s3);
		 
		c1.setCustomer(s1);
	//	c1. setCustomer(s1);
		 
		    
		 
		                       s.save(s1);
		                      // s.save(s2);
		 
		     tx.commit();
		 
		     s.close();
		     System.out.println("Many To Many  is Done..!!");
		     sf.close();
		 
		 }
		}  

	
	