package com.capgemini.Springboot2.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Springboot2.model.LeaveRequest;

public interface LeaveRepo extends JpaRepository<LeaveRequest, Integer> {

	List<LeaveRequest> findByEmployeeId(int employeeId);
}