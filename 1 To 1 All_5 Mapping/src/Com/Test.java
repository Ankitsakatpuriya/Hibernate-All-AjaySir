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
/*		 Mobile s = new Mobile();
		 
		 s.setId(1);
		 s.setMobilename("Nokia");
		 
		 User ad = new User();
		 ad.setUid(102);
		 ad.setUname("Ankit");
		 
		 ad.setM(s); 
		 */
//-----------select--------------------------------------------------------
		 Object o = session.get(User.class,1);
		 User a = (User)o;
		 System.out.println(a.getUname());

		 Mobile s1=a.getM();
		 System.out.println(s1.getMobilename());

		 
		   //  session.save(ad);
		 
		     tx.commit();
		     session.close();
		     System.out.println("One to One is Done..!!");
		     factory.close();
		 

	}

}
