package str;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

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
		
		  
		    
		    
/*		    Vendor v =new Vendor();
		            
		            v.setVendorId(101);
		            v.setVendorName("java4s");
		            
		            
		            
		 Customer c1=new Customer();
		             
		             c1.setCustomerId(504);
		             c1.setCustomerName("A");
		             
		 Customer c2=new Customer();
		             
		             c2.setCustomerId(505);
		             c2.setCustomerName("B");           
		             
         Customer c3=new Customer();
		             
		             c3.setCustomerId(506);
		             c3.setCustomerName("C");
		             
		             
		             
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
*/		             

	        
		Object o=session.get(Vendor.class,101);
		/*
		Vendor v=(Vendor)o;
		System.out.println(v.getVendorId());
		System.out.println(v.getVendorName());
		 
		Set s=v.getChildren();
		Iterator it = s.iterator();
		 
		while(it.hasNext())
		{
		 
		Object o1 = it.next();
		Customer c = (Customer) o1;
		System.out.println("---------------------------");
		System.out.println("Customer objects...");
		
		System.out.println(c.getCustomerId());
		System.out.println(c.getCustomerName());
		System.out.println(c.getForevenId());
		System.out.println("---------------------------");
		}
		 */
		session.close();
		System.out.println("One To Many is Done for selecting.....!");
		factory.close();
		
		
		
		
		
	}
}
