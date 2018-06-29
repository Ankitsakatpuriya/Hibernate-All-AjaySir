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
		Employee v =new Employee();
		            
		            v.setEid(101);
		            v.setEname("Ankit");
		       
		            
		            Department c1=new Department();
		             
		             c1.setId(504);
		             c1.setDname("Prshant");
		  
		             
		             Department c2=new Department();
		             
		             c2.setId(505);
		             c2.setDname("Om"); 
		
		             
		             Department c3=new Department();
		             
		             c3.setId(506);
		             c3.setDname("Rajput");
		       
		             
		             
		             
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

		
		
		
		
		
		Object o=session.get(Employee.class,101);
		Employee v=(Employee)o;
		System.out.println(v.getEid());
		System.out.println(v.getEname());
		 
		Set s=v.getChildren();
		Iterator it = s.iterator();
		 
		while(it.hasNext())
		{
		 
		Object o1 = it.next();
		Department c = (Department) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		System.out.println("---------------------------");
		System.out.println(c.getId());
		System.out.println(c.getDname());
		System.out.println(c.getForevenid());
		System.out.println("---------------------------");
		}
		 
		session.close();
		System.out.println("One To Many is Done for selecting.....!");
		factory.close();
		 
		}
		}
		Object o = session.get(Employee.class,101);		 
		Employee v = (Employee)o;		
		              
		    Transaction tx = session.beginTransaction();		                
		                      session.delete(v);		                     
		    tx.commit();
		    
		    session.close();
		    System.out.println("One To Many is Done for deleting..!!");
		    factory.close();
	}}
*/
		Query qry =session.createQuery("from Employee v");
		List l=qry.list();
		Iterator it = l.iterator();
		   
		Transaction tx = session.beginTransaction();		                
         
		   while(it.hasNext())
		   {
			   
			   Object o = it.next();
			   Employee v = (Employee) o;
			   session.delete(v);
		   }
     		                     
		    tx.commit();
		    
		    session.close();
		    System.out.println("One To Many is Done for deleting all parents with childs...!");
		    factory.close();
		             
		             
		
	}
}
