package com.march.service;

import java.util.Collections;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.march.entity.Users;
import com.march.exception.ResourceNotAvailableException;
import com.march.repo.UserRepository;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

	private final UserRepository repository;
	
	@Autowired
	private PasswordEncoder encoder;
	
	public UserServiceImpl(UserRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> users = repository.findByUserIdAndStatusTrue(username);
		
		if(users.isEmpty()) {
			throw new ResourceNotAvailableException(401, "Invalid Username and Password");
		}
		
		return User.builder()
				.username(username)
				.password(users.get().getPassword())
				.authorities(Collections.EMPTY_LIST)
				.build();
	}
}
