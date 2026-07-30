package com.joysite.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.joysite.backend.repository.AdminUserRepository;
import com.joysite.backend.entity.AdminUser;
import com.joysite.backend.dto.AdminUserDto;

@Service
public class AdminUserService {
	
	private AdminUserRepository adminUserRepo;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public AdminUserService(AdminUserRepository adminUserRepo) {
		this.adminUserRepo = adminUserRepo;
	}

	private AdminUserDto toDto(AdminUser adminUser) {
		AdminUserDto dto = new AdminUserDto(adminUser.getAdminUserId(),
																				adminUser.getEmail());
		return dto;
	}

	public AdminUserDto registerAdminUser(AdminUserDto adminUserDto) {
		AdminUser existingAdminUser = adminUserRepo.findByEmail(adminUserDto.getEmail());
		if(existingAdminUser == null) {
			String hashedPassword = passwordEncoder.encode(adminUserDto.getPassword());
			AdminUser newAdminUser = new AdminUser(adminUserDto.getEmail(),
																						hashedPassword);
			adminUserRepo.save(newAdminUser);
			return toDto(newAdminUser);
		} else {
			return toDto(existingAdminUser);
		}
	}

	public AdminUserDto login(AdminUserDto adminUserDto) {
		AdminUser adminUser = adminUserRepo.findByEmail(adminUserDto.getEmail());
		if(adminUser == null) {
			return null;
		} else {
			if(passwordEncoder.matches(adminUserDto.getPassword(), adminUser.getPassword())) {
				return toDto(adminUser);
			} else {
				return null;
			}
		}
	}

}
