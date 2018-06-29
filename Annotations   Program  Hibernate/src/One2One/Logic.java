package One2One;


	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
	 
	public class Logic {
	 public  static  void main(String args[])
	 {
	 
		  AnnotationConfiguration cfg = new AnnotationConfiguration();
	 cfg.configure("hibernate.cfg.xml"); 
	 
	 SessionFactory factory = cfg.buildSessionFactory();
	 Session session = factory.openSession();
	 
	 PP  s = new PP();
	 s.setPpid(101);
	 s.setPpname("James");
	
	 
	 Student  ad = new Student();
	 ad.setStudentid(1);
	 ad.setStudentname("Carolina");
	 
	 ad.setP(s);
	 Transaction  tx = session.beginTransaction();
	 session.save(ad);
	 tx.commit();
	 session.close();
	 System.out.println("One to One with annotations is done..!!!!");
	 factory.close();
	 }
	}

