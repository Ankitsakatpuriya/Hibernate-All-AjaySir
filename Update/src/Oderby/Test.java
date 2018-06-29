package Oderby;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.hql.ast.tree.Statement;



public class Test {

	

	private static final String ID = null;

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
     
        
        
        
        
        UserDTO student2 = (UserDTO) session.get(UserDTO.class,2);
      //  UserDTO a = new UserDTO();
        
     //   a.setId(2);
      student2.setFirstname("rajputi");
 	           
   //   session.update(student2);
    session.merge(student2);
        tx.commit();
 
        
        session.close();
       
       
        
       
		 System.out.println("saved successfully.....!!");
		 
		 
		 
		 		        
							        
							        
							        
							        
	}}