package COM;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Coching {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
       /*
       PP p = new PP();
       p.setAge(26);
       p.setMobile(8526);
       p.setStudentname("Ayushi");
       
       */
       
       s.enableFilter("studentname");
       Query query = s.createQuery("from PP p ");
       List list = query.list();
       Iterator it = list.iterator();
       
       while (it.hasNext()) {
       PP student = (PP) it.next();
       System.out.println(student.getStudentname());
       //System.out.println(student.getMobile());
       }
        
      // disabling the studentName filter after the operation
       s.disableFilter("studentname");
    s.close();
	}
}
