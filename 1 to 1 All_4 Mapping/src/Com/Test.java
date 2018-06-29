package Com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession(); 
		 Transaction tx = session.beginTransaction();

	
	
	
	
	
	
	
	
		 Person s=new Person();
		 s.setId(1);
		 s.setPersonname("Swati");
		 
		 License ad = new License();
		 ad.setLid(102);
		 ad.setLicense("a");
		 
		 ad.setP(s); 
		 

		 
		     session.save(ad);
		 
		     tx.commit();
			 
			 session.close();
			     System.out.println("One to One is Done..!!");
			     factory.close();


	}
	

}

/*//---------select-----------------------------------------------------------------		 
		
		 Object o = session.get(Wife.class,1);
		 Wife a = (Wife)o;
		 System.out.println(a.getWifename());

		 Husband s=a.getH();
		 System.out.println(s.getHusbandname());
		 
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
*/		 
