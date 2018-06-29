package Oderby;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.hql.ast.tree.Statement;



public class Test {


	public static void main(String[] args) {

		 Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        SessionFactory factory = configuration.buildSessionFactory();
	        
	        
	        Session session = factory.openSession();  
	        Transaction tx = session.beginTransaction();
	       
	        UserDTO emp = (UserDTO) session.load(UserDTO.class,5);
		    System.out.println("UserDTO ID= "+emp.getLastname());
		
			UserDTO emp1 = (UserDTO) session.get(UserDTO.class,4);
			
			System.out.println("UserDTO ID= "+emp1.getFirstname());
			
			
	
			tx.commit();
			session.close();
		}}