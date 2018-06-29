package Annotations_Filter;


		import java.util.Iterator;
		import java.util.List;
		 
		import org.hibernate.Filter;
		import org.hibernate.Query;
		import org.hibernate.Session;
		import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
			import org.hibernate.cfg.Configuration;
		import org.hibernate.stat.Statistics;
		 
		
		 
		public class Main {
		 
		    public static void main(String[] args) {

		        AnnotationConfiguration cfg=new AnnotationConfiguration();
		        cfg.configure("hibernate.cfg.xml");
		 
		        SessionFactory factory = cfg.buildSessionFactory();
		        Session session = factory.openSession();
		        Transaction tx = session.beginTransaction();
		        
		     Employee p = new Employee();
		        p.setEmployeeId(28);
		        p.setEmployeeName("Om");
		        p.setSalary(4000);
		        p.setDeptNo(15);
		        
		        
		        session.save(p);
		        tx.commit();
		        
		        session.close();
		    }}
		       
		         
		        /*Filter filter = session.enableFilter("employeeFilter");
		        filter.setParameter("salary", 4000);
		        Query query = session.createQuery("from Employee e");
		        List list = query.list();
		        Iterator it =list.iterator();
		        while (it.hasNext()) {
		            Employee emp = (Employee) it.next();
		            System.out.println("Employee Name : "+emp.getEmployeeName() +" , Salary : "+emp.getSalary());
		            session.disableFilter("studentName");
		   
		            tx.commit();
			        
			        session.close();
			   
		            
		            
		        }}}   
		       */