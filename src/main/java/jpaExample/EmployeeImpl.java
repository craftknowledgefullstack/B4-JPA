package jpaExample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeeImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		//Persist data
		/*
		 * e.setId(2); e.setName("Alemu"); e.setSalary(4000); 
		 * EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		 * EntityManager em = emf.createEntityManager(); em.getTransaction().begin();
		 * em.persist(e); em.getTransaction().commit();
		 */
		
//Find data
		/*
		 * EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		 * EntityManager em = emf.createEntityManager(); em.getTransaction().begin(); 
		 * e = em.find(Employee.class, 2); System.out.println(e);
		 * 
		 * em.getTransaction().commit();
		 */
		
		//Update data
		/*
		 * EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		 * EntityManager em = emf.createEntityManager(); EntityTransaction
		 * entityTransaction = em.getTransaction(); e = em.find(Employee.class, 1);
		 * System.out.println("Before update " + e); entityTransaction.begin();
		 * e.setName("Chala"); e.setSalary(5000);
		 * 
		 * entityTransaction.commit(); System.out.println("After update " + e);
		 */
		
		//Delete data
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		 EntityManager em = emf.createEntityManager(); EntityTransaction
		 entityTransaction = em.getTransaction(); 
		 e = em.find(Employee.class, 1);
		
		 entityTransaction.begin();
		 em.remove(e);
		 entityTransaction.commit();
	}

}
