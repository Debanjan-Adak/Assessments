package com.capgemini.Springboot2.controllet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.capgemini.Springboot2.dto.LoginRequest;
import com.capgemini.Springboot2.model.Employee;
import com.capgemini.Springboot2.service.AuthService;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("/login")
	public Employee login(@RequestBody LoginRequest req) {
	    return authService.login(req.getEmail(), req.getPassword());
	
	}
}