package com.model;


import jakarta.persistence.*;
@Entity
@Table(name="Emp")
public class Employee {
	@Id
	@Column(name="id")
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	
	@Column
	private String znumber;
	
	public Employee()
	{
		
	}
	@Override
	public String toString() {
		return id+" "+name+" "+email+" "+znumber;
	}
	
	public Employee(int id,String name,String email,String number)
	{
		this.id=id;
		this.email=email;
		this.name=name;
		this.znumber=number;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getZnumber() {
		return znumber;
	}

	public void setZnumber(String znumber) {
		this.znumber = znumber;
	}

	
}
