package com.capgemini.Springboot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.capgemini.Springboot2.exceptions.NotFoundException;
import com.capgemini.Springboot2.model.Employee;
import com.capgemini.Springboot2.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo repo;

	public Employee save(Employee emp) {
		return repo.save(emp);
	}

	public List<Employee> getAll() {
		return repo.findAll();
	}

	public Employee getById(int id) {
		return repo.findById(id)
			.orElseThrow(() -> new NotFoundException("Employee not found"));
	}

	public void delete(int id) {
		if (!repo.existsById(id))
			throw new NotFoundException("Cannot delete. Employee not found");
		repo.deleteById(id);
	}

	public Employee update(int id, Employee emp) {
		Employee e = getById(id);
		e.setName(emp.getName());
		e.setCity(emp.getCity());
		e.setSalary(emp.getSalary());
		return repo.save(e);
	}

	public List<Employee> search(String name) {
		return repo.findByNameContaining(name);
	}

	public List<Employee> byCity(String city) {
		return repo.findByCity(city);
	}

	public List<Employee> sortAsc() {
		return repo.findAll(Sort.by("salary"));
	}

	public List<Employee> sortDesc() {
		return repo.findAll(Sort.by(Sort.Direction.DESC, "salary"));
	}
}
