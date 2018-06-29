package Com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class X {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
       Transaction ts = s.beginTransaction();
		
		
      	
         
        // enabling the studentName filter
        s.enableFilter("mobilename");
        Query query = s.createQuery("from Mobile s");
        List list = query.list();
        Iterator it = list.iterator();
        while (it.hasNext()) {
        Mobile student = (Mobile) it.next();
System.out.println("Student Names which starting with %c' : " + student.getMobilename());
 
        }
         
       // disabling the studentName filter after the operation
        s.disableFilter("mobileame");
        System.out.println("Age Filter");
    }}        
