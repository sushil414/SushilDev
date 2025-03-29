package com.march.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.march.service.ProfileServiceImpl;

@RestController
@RequestMapping("/profiles")
public class ProfileController {
	
	private final ProfileServiceImpl profileService;
	
	public ProfileController(ProfileServiceImpl serviceImpl) {
		this.profileService = serviceImpl;
	}

}
