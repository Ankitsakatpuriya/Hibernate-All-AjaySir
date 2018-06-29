package OneToMany2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;




public class Test1 { 
	 
	 public static void main(String[] args)
	 {
	 
	 AnnotationConfiguration cfg = new AnnotationConfiguration();
	 cfg.configure("hibernate.cfg.xml"); 
	 
	 SessionFactory factory = cfg.buildSessionFactory();
	 Session session = factory.openSession(); 

/*	 Mobile v=new Mobile();
	       v.setMobileid(1);
	       v.setMobilename("Mihani");
	 
	       Shop c1=new Shop();
	       c1.setShopid(500);
	       c1.setShopname("A");
	 
	       Shop c2=new Shop();
	       c2.setShopid(501);
	       c2.setShopname("B");
	 
	       Set s=new HashSet();
	       s.add(c1);
	       s.add(c2);
	 
	       v.setChild(s);
	 
	       Transaction tx=session.beginTransaction();
	            session.save(v);
	       tx.commit();
	*/
	 
//--------- Select------------------------------------------------------------------------------------
	Object o=session.get(Mobile.class,1);
	 Mobile v=(Mobile)o;
		System.out.println(v.getMobilename());
		
		 
		Set s= v.getChild();
		Iterator it = s.iterator();
		 
		while(it.hasNext())
		{
		 
		Object o1 = it.next();
		Shop c = (Shop) o1;
	
		System.out.println(c.getShopid());
		System.out.println(c.getShopname());
		
		//Transaction tx=session.beginTransaction();
        session.save(v);
      
	 
		 }
	
}}