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
		
	
		/*India v = new India();
		v.setTid(1);
		v.setTname("INDIA");
		
		Company c = new Company();
		c.setSid(101);
		c.setSname("TVS");
		c.setSobject(v);
		
		
		Company c1 = new Company();
		c1.setSid(102);
		c1.setSname("HOUNDA");
        c1.setSobject(v);
		
		Company c3 = new Company();
		c3.setSid(103);
		c3.setSname("FORD");
		c3.setSobject(v);
	
		Company c4 = new Company();
		c4.setSid(104);
		c4.setSname("HERO");
	    c4.setSobject(v);

     Transaction tx = s.beginTransaction();
     
		s.save(c);
		s.save(c1);
		
		s.save(c3);
		s.save(c4);
		
		
	tx.commit();
	s.close();
    System.out.println("One To Many is Done..!!");
    sf.close();*/
		
		
		Object o = s.get(Company.class, new Integer(101));		 
		Company c = (Company)o;		
		              
		    Transaction tx = s.beginTransaction();		                
		                      s.delete(c);		                     
		    tx.commit();
		    
		    s.close();
		    System.out.println("many to one delete done..!!");
		    sf.close();       

	}


	}


		