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
		
		 
		 Object o = session.get(Teacher.class,1);
		 Teacher a = (Teacher)o;
		 System.out.println(a.getTid());

		 Student s=a.getS();
		 System.out.println(s.getSid());
		 
		 
		 }}

		 
		 
//--------------------Create--------------------------------------------------------
		/* Student s=new Student();
		 s.setSid(1);
		 s.setSno("1244");
		 
		 Teacher ad = new Teacher();
		 ad.setTid(102);
		 ad.setTname("Itarsi");
		 
		 ad.setS(s); 
		 

		 
		     session.save(ad);
		 
		     tx.commit();
		 
		     session.close();
		     System.out.println("One to One is Done..!!");
		     factory.close();
		 
		 }
		}
		 
*/ 

