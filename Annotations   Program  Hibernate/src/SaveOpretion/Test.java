package SaveOpretion;

import javax.transaction.Synchronization;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		
		AnnotationConfiguration cfg = new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Indigo i = new Indigo();
		i.setMobileno(887349426);
		i.setPersonename("Ankit");
		i.setPersonid(1);
		
		
		Transaction tx = s.beginTransaction();
		s.save(i);
        System.out.println("Object saved successfully using annotations.....!!");
        tx.commit();
        s.close();
        sf.close();
	}

}
