package Com;

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
		
		/*
		Vendor v = new Vendor();
		v.setVid(1);
		v.setVname("Ford");
		
		Customer c = new Customer();
		c.setCid(501);
		c.setCname("Bhopal");
		c.setPobject(v);
		Customer c1 = new Customer();
		c1.setCid(502);
		c1.setCname("Pune");
		c1.setPobject(v);
		
		Customer c3 = new Customer();
		c3.setCid(503);
		c3.setCname("Ahemdabad");
		c3.setPobject(v);
		Customer c4 = new Customer();
		c4.setCid(504);
		c4.setCname("Itarsi");
		c4.setPobject(v);

     Transaction tx = s.beginTransaction();
     
		s.save(c);
		s.save(c1);
		s.save(c3);
		//s.save(c4);
		
		
	tx.commit();
	s.close();
    System.out.println("One To Many is Done..!!");
    sf.close();
	*/
		
		// select
	 Object o = s.get(Customer.class,501);
		 /*Customer c = (Customer)o;
		 
		 System.out.println(c.getCid());
		 Vendor v=c.getPobject();
		 System.out.println(v.getVid()); 
*/		 
		     s.close();
		     System.out.println("many to one select is done..!!");
		     sf.close();       

	
		
	// Delete for table
		/*  
		 Object o = s.get(Vendor.class,1);
		Vendor c = (Vendor)o; 
		 
		     Transaction tx = s.beginTransaction();
		     s.delete(c);
		     tx.commit();
		 
		     s.close();
		     System.out.println("many to one delete done..!!");
		     sf.close();      */ 
	}}