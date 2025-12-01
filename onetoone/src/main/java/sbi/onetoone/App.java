package sbi.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
	public static void main( String[] args )
	{
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("mapping");
		EntityManager  em=emf.createEntityManager();
		em.getTransaction().begin();

		Product p1=new Product();
		p1.setpId(101);
		p1.setpName("Mobile");
		p1.setpPrice(12345);

		em.persist(p1);

























		//		Org o1=new Org();		
		//		o1.setName("TCS");
		//		o1.setLoc("pune");
		//		em.persist(o1);
		//		Employee e1=new Employee();
		//		e1.setName("Mahajan");
		//		e1.setDept("dev");
		//		e1.setSalary(12345);
		//		e1.setOrg(o1);
		//		em.persist(e1);
		em.getTransaction().commit();

	}
}
