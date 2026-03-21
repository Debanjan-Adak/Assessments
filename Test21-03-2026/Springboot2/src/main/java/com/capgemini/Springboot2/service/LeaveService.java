package com.capgemini.Springboot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Springboot2.exceptions.NotFoundException;
import com.capgemini.Springboot2.model.LeaveRequest;
import com.capgemini.Springboot2.repo.LeaveRepo;

@Service
public class LeaveService {

	@Autowired
	private LeaveRepo repo;

	public LeaveRequest applyLeave(LeaveRequest req) {
		req.setStatus("PENDING");
		return repo.save(req);
	}

	public List<LeaveRequest> getAll() {
		return repo.findAll();
	}

	public LeaveRequest approve(int id) {
		LeaveRequest l = repo.findById(id)
			.orElseThrow(() -> new NotFoundException("Leave not found"));
		l.setStatus("APPROVED");
		return repo.save(l);
	}

	public LeaveRequest reject(int id) {
		LeaveRequest l = repo.findById(id)
			.orElseThrow(() -> new NotFoundException("Leave not found"));
		l.setStatus("REJECTED");
		return repo.save(l);
	}
}
