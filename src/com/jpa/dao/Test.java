package com.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpa.model.Employee;

public class Test {

	public static void main(String[] args) {

		/* Create EntityManagerFactory */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAExamples");

		Employee employee = new Employee();
		employee.setFirstname("swaroop");
		employee.setLastname("kumar");
		employee.setEmail("swaroop@gmail.com");
		employee.setIdEmployee(1);

		/* Create EntityManager */
		EntityManager em = emf.createEntityManager();

		/* Persist entity */
		em.getTransaction().begin();
		em.persist(employee);
		em.getTransaction().commit();

		/* Retrieve entity */
		employee = em.find(Employee.class, 1);
		System.out.println(employee);

		/* Update entity */
		em.getTransaction().begin();
		employee.setFirstname("Sadiq");
		employee =em.merge(employee);
		em.getTransaction().commit();
		System.out.println("Employee after updation :- " + employee);

		/* Remove entity */
		em.getTransaction().begin();
		em.remove(employee);
		em.getTransaction().commit();

		/* Checking whether entity is removed or not */
		employee = em.find(Employee.class, 1);
		System.out.println("Employee after removal :- " + employee);

	}

}
