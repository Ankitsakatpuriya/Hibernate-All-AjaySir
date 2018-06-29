package Com;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class T {

	public static void main(String[] args) {
		 Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession(); 
		 
		 Teacher s1=new Teacher();
		 s1.setTid(100);
		 s1.setTname("James");
		 s1.setMobileno(98);
		 
		 Teacher s2=new Teacher();
		 s2.setTid(102);
		 s2.setTname("WWW");
		 s2.setMobileno(99);
		 
		 Student c1=new Student();
		 c1.setSid(500);
		 c1.setSname("Hibernate");
		 c1.setDuration(7);
		 
		 Student c2=new Student();
		 c2.setSid(501);
		 c2.setSname("Java");
		 c2.setDuration(30);
		 
		 Set s =new HashSet();
		       s.add(c1);
		       s.add(c2);
		 
		 s1.setStudent(s);
		 s2.setStudent(s);
		 
		     Transaction tx = session.beginTransaction();
		 
		                       session.save(s1);
		                       session.save(s2);
		 
		     tx.commit();
		 
		     session.close();
		     System.out.println("Many To Many Bi-Directional is Done..!!");
		     factory.close();
		 
		 

	}

}
