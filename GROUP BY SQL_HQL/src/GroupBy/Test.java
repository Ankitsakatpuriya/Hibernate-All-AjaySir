package GroupBy;


import java.util.Iterator;
import java.util.List;



import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;

public class Test {

	

	public static void main(String[] args) {

						//UserDTO c = new UserDTO();
				
							
							Configuration cfg = new Configuration();
							 cfg.configure("hibernate.cfg.xml"); 
							 
							 SessionFactory factory = cfg.buildSessionFactory();
							 Session session = factory.openSession();
														 				  
					//Query query = session.createSQLQuery("SELECT COUNT(ID),omarks FROM School GROUP BY omarks").addEntity(UserDTO.class);
					//Query query = session.createQuery("");

							 SQLQuery query = session.createSQLQuery("select  from school group by OMARKS");
							 query.addEntity(UserDTO.class);					
					
					
					
					
					
					
							 		List list = query.list();
							        Iterator iter = list.iterator();
							        System.out.println(iter.next());/*
							        UserDTO dto;
							        while(iter.hasNext()) 
							        {
										 Object o=iter.next();
										 Object[] z=(Object[])o;
										 Number c=(Number)z[0];
										 System.out.println(c+"");
									
							        }*/
							        session.close();
							        System.out.println("saved successfully.....!!");

								}
}