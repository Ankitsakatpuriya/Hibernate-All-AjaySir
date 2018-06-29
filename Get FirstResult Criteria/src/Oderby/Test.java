package Oderby;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Test {

	

	public static void main(String[] args) {

						//UserDTO c = new UserDTO();
				
							
							Configuration cfg = new Configuration();
							 cfg.configure("hibernate.cfg.xml"); 
							 
							 SessionFactory factory = cfg.buildSessionFactory();
							 Session session = factory.openSession();
	
							 
							 Criteria crit = session.createCriteria(UserDTO.class);
							
							crit.setFirstResult(5);
							 //crit.setMaxResults(6);
							//crit.createAlias("UserDTO", "p")

  
							        List list = crit.list();
							        Iterator iter = list.iterator();

							        UserDTO dto;
							        

							        while (iter.hasNext()) {
							        dto =(UserDTO)iter.next();
									System.out.println(dto.getId()+"  "+dto.getFirstname());
									
						 }	        session.close();
							        System.out.println("saved successfully.....!!");

	}}