package Projection_Prog;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Test {

	

	public static void main(String[] args) {

							
							
							Configuration cfg = new Configuration();
							
							 cfg.configure("hibernate.cfg.xml"); 
							 
							 SessionFactory factory = cfg.buildSessionFactory();
							 Session session = factory.openSession();
							
							  
							 				  
						Criteria crit = session.createCriteria(UserDTO.class);
						
						
						ProjectionList p = Projections.projectionList();
						p.add(Projections.property("firstname"));
						p.add(Projections.property("city"));
						crit.setProjection(p);



							

							       List list = crit.list();
							        Iterator iter = list.iterator();

							        Object[] ob;
							        while (iter.hasNext()) {
										 ob =(Object[])iter.next();
										 String fn = (String)ob[0];
										 String c = (String)ob[1];
										 System.out.println(fn+"    "+c);
									
									
									
						 }

							        session.close();
							        System.out.println("saved successfully.....!!");

	}}