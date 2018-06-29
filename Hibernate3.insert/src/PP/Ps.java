package PP;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Ps {

	public static void main(String[] args)throws Exception {
						
			
				 	COC c = new COC();
					c.setFirstname("A");
					c.setLastname("S");
					c.setMobile("888");
					c.setPincode("4001");

					Configuration cfg = new Configuration();
					 cfg.configure("hibernate.cfg.xml"); 
					 
					 SessionFactory factory = cfg.buildSessionFactory();
					 Session session = factory.openSession();
					 Transaction tx = session.beginTransaction();
					 session.save(c);
					 tx.commit();
					 session.close();
				
					
				 System.out.println("saved successfully.....!!");
				 
				 
				
				
		
		
		
	}

}
