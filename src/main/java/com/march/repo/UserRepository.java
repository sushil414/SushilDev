package com.march.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.march.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {
	
	Optional<Users> findByUserIdAndStatusTrue(String userId);
}
