package Com;

import java.util.*;

import org.hibernate.Query;
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
		
		/*
		Assignments v =new Assignments();
		            
		            v.setAid(2);
		            v.setAname("Ankit");
		       
		            
		            Questions c1=new Questions();
		             
		             c1.setQid(201);
		             c1.setQno("2");
		             c1.setForevenid(2);
		  
		             
		             Questions c2=new Questions();
		             
		             c2.setQid(202);
		             c2.setQno("3"); 
		             c2.setForevenid(2);
		
		             
		             Questions c3=new Questions();
		             
		             c3.setQid(203);
		             c3.setQno("4");
		             c3.setForevenid(2);
		       
		             
		             
		             
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

		Object o=session.get(Assignments.class, new Integer(2));
		Assignments v=(Assignments)o;
		System.out.println(v.getAid());
		System.out.println(v.getaname());
		 
		Set s=v.getChildren();
		Iterator it = s.iterator();
		 
		while(it.hasNext())
		{
		 
		Object o1 = it.next();
		Questions c = (Questions) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		System.out.println("---------------------------");
		System.out.println(c.getQid());
		System.out.println(c.getQno());
		System.out.println(c.getForevenid());
		System.out.println("---------------------------");
		}
		 
		session.close();
		System.out.println("One To Many is Done for selecting.....!");
		factory.close();
		 
		}
		}*/
		Query qry =session.createQuery("from Questions v");
		List l=qry.list();
		Iterator it = l.iterator();
		   
		Transaction tx = session.beginTransaction();		                
         
		   while(it.hasNext())
		   {
			   
			   Object o = it.next();
			    Questions v = (Questions) o;
			   session.delete(v);
		   }
     		                     
		    tx.commit();
		    
		    session.close();
		    System.out.println("One To Many is Done for deleting all parents with childs...!");
		    factory.close();
		             
		             
		
	}
}
