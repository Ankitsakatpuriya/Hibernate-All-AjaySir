package Function;


import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class Test {

	

	public static void main(String[] args) {

						//UserDTO c = new UserDTO();
				
							
							Configuration cfg = new Configuration();
							 cfg.configure("hibernate.cfg.xml"); 
							 
							 SessionFactory factory = cfg.buildSessionFactory();
							 Session session = factory.openSession();
							
							 
							 
	   // Query query = session.createSQLQuery("SELECT * from school").addEntity(UserDTO.class);
	
		//Query query = session.createQuery("select max(u.id) from UserDTO u");
	
							 Criteria crit = session.createCriteria(UserDTO.class); 
							 ProjectionList projList = Projections.projectionList();
							//projList.add(Projections.min("id"));
							 //projList.add(Projections.avg("id"));
							 projList.add(Projections. rowCount());
							 //projList.add(Projections.sum("id"));
							//projList.add(Projections.max("id"));
							//projList.add(Projections.count("id"));
							
							 crit.setProjection(projList);
							 List results = crit.list();
							 List list = crit.list();
						     System.out.println(list.get(0));
						     System.out.println("saved successfully.....!!");
						     session.close();

	}}