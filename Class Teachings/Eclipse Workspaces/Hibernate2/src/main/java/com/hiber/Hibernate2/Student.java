package com.hiber.Hibernate2;

import jakarta.persistence.*;

@Entity
@Table(name="Stu")
public class Student {

	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String number;
	@Override
	public String toString() {
		return id+" "+name+" "+email+" "+number;
	}
	
	public Student()
	{
		
	}
	public Student(String name, String email, String number) {
	
		this.name = name;
		this.email = email;
		this.number = number;
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
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
}
