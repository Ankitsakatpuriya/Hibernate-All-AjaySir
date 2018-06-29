package insert;


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
							
							 
							 				  
							//Query query = session.createSQLQuery("SELECT id, name FROM school").addEntity(UserDTO.class);
							// Query query = session.createQuery("from UserDTO");
							Query query = session.createQuery("select p.id,from UserDTO p");
							 List rows = query.list();

							 Iterator iter = rows.iterator();

							 Object[] columns;

							 System.out.println("ID");
							 while (iter.hasNext()) {
							 columns = (Object[])iter.next();
							 Integer id = (Integer) columns[0];
							 
							 System.out.println(id);
							        session.close();
							        System.out.println("saved successfully.....!!");
							 }
	}}