package com.hibernateCustomerOrder.HibernateCustomerOrderAssessment;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-hibernate-mysql");
		EntityManager em = emf.createEntityManager();
		
		CustomerDAOImpl cdao = new CustomerDAOImpl(em);
		OrderDAOImpl odao = new OrderDAOImpl(em);

		//Inserting
		Order o1 = new Order(1, "ORD101", "Laptop", 1, 70000, LocalDate.now());
		Customer c1 = new Customer(1, "Debanjan", "adak@gmail.com", "Male", 1234567890, LocalDate.now(), o1);
		o1.setCustomer(c1);
		
		Order o2 = new Order(2, "ORD102", "Smartphone", 2, 50000, LocalDate.now());
		Customer c2 = new Customer(2, "Rahul", "rahul@gmail.com", "Male", 9876543210L, LocalDate.now(), o2);
		o2.setCustomer(c2);
		
		Order o3 = new Order(3, "ORD103", "Headphones", 3, 9000, LocalDate.now());
		Customer c3 = new Customer(3, "Priya", "priya@gmail.com", "Female", 8765432190L, LocalDate.now(), o3);
		o3.setCustomer(c3);
		
		cdao.insertCustomer(c1);
		cdao.insertCustomer(c2);
		cdao.insertCustomer(c3);
		
		//Fetch by id
		Customer c = cdao.fetchById(3);
		System.out.println(c);
		
		//Fetch all
		List<Customer> cs = cdao.fetchAll();
		for(Customer customer:cs)
			System.out.println(customer);
		
		//Fetch by email
		String email = "rahul@gmail.com";
		List<Customer> email_c = cdao.fetchByEmail(email);
		for(Customer customer:email_c)
			System.out.println(customer);
		
		//Update customer
		c.setEmail("priyanew@gmail.com");
		cdao.updateDetails(c);
		
		//Delete customer
		cdao.deleteCustomer(2);
		
		//update order
		Order o = odao.fetchOrder(1);
		o.setProductName("Monitor");
		odao.updateOrder(o);
		
		//Fetch order by id
		Order fetch_order = odao.fetchOrder(1);
		System.out.println(fetch_order);
		
		em.close();
		emf.close();
	}
}
