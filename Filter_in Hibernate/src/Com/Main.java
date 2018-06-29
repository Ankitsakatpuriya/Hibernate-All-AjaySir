package Com;

import java.util.Iterator;
import java.util.List;
 
import org.hibernate.Filter;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;


 
public class Main {
 
    public static void main(String[] args) {
    	Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
       Transaction ts = s.beginTransaction();
		
       
      /* Student s = new Student();
       s.setAge(11);
       s.setStudentName("rupali");
       s.setAddress("Uk");*/
       
       
       
       
       

   
       
         
        // enabling the studentName filter
        s.enableFilter("studentName");
        Query query = s.createQuery("from Student s");
        List list = query.list();
        Iterator it = list.iterator();
        while (it.hasNext()) {
        Student student = (Student) it.next();
//System.out.println(student.getStudentName());

System.out.println(student.getAddress());
        }
         
       // disabling the studentName filter after the operation
        s.disableFilter("studentName");
        System.out.println("Age Filter");
           
        /*// enabling the age filter
        Filter filter = s.enableFilter("ageFilter");
        filter.setParameter("age1", 18);
 
        Query query2 = s.createQuery("from Student s");
        List list2 = query2.list();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            Student student = (Student) it2.next();
            System.out.println("studentNames who are age >= 20 : " + student.getStudentName());
 
        }
         
 
        s.disableFilter("ageFilter");*/
    
    /*   ss.save(s);*/
        ts.commit();
        //s.clear();
     s.close();
}   }
 
