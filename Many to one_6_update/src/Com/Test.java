package Com;

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
		
		Country c1 = (Country) s.get(Country.class,101);
		World v1 = c1.getSobject();
		v1.setTname("Gandhi");
		c1.setSname("Yogesh");
		Transaction tx = s.beginTransaction();
		s.update(c1);
		
		tx.commit();
		s.close();
	
		
		/*
		World v = new World();
		v.setTid(1);
		v.setTname("World");
		
		Country c = new Country();
		c.setSid(101);
		c.setSname("UK");
		c.setSobject(v);
		
		
		Country c1 = new Country();
		c1.setSid(102);
		c1.setSname("US");
        c1.setSobject(v);
		
		Country c3 = new Country();
		c3.setSid(103);
		c3.setSname("INDIA");
		c3.setSobject(v);
	
		Country c4 = new Country();
		c4.setSid(104);
		c4.setSname("Japan");
	    c4.setSobject(v);

     Transaction tx = s.beginTransaction();
     
		s.save(c);
		s.save(c1);
		
		s.save(c3);
		s.save(c4);
		
		
	tx.commit();
	s.close();
    System.out.println("One To Many is Done..!!");
    sf.close();
*/	}


	}


