package com.capgemini.spring.classbased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class People {
	
	private int id;
	private String name;
	private String gender;
	public int getId() {
		return id;
	}
	
	@Value("101")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("Debu")
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	@Value("Male")
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", gender=" + gender + "]";
	}
} 
