package Com;

import java.util.HashSet;
import java.util.Set;

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
		
		Object o=session.load(Collage.class,10);
		Collage s=(Collage)o;
		 
		 Transaction tx = session.beginTransaction(); 
		 
		s.setCid(1);   
		 s.setCollagename("A");   // implicitly update method will be called..
		 
		 tx.commit();
		 
		 System.out.println("Object Updated successfully.....!!");
		 session.close();
		 factory.close();
/*	            	Collage v =new Collage();
		            
		            v.setCid(10);
		            v.setCollagename("IFIT");
		       
		            
		            Student c1=new Student();
		             
		             c1.setSid(7);
		             c1.setFirstname("shant");
		             c1.setLastname("han");
		             
		  
		             
		  
		             
		   Set s=new HashSet();
		  
				        s.add(c1);
				        s.add(c2);
				        s.add(c3);
				        s.add(c4);
		        
		        
		              v.setStatecollage(s);
		              
		    Transaction tx = session.beginTransaction();
		    
		                
	           session.update(v);
                          
               tx.commit();
               session.close();  
               System.out.println("One To Many is Done..!!");
               factory.close();
		             
*/

	}

}
