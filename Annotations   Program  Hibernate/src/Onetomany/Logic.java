package Onetomany;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;




public class Logic { 
	 
	 public static void main(String[] args)
	 {
	 
	 AnnotationConfiguration cfg = new AnnotationConfiguration();
	 cfg.configure("hibernate.cfg.xml"); 
	 
	 SessionFactory factory = cfg.buildSessionFactory();
	 Session session = factory.openSession(); 
	/*
	      Vendor v=new Vendor();
	       v.setVendorId(100);
	       v.setVendorName("java4s");
	 
	       Customers c1=new Customers();
	       c1.setCustomerId(500);
	       c1.setCustomerName("customer1");
	 
	       Customers c2=new Customers();
	       c2.setCustomerId(501);
	       c2.setCustomerName("customer2");
	 
	       Set s=new HashSet();
	       s.add(c1);
	       s.add(c2);
	 
	       v.setChildren(s);
	 
	       Transaction tx=session.beginTransaction();
	            session.save(v);
	       tx.commit();
	*/ 
	 
//--------- Select------------------------------------------------------------------------------------
	 /*Object o=session.get(Vendor.class,100);
	 Vendor v=(Vendor)o;
		System.out.println(v.getVendorId());
		
		 
		Set s= v.getChildren();
		Iterator it = s.iterator();
		 
		while(it.hasNext())
		{
		 
		Object o1 = it.next();
		Customers c = (Customers) o1;
	
		System.out.println(c.getCustomerId());
		System.out.println(c.getCustomerName());
		
		}*/
	 
	//---------Update--------------------------------------------------------
	
	 Vendor v = (Vendor) session.get(Vendor.class,100);
	 Vendor a = new Vendor();
       
      a.setVendorId(100);
      v.setVendorName("Sakatpuriya");
	           
     session.update(v);
   
	 session.close();
	 System.out.println("One to Many Annotatios Done...!!!!!!");
	 factory.close();
	 }
	 
	}

	
