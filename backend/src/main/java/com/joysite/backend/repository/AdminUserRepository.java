package com.joysite.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joysite.backend.entity.AdminUser;

public interface AdminUserRepository extends JpaRepository<AdminUser, Long>{
	
	public AdminUser findByEmail(String email);
}
