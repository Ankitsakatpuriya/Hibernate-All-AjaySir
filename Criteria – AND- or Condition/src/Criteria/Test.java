package Criteria;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class Test {

	

	public static void main(String[] args) {

							
							
							Configuration cfg = new Configuration();
							
							 cfg.configure("hibernate.cfg.xml"); 
							 
							 SessionFactory factory = cfg.buildSessionFactory();
							 Session session = factory.openSession();
							
							  
							 				  
//   Query query = session.createSQLQuery("").addEntity(UserDTO.class);
							// Query query = session.createQuery("");
						Criteria crit = session.createCriteria(UserDTO.class);
						
						//crit.add(Restrictions.like("firstname","A%"));
						//crit.add(Restrictions.like("city","I%"));
						
 crit.add(Restrictions.or(Restrictions.like("firstname","A%"),Restrictions.like("city", "u%")));



							

							       List list = crit.list();
							        Iterator iter = list.iterator();

							        UserDTO dto;
							        while (iter.hasNext()) {
										 dto =(UserDTO)iter.next();
						System.out.println(dto.getFirstname()+"   "+dto.getCity());
									
									
									
						 }

							        session.close();
							        System.out.println("saved successfully.....!!");

	}}