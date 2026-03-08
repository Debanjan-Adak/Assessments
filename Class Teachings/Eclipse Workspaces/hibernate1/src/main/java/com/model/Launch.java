package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Launch {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Employee.class);
		Employee e = new Employee(1,"Deb","deb@gmail","12345");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s = sf.openSession();
		
//		Employee e1 = new Employee(2,"Bholu","bholu@gmail","23456");
//		e=s.get(Employee.class, 1);
//		s.remove(e);
		e=s.get(Employee.class, 2);
		e.setName("Genuine Boy");
//		System.out.println(e);
		Transaction t = s.beginTransaction();
		s.persist(e);
		t.commit();
	}

}
