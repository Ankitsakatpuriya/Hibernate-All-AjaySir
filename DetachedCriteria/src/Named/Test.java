package Named;


import java.util.*;


import org.hibernate.*;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;



public class Test {

	

	public static void main(String[] args) {

		
					
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();

		 DetachedCriteria query = DetachedCriteria.forClass(UserDTO.class);
		 Session session = factory.openSession();
		 query.add(Property.forName("bike").eq("CBZ"));
			
	}
}

