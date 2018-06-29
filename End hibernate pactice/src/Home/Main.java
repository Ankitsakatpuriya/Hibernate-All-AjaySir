package Home;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory s = cfg.buildSessionFactory();
		
		Session Session= s.openSession();
		Transaction tx = Session.beginTransaction();
		
	Person p1 = new Person();
		p1.setMobile(07);
		p1.setPersonname("A");
		
		Person p2 = new Person();
		p2.setMobile(3100000);
		p2.setPersonname("Saya");
		
		Session.save(p1);
		Session.save(p2);
		Session.update(p1);
		Session.update(p2);
		 System.out.println("Done");
		 tx.commit();
		 
		 Session.close();
		 s.close();
			
		}

	}