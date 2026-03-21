package com.capgemini.Springboot2.model;

import jakarta.persistence.*;

@Entity
public class LeaveRequest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int employeeId;
	private String reason;
	private String status; // PENDING, APPROVED, REJECTED

	public LeaveRequest() {}

	public LeaveRequest(int employeeId, String reason) {
		this.employeeId = employeeId;
		this.reason = reason;
		this.status = "PENDING";
	}

	// getters setters
	public int getId() { return id; }

	public int getEmployeeId() { return employeeId; }
	public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

	public String getReason() { return reason; }
	public void setReason(String reason) { this.reason = reason; }

	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }
}
