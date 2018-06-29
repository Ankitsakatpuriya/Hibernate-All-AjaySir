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
		
		 BJP s=new BJP();
		 s.setId(1);
		 s.setName("Ankit");
		 
		 Modi ad = new Modi();
		 ad.setId(102);
		 ad.setName("Itarsi");
		 
		 ad.setParty(s); 
		 

		 
		     session.save(ad);
		 
		     tx.commit();
		 
		     session.close();
		     System.out.println("One to One is Done..!!");
		     factory.close();
		 
		 }
		


	}

