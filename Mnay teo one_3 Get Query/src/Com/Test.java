package Com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
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
    sf.close();
	}


	}
*/

		//	select all
		/*Query qry=s.createQuery("from Company c");
		 
	     List l=qry.list();
	     Iterator it = l.iterator();
	     while(it.hasNext())
	     {
	      Object o = it.next();
	      Company c = (Company)o;
	      System.out.println(c.getSname());
	      India v=c.getSobject();
	      System.out.println(v.getTname());
	     }
	 
	     s.close();
	     System.out.println("many to one select done..!!");
	     sf.close();       
	 
	 }
	}
		*/
		
		// select get on id 
		Object o = s.get(Company.class,101);
		Company c = (Company)o;
		 
		 System.out.println(c.getSid());
		 India v=c.getSobject();
		 System.out.println(v.getTname()); 
		 
		     s.close();
		     System.out.println("many to one select is done..!!");
		     sf.close();       
		 
		 }
		}
		