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
		
		
/*		City v = new City();
		v.setVid(1);
		v.setVname("itarsi");
		
		Area c = new Area();
		c.setCid(501);
		c.setCname("old itarsi");
		c.setPobject(v);
		Area c1 = new Area();
		c1.setCid(502);
		c1.setCname("Deewan");
		c1.setPobject(v);
		
		Area c3 = new Area();
		c3.setCid(503);
		c3.setCname("LIGColony");
		c3.setPobject(v);
		Area c4 = new Area();
		c4.setCid(504);
		c4.setCname("Ram");
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
	*/
		/*
//		select all
			Query qry=s.createQuery("from Area c");
			 
		     List l=qry.list();
		     Iterator it = l.iterator();
		     while(it.hasNext())
		     {
		      Object o = it.next();
		      Area c = (Area)o;
		      System.out.println(c.getCname());
		      City v=c.getPobject();
		      System.out.println(v.getVname());
		     }
		 
		     s.close();
		     System.out.println("many to one select done..!!");
		     sf.close();       
		 
		 }
		}
			
			*/
			// select get on id 
			Object o = s.get(Area.class,501);
			Area c = (Area)o;
			 
			 System.out.println(c.getCid());
			 City v=c.getPobject();
			 System.out.println(v.getVname()); 
			 
			     s.close();
			     System.out.println("many to one select is done..!!");
			     sf.close();       
			 
			 }
			}
		
	