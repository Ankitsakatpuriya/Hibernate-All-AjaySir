package Com;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

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
		
		
	/*	City v = new City();
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
		
		//	select all
		Query qry=s.createQuery("from Docoter c");
		 
	     List l=qry.list();
	     Iterator it = l.iterator();
	     while(it.hasNext())
	     {
	      Object o = it.next();
	      Docoter c = (Docoter)o;
	      System.out.println(c.getCname());
	      City v=c.getPobject();
	      System.out.println(v.getVname());
	     }
	 
	     s.close();
	     System.out.println("many to one select done..!!");
	     sf.close();       
	 
	 }
	}
		
		
		/*// select get on id 
		Object o = s.get(Docoter.class,501);
		Docoter c = (Docoter)o;
		 
		 System.out.println(c.getCid());
		 City v=c.getPobject();
		 System.out.println(v.getVname()); 
		 
		     s.close();
		     System.out.println("many to one select is done..!!");
		     sf.close();       
		 
		 }
		}
	*/