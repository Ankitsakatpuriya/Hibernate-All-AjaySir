package Com;
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
		
			A	 
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
			
			
//---------Brands------------------------
				 /*
				 
				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1001");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Multipleitems c = (Multipleitems)o;								 
				 

				 Brands m = new Brands();
				 m.setBrands_id(10000);
				 m.setBrands_name("Apple");

				 Brands m1 = new Brands();
				 m1.setBrands_id(10001);
				 m1.setBrands_name("Samsung");
				 
				 Brands m2 = new Brands();
				 m2.setBrands_id(10002);
				 m2.setBrands_name("Nokia");

				 Brands m3 = new Brands();
				 m3.setBrands_id(10003);
				 m3.setBrands_name("Sony");

				 Brands m4 = new Brands();
				 m4.setBrands_id(10004);
				 m4.setBrands_name("Moto");
				 


				
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				   s.add(m4);
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
}
				 tx.commit();
				 session.close();		
   				 System.out.println("Mapping Done");
                 factory.close();
				 

}}     */



//---------Brands------------------------
/*	 
	 
	 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1002");
	 
	 List<?> l =qry.list();
	 
	 Iterator<?> it = l.iterator();
	 
	 while(it.hasNext())
	 {
	 Object o = (Object)it.next();
	 
	 Multipleitems c = (Multipleitems)o;								 
	 

	 Brands m = new Brands();
	 m.setBrands_id(10005);
	 m.setBrands_name("Samsung");

	 Brands m1 = new Brands();
	 m1.setBrands_id(10006);
	 m1.setBrands_name("Ipad");
	 
	 Brands m2 = new Brands();
	 m2.setBrands_id(10007);
	 m2.setBrands_name("Ibell");

	 Brands m3 = new Brands();
	 m3.setBrands_id(10008);
	 m3.setBrands_name("micromax");

	 Brands m4 = new Brands();
	 m4.setBrands_id(10004);
	 m4.setBrands_name("Moto");
	 


	
	Set<Brands> s = new HashSet<Brands>();
	   s.add(m);
	   s.add(m1);
	   s.add(m2);
	   s.add(m3);
	  // s.add(m4);
	   
	 c.setS2(s);
	 session.save(c);
	 System.out.println("Total Number Of Records : "+ s.size());
	 
}
	 tx.commit();
	 session.close();		
		 System.out.println("Mapping Done");
     factory.close();
	 

}}
*/
				 
				 
/*				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1003");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Multipleitems c = (Multipleitems)o;								 
				 

				 Brands m = new Brands();
				 m.setBrands_id(10009);
				 m.setBrands_name("Samsung");

				 Brands m1 = new Brands();
				 m1.setBrands_id(10006);
				 m1.setBrands_name("Ipad");
				 
				 Brands m2 = new Brands();
				 m2.setBrands_id(10007);
				 m2.setBrands_name("Ibell");

				 Brands m3 = new Brands();
				 m3.setBrands_id(10008);
				 m3.setBrands_name("micromax");
			
				 


				
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				  
				   
				 c.setS2(s);
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
				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1005");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Multipleitems c = (Multipleitems)o;								 
				 

				 Brands m = new Brands();
				 m.setBrands_id(10014);
				 m.setBrands_name("hp");

				 Brands m1 = new Brands();
				 m1.setBrands_id(10015);
				 m1.setBrands_name("Dell");
				 
				 Brands m2 = new Brands();
				 m2.setBrands_id(10016);
				 m2.setBrands_name("Asus");

				 Brands m3 = new Brands();
				 m3.setBrands_id(10017);
				 m3.setBrands_name("Apple");
			
				 


				
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}

				 
				 */
				 
				 
/*				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1006");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Multipleitems c = (Multipleitems)o;								 
				 

				 Brands m = new Brands();
				 m.setBrands_id(10018);
				 m.setBrands_name("mac");

				 Brands m1 = new Brands();
				 m1.setBrands_id(10019);
				 m1.setBrands_name("samsung");
				 
				 Brands m2 = new Brands();
				 m2.setBrands_id(10020);
				 m2.setBrands_name("asus");

				 Brands m3 = new Brands();
				 m3.setBrands_id(10021);
				 m3.setBrands_name("lenova");
			
				 


				
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}
/*
				 /*
				 
				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1007");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Multipleitems c = (Multipleitems)o;								 
				 

				 Brands m = new Brands();
				 m.setBrands_id(10022);
				 m.setBrands_name("Pindrive");

				 Brands m1 = new Brands();
				 m1.setBrands_id(10023);
				 m1.setBrands_name("Audio & Video");
				 
				 Brands m2 = new Brands();
				 m2.setBrands_id(10024);
				 m2.setBrands_name("Speakers");

				 Brands m3 = new Brands();
				 m3.setBrands_id(10025);
				 m3.setBrands_name("Headphone & Earphones");	
				 


				
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}
			*/

				 
			/*	 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1008");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				 
				 Multipleitems c = (Multipleitems)o;								 
				 

				 


				 Brands m = new Brands();
				 m.setBrands_id(10026);
				 m.setBrands_name("LAN Routers");

				 Brands m1 = new Brands();
				 m1.setBrands_id(10027);
				 m1.setBrands_name("Dongles");
				 
				 
				 


				
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}
*/
/*	 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1009");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
								 

				

				 Multipleitems c = (Multipleitems)o;								 
				 
				 Brands m = new Brands();
				 m.setBrands_id(10028);
				 m.setBrands_name("Full HD TVs");

				 Brands m1 = new Brands();
				 m1.setBrands_id(10029);
				 m1.setBrands_name("Ultra HD TVs");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}*/

/*				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1010");
							 
							 List<?> l =qry.list();
							 
							 Iterator<?> it = l.iterator();
							 
							 while(it.hasNext())
							 {
							 Object o = (Object)it.next();
							
							 Multipleitems c = (Multipleitems)o;								 
							 
							 Brands m = new Brands();
							 m.setBrands_id(10030);
							 m.setBrands_name("iPods & MP3 Players"); 

							 Brands m1 = new Brands();
							 m1.setBrands_id(10031);
							 m1.setBrands_name("DVD & Blu-ray Players");
							 
							Set<Brands> s = new HashSet<Brands>();
							   s.add(m);
							   s.add(m1);
							  
							   
							 c.setS2(s);
							 session.save(c);
							 System.out.println("Total Number Of Records : "+ s.size());
							 
						}
							 tx.commit();
							 session.close();		
								 System.out.println("Mapping Done");
						     factory.close();
							 

						}}*//*
				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1011");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				 
				 Brands m = new Brands();
				 m.setBrands_id(10033);
				 m.setBrands_name("Single Door"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10034);
				 m1.setBrands_name("Double Door");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}*/

/*				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1012");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				 

				 Brands m = new Brands();
				 m.setBrands_id(10035);
				 m.setBrands_name("T-Shirts & Polos,Jeans,Shirts,Jackets,Jeans"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10036);
				 m1.setBrands_name("Sportswear");

				 Brands m2 = new Brands();
				 m2.setBrands_id(10037);
				 m2.setBrands_name("Kurta Pyjama & Sherwanis"); 

				 Brands m3 = new Brands();
				 m3.setBrands_id(10038);
				 m3.setBrands_name("Trackpants & Tracksuits");
				 
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				  
				   
				 c.setS2(s);
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
				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1013");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				 

				 Brands m = new Brands();
				 m.setBrands_id(10043);
				 m.setBrands_name("Puma"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10044);
				 m1.setBrands_name("Nike");

				 Brands m2 = new Brands();
				 m2.setBrands_id(10045);
				 m2.setBrands_name("MAX"); 

				 Brands m3 = new Brands();
				 m3.setBrands_id(10046);
				 m3.setBrands_name("Reebook");
				 
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}*/
				 
				 /*

				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1014");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10047);
				 m.setBrands_name("Maxima Watches | Citizen Watches"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10048);
				 m1.setBrands_name("Tommy Hilfiger Watches");

				 Brands m2 = new Brands();
				 m2.setBrands_id(10049);
				 m2.setBrands_name("Diesel watches | Sonata watches"); 

				 Brands m3 = new Brands();
				 m3.setBrands_id(10050);
				 m3.setBrands_name("Titen Watches");
				 
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				   s.add(m2);
				   s.add(m3);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}*/
				 
/*
				 Query qry = session.createQuery("from Multipleitems where multipleitems_id=1015");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10051);
				 m.setBrands_name("Max,Jokey"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10052);
				 m1.setBrands_name("Puma,Reebook");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}*/
				 
				 
				 /*Query qry = session.createQuery("from Multipleitems where multipleitems_id=1017");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10055);
				 m.setBrands_name("Voylla"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10056);
				 m1.setBrands_name("panjab ");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}
*//*
Query qry = session.createQuery("from Multipleitems where multipleitems_id=1018");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10057);
				 m.setBrands_name("Black jack"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10058);
				 m1.setBrands_name("titen");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
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
Query qry = session.createQuery("from Multipleitems where multipleitems_id=1023");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10059);
				 m.setBrands_name("Powermax"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10060);
				 m1.setBrands_name("Cosco");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
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
Query qry = session.createQuery("from Multipleitems where multipleitems_id=1027");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10061);
				 m.setBrands_name("USHA Furniture "); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10062);
				 m1.setBrands_name("Crystal Furnitech");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
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
Query qry = session.createQuery("from Multipleitems where multipleitems_id=1028");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10063);
				 m.setBrands_name("Clyde Office Table  "); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10064);
				 m1.setBrands_name("Omega Office Cum");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}*//*

Query qry = session.createQuery("from Multipleitems where multipleitems_id=1029");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10065);
				 m.setBrands_name("Pigeon"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10066);
				 m1.setBrands_name("Magikware");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 

			}}*/
				 

/*
Query qry = session.createQuery("from Multipleitems where multipleitems_id=1032");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10067);
				 m.setBrands_name("Fresh From Loom Cotton Double Bedsheet"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10069);
				 m1.setBrands_name(" Pillows & Covers");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 
}}*/
		/*		 
				 
				 
Query qry = session.createQuery("from Multipleitems where multipleitems_id=1031");
				 
				 List<?> l =qry.list();
				 
				 Iterator<?> it = l.iterator();
				 
				 while(it.hasNext())
				 {
				 Object o = (Object)it.next();
				
				 Multipleitems c = (Multipleitems)o;								 
				

				 Brands m = new Brands();
				 m.setBrands_id(10068);
				 m.setBrands_name("	100 Degree Celsius"); 

				 Brands m1 = new Brands();
				 m1.setBrands_id(10070);
				 m1.setBrands_name(" sleep");
				 
				Set<Brands> s = new HashSet<Brands>();
				   s.add(m);
				   s.add(m1);
				  
				   
				 c.setS2(s);
				 session.save(c);
				 System.out.println("Total Number Of Records : "+ s.size());
				 
			}
				 tx.commit();
				 session.close();		
					 System.out.println("Mapping Done");
			     factory.close();
				 
}}*/
	  //--------------End 4rd table---------------------------------
				 
				 
	//--------------5th-----------start------------
		 
			/*	 Query qry = session.createQuery("from  Brands where brands_id=10000");
				 				 
				 				 List<?> l =qry.list();
				 				 
				 				 Iterator<?> it = l.iterator();
				 				 
				 				 while(it.hasNext())
				 				 {
				 				 Object o = (Object)it.next();
				 				
				 				Brands c = (Brands)o;								 
				 				

				 				 Product m = new Product();
				 				 m.setProduct_id(201);
				 				 m.setProduts_name("IPhone 5");
 m.setProduts_details("Alarm, Calendar, Clock, Game Center, Remote,Call Features Loudspeaker ");
				 				 
								 Product m1 = new Product();
									 m1.setProduct_id(202);
									 m1.setProduts_name("IPhone 6s");
									 m1.setProduts_details("RAM:2 GB Screen Size (in cm):10.16 cm (4) Rear Camera:12 MP");
									 
									 Product m2 = new Product();
									 m2.setProduct_id(203);
									 m2.setProduts_name("IPhone 7s Plus");
									 m2.setProduts_details("Rear Camera:16 MP,Front Camera:20 MP,Internal Memory:64GB");
									 
									 
									 
				 				Set<Product> s = new HashSet<Product>();
				 				   s.add(m);
				 				  s.add(m1);
				 				 s.add(m2);
				 				   
				 				 c.setS3(s);
				 				 session.save(c);
				 				 
				 			}
				 				 tx.commit();
				 				 session.close();		
				 					 System.out.println("Mapping Done");
				 			     factory.close();
				 				 
				 }}*/
				 

/*				 Query qry = session.createQuery("from  Brands where brands_id=10001");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(204);
 				 m.setProduts_name("SAMSUNG J7");
m.setProduts_details("Smartphone,SIMs:Single SIM Size:	Nano,Colour:Gold,Other Features:Calculator");

				 Product m1 = new Product();
					 m1.setProduct_id(205);
					 m1.setProduts_name("Samsung A8");
					 m1.setProduts_details("Rear Camera:18 MP,BACK Camera:20 MP,FLASH LIGHT,ATO TUCHE");
					 
					 Product m2 = new Product();
					 m2.setProduct_id(206);
					 m2.setProduts_name("Samasung S9");
					 m2.setProduts_details(" Calendar,BACK Camera:16 MP,Front Camera:20Alarm,, Clock, Game Center, Memory:64G");
					 
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 s.add(m2);
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
 				 
 }}
				*/
/*
				 Query qry = session.createQuery("from  Brands where brands_id=10002");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(207);
 				 m.setProduts_name("Intex SA1475");
m.setProduts_details("SIMs:Single SIM Size:	Nano,Colour:Gold,Other Features:Calculator");

				 Product m1 = new Product();
					 m1.setProduct_id(208);
					 m1.setProduts_name("Intex D8");
					 m1.setProduts_details(" Camera:18 MP,BACK Camera:20 MP,FLASH LIGHT,ATO TUCHE");
					 
					 Product m2 = new Product();
					 m2.setProduct_id(209);
					 m2.setProduts_name("S9");
					 m2.setProduts_details("BACK Camera:16 MP,Front Camera:20Alarm,, Clock, Game Center, Memory:64G");
					 
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 s.add(m2);
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
 				 
 }}*/
				 /*

				 Query qry = session.createQuery("from  Brands where brands_id=10005");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(213);
 				 m.setProduts_name("MAC0503ex1205");
m.setProduts_details("Laptop (8th Gen MAC Core i3- 4GB RAM- 1TB HDD- 39.62cm(15.6)- DOS) (Black)");

				 Product m1 = new Product();
					 m1.setProduct_id(214);
					 m1.setProduts_name("MAC304ex123");
					 m1.setProduts_details("MAC Notebook (5th Gen MACCore i3- 4GB RAM- 500GB HDD- 35.56 cm (14)- DOS) (Black)");
					 
					 Product m2 = new Product();
					 m2.setProduct_id(215);
					 m2.setProduts_name("MAC204rcxdm");
					 m2.setProduts_details("MAC 15 BE014TU MacNotebook Core i3 (6th Generation) 4 GB 39.62cm(15.6) Windows 10 Home without MS Office Not Applicable Black");
					 
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 s.add(m2);
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
 				 
 }}
*/
/*
				 Query qry = session.createQuery("from  Brands where brands_id=10007");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(216);
 				 m.setProduts_name("Spekar0503ex1205");
m.setProduts_details("Spekar HDD- 39.62cm(15.6)- DOS) (Black)");

				 Product m1 = new Product();
					 m1.setProduct_id(217);
					 m1.setProduts_name("MAC spekAR304ex123");
					 m1.setProduts_details("Intex spekar");
					 
					 Product m2 = new Product();
					 m2.setProduct_id(218);
					 m2.setProduts_name("Spekar");
					 m2.setProduts_details("Not Applicable Black");
					 
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 s.add(m2);
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
 				 
 }}*/
/*
				 Query qry = session.createQuery("from  Brands where brands_id=10008");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(219);
 				 m.setProduts_name("Roter0503ex1205");
m.setProduts_details("Wireless Adaptor (LEO-NANO150N)");

				 Product m1 = new Product();
					 m1.setProduct_id(220);
					 m1.setProduts_name("Roter 75304ex123");
					 m1.setProduts_details("Ranz Mini USB 150Mbps 802.11n Wireless Wifi Nano WAN Network ");
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
 				 
 }}*/

	/*			 Query qry = session.createQuery("from  Brands where brands_id=10009");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(221);
 				 m.setProduts_name("Tvs");
m.setProduts_details("Weston WEL-5500 140 cm ( 55 ) Smart Ultra HD (4K) LED Television");

				 Product m1 = new Product();
					 m1.setProduct_id(222);
					 m1.setProduts_name("Panasonic");
					 m1.setProduts_details("Panasonic 43ex480 109 cm ( 43 ) Ultra HD (4K) LED Television");
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
 				 
 }}*/
/*			 Query qry = session.createQuery("from  Brands where brands_id=10010");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(223);
 				 m.setProduts_name("DVD");
m.setProduts_details("Amazon Fire TV Stick with Voice Remote Compatible with high-definition TVs with HDMI");

				 Product m1 = new Product();
					 m1.setProduct_id(224);
					 m1.setProduts_name("DVD");
					 m1.setProduts_details("Philips BDP 2190 Blu Ray DVD Player - Black");
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
 				 
 }}*/
			/* Query qry = session.createQuery("from  Brands where brands_id=10011");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(225);
 				 m.setProduts_name("Refrigerator");
m.setProduts_details("Samsung 192 Ltr 3 Star RR19M2711DZ/RR19M1711DZ Single Door Refrigerator - Tender Lilly ");

				 Product m1 = new Product();
					 m1.setProduct_id(226);
					 m1.setProduts_name("Refrigerator");
					 m1.setProduts_details("Samsung 192 Ltr 5 Star RR20M2Z2XBS/NL & RR20M1Z2XBS/HL Single Door ");
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
		    }}*/
				 /*
 Query qry = session.createQuery("from  Brands where brands_id=10012");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(227);
 				 m.setProduts_name("Sports Wear");
m.setProduts_details("Nike Black Polyester Track Pant for Men");

				 Product m1 = new Product();
					 m1.setProduct_id(228);
					 m1.setProduts_name("Sports Wear");
					 m1.setProduts_details("Try This Multi Cotton T-Shirt Pack of 2");
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
		    }}*/
				
				 /*
 Query qry = session.createQuery("from  Brands where brands_id=10017");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Brands c = (Brands)o;								 
 				

 				 Product m = new Product();
 				 m.setProduct_id(229);
 				 m.setProduts_name("Fashion Jewellery");
m.setProduts_details("Sukkhi Multicolour Necklace Set - Set of 3	");

				 Product m1 = new Product();
					 m1.setProduct_id(230);
					 m1.setProduts_name("Fashion Jewellery");
					 m1.setProduts_details("A M INTERNATIONAL Silver Oxidised Drop Classy Luxury Afghan Tribal Afghani Necklace & Earrings set");
					 
					 
 				Set<Product> s = new HashSet<Product>();
 				   s.add(m);
 				  s.add(m1);
 				 
 				   
 				 c.setS3(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
		    }}*/

/*				 Query qry = session.createQuery("from  Brands where brands_id=10014");
				 				 
				 				 List<?> l =qry.list();
				 				 
				 				 Iterator<?> it = l.iterator();
				 				 
				 				 while(it.hasNext())
				 				 {
				 				 Object o = (Object)it.next();
				 				
				 				Brands c = (Brands)o;								 
				 				

				 				 Product m = new Product();
				 				 m.setProduct_id(231);
				 				 m.setProduts_name("Watches");
				m.setProduts_details("good Timex Brown Analog Watch");

								 Product m1 = new Product();
									 m1.setProduct_id(232);
									 m1.setProduts_name("Watches");
									 m1.setProduts_details(" Watch Type:Wrist Warranty:6 Months Dial Color:Beig Display:Analog ");
									 
									 
				 				Set<Product> s = new HashSet<Product>();
				 				   s.add(m);
				 				  s.add(m1);
				 				 
				 				   
				 				 c.setS3(s);
				 				 session.save(c);
				 				 
				 			}
				 				 tx.commit();
				 				 session.close();		
				 					 System.out.println("Mapping Done");
				 			     factory.close();
						    }}*/
				 
				 
				 
/*
			 Query qry = session.createQuery("from Product where product_id=201");
				 				 
				 				 List<?> l =qry.list();
				 				 
				 				 Iterator<?> it = l.iterator();
				 				 
				 				 while(it.hasNext())
				 				 {
				 				 Object o = (Object)it.next();
				 				
				 				Product c = (Product)o;								 
				 				

				 				 Price m = new Price();
				 				 m.setPrice_id(801);
				 				 m.setProductprice(5000);
				
								 
									 
									 
				 				Set<Price> s = new HashSet<Price>();
				 				   s.add(m);
				 				  
				 				 
				 				   
				 				 c.setS4(s);
				 				 session.save(c);
				 				 
				 			}
				 				 tx.commit();
				 				 session.close();		
				 					 System.out.println("Mapping Done");
				 			     factory.close();
						    }}

				*/
				 /*Query qry = session.createQuery("from Product where product_id=201");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Product c = (Product)o;								 
 				

 				 Price m = new Price();
 				 m.setPrice_id(802);
 				 m.setProductprice(6000);

				 
					 
					 
 				Set<Price> s = new HashSet<Price>();
 				   s.add(m);
 				  
 				 
 				   
 				 c.setS4(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
		    }}*/
				 
				 
				 //-------price-----------
/*Query qry = session.createQuery("from Product where product_id=232");
 				 
 				 List<?> l =qry.list();
 				 
 				 Iterator<?> it = l.iterator();
 				 
 				 while(it.hasNext())
 				 {
 				 Object o = (Object)it.next();
 				
 				Product c = (Product)o;								 
 				

 				 Price m = new Price();
 				 m.setPrice_id(819);
 				 m.setProductprice(5000);

 				Set<Price> s = new HashSet<Price>();
 				   s.add(m);
 				   
 				 c.setS4(s);
 				 session.save(c);
 				 
 			}
 				 tx.commit();
 				 session.close();		
 					 System.out.println("Mapping Done");
 			     factory.close();
		    }}*/
				 
/*Product product = (Product) session.get(Product.class,201);
 				 
 				 
 				 User m = new User();
 				 m.setUser_id(819);
 				 m.setUsername("Ankit");
 				 m.setUsermobileno(887134);
 				 
 				 User m1 = new User();
 				 m1.setUser_id(820);
 				 m1.setUsername("Ank");
 				 m1.setUsermobileno(8871349);
 				 

 				Set<User> s = new HashSet<User>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				  product.setUser(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/

/*
Product product = (Product) session.get(Product.class,204); 				 

 				 User m = new User();
 				 m.setUser_id(821);
 				 m.setUsername("PRSHANT");
 				 m.setUsermobileno(887134);
 				 
 				 User m1 = new User();
 				 m1.setUser_id(822);
 				 m1.setUsername("OM");
 				 m1.setUsermobileno(887);
 				
 		
 				Set<User> s = new HashSet<User>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				  product.setUser(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/
/*
Product product = (Product) session.get(Product.class,207); 				 

 				 User m = new User();
 				 m.setUser_id(823);
 				 m.setUsername("PRIYA");
 				 m.setUsermobileno(887134);
 				 
 				 User m1 = new User();
 				 m1.setUser_id(824);
 				 m1.setUsername("AYSHI");
 				 m1.setUsermobileno(887);
 				
 		
 				Set<User> s = new HashSet<User>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				  product.setUser(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/
/*
Product product = (Product) session.get(Product.class,210); 				 

 				 User m = new User();
 				 m.setUser_id(823);
 				 m.setUsername("RAM");
 				 m.setUsermobileno(78134);
 				 
 				 User m1 = new User();
 				 m1.setUser_id(824);
 				 m1.setUsername("SYAM");
 				 m1.setUsermobileno(8887);
 				
 		
 				Set<User> s = new HashSet<User>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				  product.setUser(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/
/*
Product product = (Product) session.get(Product.class,213); 				 

 				 User m = new User();
 				 m.setUser_id(825);
 				 m.setUsername("OM");
 				 m.setUsermobileno(9893);
 				 
 				 User m1 = new User();
 				 m1.setUser_id(826);
 				 m1.setUsername("S");
 				 m1.setUsermobileno(98887);
 				
 		
 				Set<User> s = new HashSet<User>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				  product.setUser(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/
/*
Product product = (Product) session.get(Product.class,231); 				 

 				 User m = new User();
 				 m.setUser_id(833);
 				 m.setUsername("ANKIT");
 				 m.setUsermobileno(475556);
 				 
 				 User m1 = new User();
 				 m1.setUser_id(834);
 				 m1.setUsername("SWRO");
 				 m1.setUsermobileno(7988887);
 				
 		
 				Set<User> s = new HashSet<User>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				  product.setUser(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/
/*				 User product = (User) session.get(User.class,819); 				 

				 Paymentoptions m = new Paymentoptions();
 				 m.setPayment_id(888);
 				 m.setPayment_type("Visa");
 			
 				 
 				Paymentoptions m1 = new Paymentoptions();
 				 m1.setPayment_id(889);
 				 m1.setPayment_type("cash");
 				 
 				
 		
 				Set<Paymentoptions> s = new HashSet<Paymentoptions>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				 product.setS5(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}
*//*
				 
				 User product = (User) session.get(User.class,820); 				 

				 Paymentoptions m = new Paymentoptions();
 				 m.setPayment_id(890);
 				 m.setPayment_type("Credit");
 			
 				 
 				Paymentoptions m1 = new Paymentoptions();
 				 m1.setPayment_id(891);
 				 m1.setPayment_type("Debit");
 				 
 				
 		
 				Set<Paymentoptions> s = new HashSet<Paymentoptions>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				 product.setS5(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/
				 

				/* 
				 User product = (User) session.get(User.class,821); 				 

				 Paymentoptions m = new Paymentoptions();
 				 m.setPayment_id(892);
 				 m.setPayment_type("Paytam");
 			
 				 
 				Paymentoptions m1 = new Paymentoptions();
 				 m1.setPayment_id(893);
 				 m1.setPayment_type("Atm");
 				 
 				
 		
 				Set<Paymentoptions> s = new HashSet<Paymentoptions>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				 product.setS5(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/
				 
			/*	 User product = (User) session.get(User.class,830); 				 

				 Paymentoptions m = new Paymentoptions();
 				 m.setPayment_id(894);
 				 m.setPayment_type("BHIM APP");
 			
 				 
 				Paymentoptions m1 = new Paymentoptions();
 				 m1.setPayment_id(895);
 				 m1.setPayment_type("NET BANKING");
 				 
 				
 		
 				Set<Paymentoptions> s = new HashSet<Paymentoptions>();
 				   s.add(m);
 				  s.add(m1);
 				  
 				 product.setS5(s);
 				  
 				 session.save(product);
 				 
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}*/
				 Paymentoptions product = (Paymentoptions) session.get(Paymentoptions.class,88); 				 

				 Delieveryoder m = new Delieveryoder();
 				 m.setDelieveryoder_id(50);
 				 m.setDelieveryperson_name("Sakatpuriya");
 				 m.setPay(product);
 				 
 				/*Delieveryoder m1 = new Delieveryoder();
 				 m.setDelieveryoder_id(51);
 				 m.setDelieveryperson_name("Chohan");
 				 m.setPay(product);*/
 				 
 				
 		
 		
 				  
 				 session.save(m);
 				 //session.save(m1);
 			
 				 tx.commit();
 				 session.close();		
 
 			     factory.close();			 
}}