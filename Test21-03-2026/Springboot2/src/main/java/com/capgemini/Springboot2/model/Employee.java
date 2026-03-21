package com.capgemini.Springboot2.model;

import jakarta.persistence.*;

@Entity
@Table(name ="employee")
public class Employee {
	
	@Id
	private int id;

	private String name;
	private String email;
	private String mobile;
	private String city;
	private double salary;

	private String password;

	@Enumerated(EnumType.STRING)
	private Role role;

	public Employee() {}

	public Employee(int id, String name, String email, String mobile,
	                String city, double salary, String password, Role role) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.salary = salary;
		this.password = password;
		this.role = role;
	}

	// getters + setters
	public int getId() { return id; }
	public void setId(int id) { this.id = id; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getEmail() { return email; }
	public void setEmail(String email) { this.email = email; }

	public String getMobile() { return mobile; }
	public void setMobile(String mobile) { this.mobile = mobile; }

	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }

	public double getSalary() { return salary; }
	public void setSalary(double salary) { this.salary = salary; }

	public String getPassword() { return password; }
	public void setPassword(String password) { this.password = password; }

	public Role getRole() { return role; }
	public void setRole(Role role) { this.role = role; }
}