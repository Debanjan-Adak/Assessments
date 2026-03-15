package com.capgemini.spring.classbased;

import java.util.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.capgemini.spring")
public class BeanConfig {
	
	@Bean
	public List<Integer> list()
	{
		return List.of(1,2,3,4,5,6,7,8,9,10);
		
	}
	
	@Bean
	public String string()
	{
		return new String("HEllo");
	}
}
