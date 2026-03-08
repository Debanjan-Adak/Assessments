package com.hiber.Hibernate2;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        Student s1 = new Student("Deb","debu@mailll","12345678");
//        em.persist(s1);
        System.out.println(em.find(Student.class, 1));
//        em.merge(s1);
        em.setProperty("name","DEBUZZ" );
        
        et.commit();
        
    }
}
