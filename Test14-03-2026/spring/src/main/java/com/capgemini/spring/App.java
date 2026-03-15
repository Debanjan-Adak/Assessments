package com.capgemini.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	ApplicationContext cont=new ClassPathXmlApplicationContext("bean-config.xml");
    	
    	Student student=(Student) cont.getBean("student");
    	Employee employee = (Employee) cont.getBean("employee");
    	System.out.println(student);
    	System.out.println(employee);
    	
    }
}
