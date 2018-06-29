package Named;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;



public class Test {

	

	public static void main(String[] args) {

		
					
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 Session session = factory.openSession();
		 
		 //Query qry=session.getNamedQuery("Ankit");
		 //qry.setParameter("bike", new Double(15000));
		 Query qry = session.createQuery("from UserDTO where id =1  and bike ='cbz'");

		 List l=qry.list();
		 System.out.println("List total size..._"+l.size());
		 Iterator it=l.iterator();
		 
		 while(it.hasNext())
		 {
		 UserDTO p=(UserDTO)it.next();
		 System.out.println(p.getBike()+"   "+p.getNickname());
		 System.out.println("-----------------");
		 }
		 
		 session.close();
		 factory.close();

			
			
			
			
			
			
			
			
			
		 System.out.println("Object saved successfully.....!!"); 
		 }
		
		}
