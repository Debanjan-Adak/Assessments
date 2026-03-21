package com.capgemini.Springboot2.controllet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.Springboot2.model.Employee;
import com.capgemini.Springboot2.service.EmployeeService;

@CrossOrigin("*")
@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping
	public Employee add(@RequestBody Employee e) {
		return service.save(e);
	}

	@GetMapping
	public List<Employee> all() {
		return service.getAll();
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		service.delete(id);
		return "Deleted";
	}

	@PutMapping("/{id}")
	public Employee update(@PathVariable int id, @RequestBody Employee e) {
		return service.update(id, e);
	}

	@GetMapping("/search/{name}")
	public List<Employee> search(@PathVariable String name) {
		return service.search(name);
	}
}