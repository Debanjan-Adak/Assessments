package com.hibernateCustomerOrder.HibernateCustomerOrderAssessment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class OrderDAOImpl {
	private EntityManager em;

	public OrderDAOImpl(EntityManager em) {
		super();
		this.em = em;
	}
	
	//Fetch order by id
	public Order fetchOrder(int id) {
		return em.find(Order.class, id);
	}
	//Update Order
	public void updateOrder(Order order) {
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.merge(order);
		
		et.commit();
	}
}
