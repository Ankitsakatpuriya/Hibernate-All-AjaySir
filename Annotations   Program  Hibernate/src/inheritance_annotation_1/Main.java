package inheritance_annotation_1;

import org.hibernate.*;  
import org.hibernate.cfg.*;  
  
public class Main {  
public static void main(String[] args) {  
    AnnotationConfiguration cfg=new AnnotationConfiguration();  
    Session session=cfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();  
      
    Transaction t=session.beginTransaction();  
      
    Employeee e1=new Employeee();  
    e1.setName("sonoo");  
      
    Regular_Employee e2=new Regular_Employee();  
    e2.setName("Ankit Sakatpuriya");  
    e2.setSalary(50000);  
    e2.setBonus(5);  
      
    Contract_Employee e3=new Contract_Employee();  
    e3.setName("Prshant Chohuan");  
    e3.setPay_per_hour(1000);  
    e3.setContract_duration("15 hours");  
      
    session.persist(e1);  
    session.persist(e2);  
    session.persist(e3);  
      
    t.commit();  
    session.close();  
    System.out.println("success");  
}  
}  