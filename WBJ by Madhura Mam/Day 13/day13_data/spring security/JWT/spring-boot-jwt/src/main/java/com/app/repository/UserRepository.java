package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
	@Query("select u from UserEntity u join fetch u.userRoles where u.email=?1")
	Optional<UserEntity> findByEmail(String email);
}
