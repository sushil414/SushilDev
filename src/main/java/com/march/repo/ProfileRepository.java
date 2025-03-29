package com.march.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.march.entity.Profiles;

@Repository
public interface ProfileRepository extends JpaRepository<Profiles, String> {

}
