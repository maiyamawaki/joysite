package com.joysite.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joysite.backend.entity.Usr;

public interface UsrRepository extends JpaRepository<Usr, Long>{
	
	public Usr findByEmail(String email);
}
