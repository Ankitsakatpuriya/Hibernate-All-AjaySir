package Named_Query;

import java.util.Iterator;  
import java.util.List;  
  
import org.hibernate.cfg.AnnotationConfiguration;  
import org.hibernate.*;  
  
public class javafile {  
 public static void main(String[] args) {  
  
  AnnotationConfiguration configuration=new AnnotationConfiguration();  
   configuration.configure("hibernate.cfg.xml");  
   SessionFactory sFactory=configuration.buildSessionFactory();  
    Session session=sFactory.openSession();  
    Transaction tx = session.beginTransaction();
    
/*    Employee e = new Employee();
           e.setId(25);
           e.setJob("aartek");
           e.setName("par.");
           e.setSalary(4000000);
           session.save(e);
    tx.commit();       
           session.close();
*/           

    Query query = session.getNamedQuery("findEmployeeByName");  
    query.setString("name", "SWATI");  
          
    List<Employee> employees=query.list();  
          
    Iterator<Employee> itr=employees.iterator();  
     while(itr.hasNext()){  
    Employee e=itr.next();  
    System.out.println(e);  
     }  
          
    session.close();  
      
  }  
}  
