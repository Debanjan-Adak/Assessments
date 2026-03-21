package com.capgemini.Springboot2.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Springboot2.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	List<Employee> findByCity(String city);

	List<Employee> findByNameContaining(String name);

	Optional<Employee> findByEmail(String email);
}