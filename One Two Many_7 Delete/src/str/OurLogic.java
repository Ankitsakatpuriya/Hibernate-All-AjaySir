package str;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class OurLogic {

	public static void main(String args[])
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		Query qry =session.createQuery("from Country v");
		List l=qry.list();
		Iterator it = l.iterator();
		   
		Transaction tx = session.beginTransaction();		                
         
		   while(it.hasNext())
		   {
			   
			   Object o = it.next();
			   Country v = (Country) o;
			   session.delete(v);
		   }
     		                     
		    tx.commit();
		    
		    session.close();
		    System.out.println("One To Many is Done for deleting all parents with childs...!");
		    factory.close();
		             
		             
		
	}
}
