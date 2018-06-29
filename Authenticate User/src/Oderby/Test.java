package Oderby;


import java.util.List;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.hql.ast.tree.Statement;
import org.hibernate.usertype.UserType;



public class Test {


	public static void main(String[] args) {

		    Configuration configuration = new Configuration();
	        configuration.configure("hibernate.cfg.xml");
	        SessionFactory factory = configuration.buildSessionFactory();
	        
	      
	        Session session1 = factory.openSession();
	         
	       UserDTO s1 = null;
	        Object o = session1.get(UserDTO.class,1);
	        s1 = (UserDTO)o;
	        session1.close();
	         
	        s1.setTmarks("9");
	         
	       /* Session session2 = factory.openSession();
	        UserDTO s2 = null;
	        Object o1 = session2.get(UserDTO.class, new Integer(101));
	        s2 = (Student)o1;
	       */ Transaction tx=session1.beginTransaction();
	         
	        session1.merge(s1);
			

	  

			
			
		}}