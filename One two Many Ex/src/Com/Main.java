package Com;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {
	public static void main(String[] args)
	{
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 
	
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();		
	
	Classs v =new Classs();
	            
	            v.setId(1);
	            v.setMobileno(8874545);
	            v.setClassname("A");
	            
	            
	            
	 Student c1=new Student();
	             
	             c1.setStudentid(501);
	             c1.setStudentname("Ankit");
	             c1.setStudentmobile(879544);
	             
	             
	             
	             
	             
	             
	           Set s1=new HashSet();
	  
			        s1.add(c1);
			     
	              v.setS(s1);
	              
	    Transaction tx = session.beginTransaction();
	                
	                      session.save(v);
	                     
	    tx.commit();
	    session.close();
	    System.out.println("One To Many is Done..!!");
	    factory.close();
	             
	             
	
}
}

	
	


