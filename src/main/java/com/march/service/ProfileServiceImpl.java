package com.march.service;

import org.springframework.stereotype.Service;

import com.march.repo.ProfileRepository;

@Service
public class ProfileServiceImpl  implements ProfileService{

	private final ProfileRepository profileRepository;
	
	public ProfileServiceImpl(ProfileRepository profileRepository) {
		this.profileRepository = profileRepository;
	}
	
}
