package com.capgemini.Springboot2.controllet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.Springboot2.model.LeaveRequest;
import com.capgemini.Springboot2.service.LeaveService;

@RestController
@CrossOrigin("*")
@RequestMapping("/leave")
public class LeaveController {

	@Autowired
	private LeaveService service;

	@PostMapping
	public LeaveRequest apply(@RequestBody LeaveRequest l) {
		return service.applyLeave(l);
	}

	@GetMapping
	public List<LeaveRequest> all() {
		return service.getAll();
	}

	@PutMapping("/approve/{id}")
	public LeaveRequest approve(@PathVariable int id) {
		return service.approve(id);
	}

	@PutMapping("/reject/{id}")
	public LeaveRequest reject(@PathVariable int id) {
		return service.reject(id);
	}
}