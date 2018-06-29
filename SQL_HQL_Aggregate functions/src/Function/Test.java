package Function;


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
							
							 
							 
	// Query query = session.createSQLQuery("SELECT * from school").addEntity(UserDTO.class);
		Query query = session.createQuery("select count(u.city) from UserDTO u");
		//Query query = session.createQuery("select max(u.id) from UserDTO u");
		// Query query = session.createQuery("select min(u.id) from UserDTO u");
		//Query query = session.createQuery("select sum(u.id) from UserDTO u");
		//Query query = session.createQuery("select avg(u.id) from UserDTO u");
		//Query query = session.createQuery("select count(*) from UserDTO u");
							        List list = query.list();
							        System.out.println(list.get(0));
							        System.out.println("saved successfully.....!!");
					 

							        session.close();

	}}