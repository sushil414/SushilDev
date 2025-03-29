package com.march.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.march.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private final UserServiceImpl userService;
	
	public UserController(UserServiceImpl userService) {
		this.userService = userService;
	}
	
	@GetMapping("/connect")
	public ResponseEntity<?> connectUser(){
		return ResponseEntity.ok("Connected!!");
	}
}
