package Get_all_select;


import java.util.Arrays;
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

						UserDTO c = new UserDTO();
				
							
							Configuration cfg = new Configuration();
							cfg.configure("hibernate.cfg.xml"); 
							SessionFactory factory = cfg.buildSessionFactory();
							 Session session = factory.openSession();
							
			// Query query = session.createSQLQuery("SELECT * FROM School WHERE mobile LIKE '74%'").addEntity(UserDTO.class);
							 

			//Query query = session.createQuery("from UserDTO cat where cat.mobile like '74%'");
			Criteria crit = session.createCriteria(UserDTO.class);
			crit.add(Restrictions.like("mobile", "74%"));
		       //crit.add(Restrictions.eq("pincode", "41")); 
  
			
			
							 List list = crit.list();
							 Iterator iter = list.iterator();

							 UserDTO dto;

							 while (iter.hasNext()) {
							 dto =(UserDTO)iter.next();
							 System.out.println(dto.getId() + "\t" + dto.getPincode()+ "\t\t" 
							 +dto.getMobile());						
							 }
	
							        session.close();

	}}