package Oderby;


import java.util.Iterator;
import java.util.List;



import org.hibernate.Query;
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
							
							  
							 				  
//Query query = session.createSQLQuery("SELECT * FROM school ORDER BY Tmarks DESC").addEntity(UserDTO.class);
Query query = session.createQuery("from UserDTO cat order by cat.tmarks asc");
							        List list = query.list();
							        Iterator iter = list.iterator();

							        UserDTO dto;
							        while (iter.hasNext()) {
										 dto =(UserDTO)iter.next();
										 System.out.println(dto.getTmarks());
									
									
									
						 }

							        session.close();
							        System.out.println("saved successfully.....!!");

	}}