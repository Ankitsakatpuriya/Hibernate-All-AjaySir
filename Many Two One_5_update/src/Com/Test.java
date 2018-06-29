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
		
		
		Docoter c1 = (Docoter) s.get(Docoter.class,501);
		City v1 = c1.getPobject();
		v1.setVname("Gandhi");
		c1.setCname("Yogesh");
		Transaction tx = s.beginTransaction();
		s.update(c1);
		
		tx.commit();
		s.close();
	
		
	/*	
		City v = new City();
		v.setVid(1);
		v.setVname("Ford");
		
		Docoter c = new Docoter();
		c.setCid(501);
		c.setCname("Bhopal");
		c.setPobject(v);
		Docoter c1 = new Docoter();
		c1.setCid(502);
		c1.setCname("Pune");
		c1.setPobject(v);
		
		Docoter c3 = new Docoter();
		c3.setCid(503);
		c3.setCname("Ahemdabad");
		c3.setPobject(v);
		Docoter c4 = new Docoter();
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