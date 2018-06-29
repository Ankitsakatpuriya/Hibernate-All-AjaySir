package Com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Logic {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
	        
	        Creditcard c=new Creditcard();
	        
	        c.setPaymentid(10);
	        c.setAmount(2500);
	        c.setCreaditcardType("Visa");
	 
	 
	        
	        Cheque c1=new Cheque();
	        
	        c1.setPaymentid(11);
	        c1.setAmount(2600);
	        c1.setChequeType("ICICI");
	 
	        
	        
	        Transaction tx = session.beginTransaction();
	        session.save(c);
	        session.save(c1);
	        System.out.println("Object saved successfully.....!!");
	        tx.commit();
	        session.close();
	        factory.close();
	    }
	 
	}
