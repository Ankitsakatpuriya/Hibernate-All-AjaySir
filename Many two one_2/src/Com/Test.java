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
		
		
		Aartek v = new Aartek();
		v.setVid(1);
		v.setVname("Aartek");
		
		Employee c = new Employee();
		c.setCid(101);
		c.setCname("Ram");
		c.setPobject(v);
		Employee c1 = new Employee();
		c1.setCid(102);
		c1.setCname("Syam");
		c1.setPobject(v);
		
		Employee c3 = new Employee();
		c3.setCid(103);
		c3.setCname("Prdeep");
		c3.setPobject(v);
		Employee c4 = new Employee();
		c4.setCid(104);
		c4.setCname("Om");
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