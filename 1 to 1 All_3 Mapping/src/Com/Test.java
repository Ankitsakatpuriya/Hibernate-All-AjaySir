package Com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession(); 
		 Transaction tx = session.beginTransaction();
		
		 		 
		 
//--------------------Create--------------------------------------------------------
/*		 Husband s=new Husband();
		 s.setId(1);
		 s.setHusbandname("Swati");
		 
		 Wife ad = new Wife();
		 ad.setWid(102);
		 ad.setWifename("Priya");
		 
		 ad.setH(s); 
		 

		 
		     session.save(ad);
		 
		     tx.commit();
		*/ 
		
		 
//---------select-----------------------------------------------------------------		 
		/*
		 Object o = session.get(Wife.class,1);
		 Wife a = (Wife)o;
		 System.out.println(a.getWifename());

		 Husband s=a.getH();
		 System.out.println(s.getHusbandname());
*/		 
//--------update-----------------------------------------------------------------------
		 
		 Object o = session.get(Wife.class,1);
		 Wife a = (Wife)o;
		 System.out.println(a.getWifename());

		 Husband s=a.getH();
		 
		 s.setHusbandname("A");
		 System.out.println(s.getHusbandname());

		 a.setH(s);
		 session.update(a);

		 
		 
		 session.close();
		     System.out.println("One to One is Done..!!");
		     factory.close();
		 
		 }
		}
		 

