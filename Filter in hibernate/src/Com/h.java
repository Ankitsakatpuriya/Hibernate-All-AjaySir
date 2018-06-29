package Com;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class h {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("h.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
       Transaction ts = s.beginTransaction();
	
      /* Home h = new Home();
       h.setId(4);
       h.setMobile(7588355);
       h.setName("csaa");
       s.save(h);
       */
       s.enableFilter("Name");
        Query query = s.createQuery("from name s");
        List list = query.list();
        Iterator it = list.iterator();
        while (it.hasNext()) {
        Home student = (Home) it.next();
        System.out.println("Student Names which starting with %c' : " + student.getName());
      s.close();
      ts.commit();
       
}}}