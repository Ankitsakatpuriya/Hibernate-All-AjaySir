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
							 
	// Query query = session.createSQLQuery("SELECT * FROM school ORDER BY Tmarks DESC").addEntity(UserDTO.class);
				// Query query = session.createQuery("from UserDTO cat order by cat.tmarks asc cat.id");
							 Criteria crit = session.createCriteria(UserDTO.class);
							// crit.add(Restrictions.like("firstname", "PR%"));
							// crit.addOrder( Order.asc("firstname") ); 
							//crit.addOrder( Order.desc("id") ); 
							//Crit.addOrder( Order.dsc("id") );
							crit.setFirstResult(5);
							 //crit.setMaxResults(5);
							 //crit.createAlias(PartDTO", “p")

  
							        List list = crit.list();
							        Iterator iter = list.iterator();

							        UserDTO dto;
							        while (iter.hasNext()) {
							        dto =(UserDTO)iter.next();
									System.out.println(dto.getId());
									
						 }	        session.close();
							        System.out.println("saved successfully.....!!");

	}}