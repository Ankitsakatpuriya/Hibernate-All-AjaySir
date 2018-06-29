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




public class Test {

	public static void main(String args[])
	{
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
		
		/*Teacher v =new Teacher();
		            
		            v.setTId(101);
		            v.setTName("Ajay");
		            
		            
		            
		 Student c1=new Student();
		             
		  c1.setSId(301);
		  c1.setSName("An");
		  c1.setfId(101);           
		 Student c2=new Student();
		             
		 c2.setSId(302);
         c2.setSName("SA");
         c2.setfId(101);

         Student c3=new Student();
         c3.setSId(303);
         c3.setSName("Ram");
         c3.setfId(101);
         Set s=new HashSet();
		  
				        s.add(c1);
				        s.add(c2);
				        s.add(c3);
		        
		        
		              v.setChildren(s);
		              
		    Transaction tx = session.beginTransaction();
		                
		                      session.save(v);
		                     
		    tx.commit();
		    session.close();
		    System.out.println("One To Many is Done..!!");
		    factory.close();
		             
		             
		
	}
}
*/
		Query qry =session.createQuery("from Student v");
		List l=qry.list();
		Iterator it = l.iterator();
		   
		Transaction tx = session.beginTransaction();		                
         
		   while(it.hasNext())
		   {
			   
			   Object o = it.next();
			    Student v = (Student) o;
			   session.delete(v);
		   }
     		                     
		    tx.commit();
		    
		    session.close();
		    System.out.println("One To Many is Done for deleting all parents with childs...!");
		    factory.close();
		             
		             
		
	}
}
