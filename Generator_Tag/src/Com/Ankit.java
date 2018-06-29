package Com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Ankit {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		 cfg.configure("Userdto.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 Transaction tx = session.beginTransaction();
 
		 UserDTO u = new UserDTO();
	  
	      tx.commit();
		 session.close();
		 System.out.println("successfully saved");	
	}
	
}
