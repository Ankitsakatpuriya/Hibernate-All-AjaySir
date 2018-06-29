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
		
		
		Presnt v = new Presnt();
		v.setPid(1);
		v.setPcity("itarsi");
		
		Child c = new Child();
		c.setCid(501);
		c.setCfirstname("Ankit");
		c.setClastname("Kumar");
		c.setPobject(v);
		
		Child c1 = new Child();
		c1.setCid(502);
		c1.setCfirstname("Ram");
		c1.setClastname("Yadv");
		c1.setPobject(v);
		
		Child c3 = new Child();
		c3.setCid(503);
		c3.setCfirstname("Prsahnt");
		c3.setClastname("chouhan");
		c3.setPobject(v);
		
		Child c4 = new Child();
		c4.setCid(504);
		c4.setCfirstname("Itarsi");
		c4.setClastname("Pal");
		c4.setPobject(v);

     Transaction tx = s.beginTransaction();
     
		s.save(c);
		s.save(c1);
		s.save(c3);
		s.save(c4);
		
		
	tx.commit();
	s.close();
    System.out.println("One To Many is Done..!!");
    sf.close();
	
		
		// select
		/* Object o = s.get(Customer.class,501);
		 Customer c = (Customer)o;
		 
		 System.out.println(c.getCid());
		 Vendor v=c.getPobject();
		 System.out.println(v.getVid()); 
		 
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