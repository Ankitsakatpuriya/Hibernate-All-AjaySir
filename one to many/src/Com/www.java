package Com;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Main {

		    public static void main(String[] args) {
				 Configuration cfg = new Configuration();
				 cfg.configure("hibernate.cfg.xml"); 
				 
				 SessionFactory factory = cfg.buildSessionFactory();
				 Session session = factory.openSession(); 
				 Transaction tx = session.beginTransaction();
				
				 

//----Parents--------------- 
				/* Topcatagery t = new Topcatagery();
				 t.setT_id(1);
				 t.setCatagery("Electrical & Electronics");
				 
				 Topcatagery t1 = new Topcatagery();
				 t1.setT_id(2);
				 t1.setCatagery("Fashion");
				 
				 Topcatagery t2 = new Topcatagery();
				 t2.setT_id(3);
				 t2.setCatagery("Health & Beauty");
				 
				 Topcatagery t3 = new Topcatagery();
				 t3.setT_id(4);
				 t3.setCatagery("Home & Living");
				 
				 


//----Electrical--------------- 
				 Catagerya c = new Catagerya();
				 c.setC_id(100);
				 c.setCatageryname("Mobile & Tablet");
				 
				 Catagerya c1 = new Catagerya();
				 c1.setC_id(101);
				 c1.setCatageryname("Computer & Laptop");
				 
				 Catagerya c11 = new Catagerya();
				 c11.setC_id(102);
				 c11.setCatageryname("Tv,Speaker,Cameras");
				 
//-------Fashion------------
				 Catagerya c2 = new Catagerya();
				 c2.setC_id(103);
				 c2.setCatageryname("Mens Fashion");
		 
				 
				 Catagerya c3 = new Catagerya();
				 c3.setC_id(104);
				 c3.setCatageryname("Womens Fashion");
				 
				 Catagerya c4 = new Catagerya();
				 c4.setC_id(105);
				 c4.setCatageryname("Kids Fashion");
		 
//---------Health & Beauty---------------------------
				 
				 Catagerya c5 = new Catagerya();
				 c5.setC_id(106);
				 c5.setCatageryname("Perfames");
		 
				 
				 Catagerya c6 = new Catagerya();
				 c6.setC_id(107);
				 c6.setCatageryname("Fitness");
				 
				 Catagerya c7 = new Catagerya();
				 c7.setC_id(108);
				 c7.setCatageryname("Sports");
		
				 
//---------Home & Living---------------------------
								 
								 Catagerya c8 = new Catagerya();
								 c8.setC_id(109);
								 c8.setCatageryname("Forniture");
						 
								 
								 Catagerya c9 = new Catagerya();
								 c9.setC_id(110);
								 c9.setCatageryname("Kitchen & Dining");
								 
								 Catagerya c10 = new Catagerya();
								 c10.setC_id(111);
								 c10.setCatageryname("Home Decor");
*/						/*
			 
				 Set<Catagerya> s = new HashSet<Catagerya>();
				 Set<Catagerya> s1 = new HashSet<Catagerya>();
				 Set<Catagerya> s2 = new HashSet<Catagerya>();
				 Set<Catagerya> s3 = new HashSet<Catagerya>();
				 
				 s.add(c);
				 s.add(c1);
				 s.add(c11);
				 s1.add(c2);
				 s1.add(c3);
				 s1.add(c4);
				 s2.add(c5);
				 s2.add(c6);
				 s2.add(c7);
				 s3.add(c8);
				 s3.add(c9);
				 s3.add(c10);
				 
				 
				 
				 t.setChild(s);
				 t1.setChild(s1);
				 t2.setChild(s2);
				 t3.setChild(s3);
				  
			     session.save(t);
				 session.save(t1);
				 session.save(t2);
				 session.save(t3);	
				 
				
								 tx.commit();
								 session.close();		
				   				 System.out.println("Done");
				                 factory.close();
				 			
				
					 				 
				 }
				}
					 
		*/
							
//-----Electrical--------------------------------------------------------- 
			 /* Query qry = session.createQuery("from Catagerya where c_id =100");
								 
								 List<?> l =qry.list();
								 
								 Iterator<?> it = l.iterator();
								 
								 while(it.hasNext())
								 {
								 Object o = (Object)it.next();
								 
								 Catagerya c111 = (Catagerya)o;								 
								 

								 Multipleitems m = new Multipleitems();
								 m.setMultipleitems_id(1001);
								 m.setMultipleitems_name("Mobile");
	
								 Multipleitems m1 = new Multipleitems();
								 m1.setMultipleitems_id(1002);
								 m1.setMultipleitems_name("Tablet");

								 Multipleitems m2 = new Multipleitems();
								 m2.setMultipleitems_id(1003);
								 m2.setMultipleitems_name("Cases & Covers ");

								 Multipleitems m3 = new Multipleitems();
								 m3.setMultipleitems_id(1004);
								 m3.setMultipleitems_name("Mobile & Tablet Accessories");

								
								Set<Multipleitems> s = new HashSet<Multipleitems>();
								   s.add(m);
								   s.add(m1);
								   s.add(m2);
								   s.add(m3);
								  
								 
								 c111.setS1(s);
								 session.save(c111);
								 System.out.println("Total Number Of Records : "+ s.size());
								 
}
								 tx.commit();
								 session.close();		
				   				 System.out.println("Mapping Done");
				                 factory.close();
								 

}}*/
/*	//------Computer & Laptop ---------------------------- 
				 
				 Query qry = session.createQuery("from Catagerya where c_id =101");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1005);
				 m.setMultipleitems_name("Laptop");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1006);
				 m1.setMultipleitems_name("Destop");

				 Multipleitems m2 = new Multipleitems();
				 m2.setMultipleitems_id(1007);
				 m2.setMultipleitems_name("Laptop & Destop Accessories");

				 Multipleitems m3 = new Multipleitems();
				 m3.setMultipleitems_id(1008);
				 m3.setMultipleitems_name("Routers & Modems");

				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}
*/
				 /*
				 
				 

				 Query qry = session.createQuery("from Catagerya where c_id =102");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1009);
				 m.setMultipleitems_name("Televisions ");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1010);
				 m1.setMultipleitems_name("Audio & Video Accessories");

				 Multipleitems m2 = new Multipleitems();
				 m2.setMultipleitems_id(1011);
				 m2.setMultipleitems_name("Refrigerators");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}*/
				 
				 

				 
				 /*

				 Query qry = session.createQuery("from Catagerya where c_id =103");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1012);
				 m.setMultipleitems_name("Men's Clothing");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1013);
				 m1.setMultipleitems_name("Men's Footwear");

				 Multipleitems m2 = new Multipleitems();
				 m2.setMultipleitems_id(1014);
				 m2.setMultipleitems_name("Watches");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}
*/
				 
/*				 
				 
				 

				 
				 

				 Query qry = session.createQuery("from Catagerya where c_id =104");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1015);
				 m.setMultipleitems_name("WOMEN'S Clothing");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1016);
				 m1.setMultipleitems_name("WOMEN'S Footwear");

				 Multipleitems m2 = new Multipleitems();
				 m2.setMultipleitems_id(1017);
				 m2.setMultipleitems_name("Fashion Jewellery");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}*/
				 
				 //----------kid's---------------
/*
				 Query qry = session.createQuery("from Catagerya where c_id =105");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1018);
				 m.setMultipleitems_name("School Bags");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1019);
				 m1.setMultipleitems_name("Kid's Clothing");

				 Multipleitems m2 = new Multipleitems();
				 m2.setMultipleitems_id(1020);
				 m2.setMultipleitems_name("Toys");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}*/
	/*			 Query qry = session.createQuery("from Catagerya where c_id =106");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1021);
				 m.setMultipleitems_name("Men's Perfumes");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1022);
				 m1.setMultipleitems_name("Women's Perfumes");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}*/
	/*		 Query qry = session.createQuery("from Catagerya where c_id =107");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1023);
				 m.setMultipleitems_name("Treadmills");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1024);
				 m1.setMultipleitems_name("Home Gym Sets");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}*/
	/*	 Query qry = session.createQuery("from Catagerya where c_id =108");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1025);
				 m.setMultipleitems_name("Sports Kit");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1026);
				 m1.setMultipleitems_name(" Men's And Women's Sports Clothing");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}*/
				 
/*	 Query qry = session.createQuery("from Catagerya where c_id =109");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1027);
				 m.setMultipleitems_name("Home Furniture ");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1028);
				 m1.setMultipleitems_name("Office Furniture");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}*/
				 /*
	 Query qry = session.createQuery("from Catagerya where c_id =110");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Catagerya c = (Catagerya)o;								 
				 

				 Multipleitems m = new Multipleitems();
				 m.setMultipleitems_id(1029);
				 m.setMultipleitems_name("Kitchen Tools");

				 Multipleitems m1 = new Multipleitems();
				 m1.setMultipleitems_id(1030);
				 m1.setMultipleitems_name("Kitchen Storage and Other Kitchenware Dining & Bar");


				
				Set<Multipleitems> s = new HashSet<Multipleitems>();
				   s.add(m);
				   s.add(m1);
				   
				   
				  
				 
				 c.setS1(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}
				 
/*
				 Query qry = session.createQuery("from Catagerya where c_id =111");
							 
							 List<?> l =qry.list();
							 
							 Iterator<?> it = l.iterator();
							 
							 while(it.hasNext())
							 {
							 Object o = (Object)it.next();
							 
							 Catagerya c = (Catagerya)o;								 
							 

							 Multipleitems m = new Multipleitems();
							 m.setMultipleitems_id(1031);
							 m.setMultipleitems_name("Home Decoratives");

							 Multipleitems m1 = new Multipleitems();
							 m1.setMultipleitems_id(1032);
							 m1.setMultipleitems_name("Home Furnishing");


							
							Set<Multipleitems> s = new HashSet<Multipleitems>();
							   s.add(m);
							   s.add(m1);
							   
							   
							  
							 
							 c.setS1(s);
							 session.save(c);
							 System.out.println("Total Number Of Records : "+ s.size());
							 
			}
							 tx.commit();
							 session.close();		
			   				 System.out.println("Mapping Done");
			                 factory.close();
							 

			}}
				 */