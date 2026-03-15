package com.hibernateCustomerOrder.HibernateCustomerOrderAssessment;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

public class CustomerDAOImpl {
	private EntityManager em;

	public CustomerDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	//insert
	public void insertCustomer(Customer customer) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(customer);
		
		et.commit();
		System.out.println("Customer inserted.");
	}
	//Fetch by id
	public Customer fetchById(int id) {
		return em.find(Customer.class, id);
	}
	//Fetch by email
	public List<Customer> fetchByEmail(String email){
		Query q = em.createQuery("SELECT c from Customer c where c.email=:email");
		q.setParameter("email", email);
		return q.getResultList();
	}
	//Fetch all
	public List<Customer> fetchAll(){
		Query q = em.createQuery("SELECT c FROM Customer c");
		return q.getResultList();
	}
	//Update customer details
	public void updateDetails(Customer customer) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.merge(customer);
		
		et.commit();
		System.out.println("Customer updated.");
	}
	//Delete by id
	public void deleteCustomer(int id) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Customer c = em.find(Customer.class, id);
		
		if(c!=null) {
			em.remove(c);
		}
		et.commit();
		System.out.println("Customer deleted.");
	}
}
