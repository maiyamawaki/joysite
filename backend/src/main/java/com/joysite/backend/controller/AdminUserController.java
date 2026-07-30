package com.joysite.backend.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

import com.joysite.backend.service.AdminUserService;
import com.joysite.backend.dto.AdminUserDto;

@RestController
@RequestMapping("/api/admin")
public class AdminUserController {
	
	AdminUserService adminUserService;

	public AdminUserController(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}

	@PostMapping("/register")
	public ResponseEntity<?> registerAdminUser(@RequestBody AdminUserDto adminUserDto, HttpSession session) {
		System.out.println("test : " + adminUserDto.getEmail());
		System.out.println("test : " + adminUserDto.getPassword());
		AdminUserDto dto = adminUserService.registerAdminUser(adminUserDto);
		if(dto != null) {
			session.setAttribute("ADMIN", dto.getAdminUserId());
			return ResponseEntity.ok(dto);
		} else {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
															.body(Map.of("message", "Invalid user information"));
		}
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AdminUserDto adminUserDto, HttpSession session) {
		System.out.println("test : " + adminUserDto.getEmail());
		System.out.println("test : " + adminUserDto.getPassword());
		AdminUserDto dto = adminUserService.login(adminUserDto);
		if(dto == null) {
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
													 	.body(Map.of("message", "Invalid email or password"));
		} else {
			session.setAttribute("ADMIN", dto.getAdminUserId());
			System.out.println("success login");
			return ResponseEntity.ok(dto);
		}
	}



}
