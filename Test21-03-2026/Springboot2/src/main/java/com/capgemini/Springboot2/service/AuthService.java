package com.capgemini.Springboot2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Springboot2.exceptions.NotFoundException;
import com.capgemini.Springboot2.model.Employee;
import com.capgemini.Springboot2.repo.EmployeeRepo;

@Service
public class AuthService {

	@Autowired
	private EmployeeRepo repo;

	public Employee login(String email, String password) {
		Employee emp = repo.findByEmail(email)
				.orElseThrow(() -> new NotFoundException("User not found"));

		if (!emp.getPassword().equals(password))
			throw new RuntimeException("Invalid password");

		return emp;
	}
}