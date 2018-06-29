package DetachedCriteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

public class Test {

	

	public static void main(String[] args) {

						
		Configuration cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml"); 
		 
		 SessionFactory factory = cfg.buildSessionFactory();
		 DetachedCriteria dc =  DetachedCriteria.forClass(UserDTO.class);
	
		 

			System.out.println(dc);


			 System.out.println("Object saved successfully.....!!"); 
		 }
		
	}