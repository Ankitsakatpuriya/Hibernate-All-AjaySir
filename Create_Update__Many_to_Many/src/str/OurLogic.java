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
		Transaction tx = session.beginTransaction();
		
		Object o = session.get(Student.class, 101);		 
		Student c = (Student)o;		
		              
		    		                
		     session.delete(c);		                     
		    tx.commit();
		    
		    session.close();
		    System.out.println("many to one delete done..!!");
		    factory.close();       

		
		
		
		
		
		
	}}
//----------SELECT-----------------------------------------------------------------------

		
		// Select one element
		/*		
		Object o = s.get(Student.class,101);		 
		Student c = (Student)o;
		
		System.out.println(c.getStudentName());
		Set ss=c.getCourses();
		Iterator it = ss.iterator();

		
		while (it.hasNext()) 
		{
			Course o1 = (Course) it.next();
			o1.setCourseName("Ankit");
			
		    System.out.println(o1.getCourseName()); 
		}
		
		    s.close();
		    System.out.println("many to many delete done..!!");
		    factory.close();       

		
	}}
	
	
		
		


	     Query qry=s.createQuery("from Student c");
		    
		    List l=qry.list();
		    Iterator it = l.iterator();
		    while(it.hasNext())
		    {
		    	Object o = it.next();
		    	Student c = (Student)o;
		    	System.out.println(c.getCname());
		    	Vendor v=c.getPobject();
		    	System.out.println(v.getVname());
		    }
		    
		    s.close();
			    System.out.println("many to one select done..!!");
			    sf.close();       

			
		}
	}
			
		

		
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//----------UPDATE-------------------------------------------------------------------------------------------------------------
			
		/*Student c1 = (Student) s.get(Student.class,101);
		c1.setStudentName("An");
		Set v = c1.getCourses();
		Iterator it = v.iterator();
		
		while (it.hasNext()) {
			Course o = (Course) it.next();
			o.setCourseName("Ankit");
			
			s.update(c1);
		}
		tx.commit();
		s.close();*/
		
		
//----------CREATE--------------------------------------------------------------------------------		
		/*Student s1=new Student();
		s1.setStudentId(100);
		s1.setStudentName("James");
		s1.setMarks(98);
		
		Student s2=new Student();
		s2.setStudentId(101);
		s2.setStudentName("Lee");
		s2.setMarks(99);
		
		
		
		
		Course c1=new Course();
		c1.setCourseId(500);
		c1.setCourseName("Hibernate");
		c1.setDuration(7);
		
		Course c2=new Course();
		c2.setCourseId(501);
		c2.setCourseName("Java");
		c2.setDuration(30);
		
		
		Set s =new HashSet();
		      s.add(c1);
		      s.add(c2);
		
		s1.setCourses(s);
		s2.setCourses(s);
		
		
		    Transaction tx = session.beginTransaction();
		                
		                      session.save(s1);
		                      session.save(s2);
		                     
		    tx.commit();
		    
		 	    
		    session.close();
		    System.out.println("Many To Many Bi-Directional is Done..!!");
		    factory.close();*/
		             
		             
