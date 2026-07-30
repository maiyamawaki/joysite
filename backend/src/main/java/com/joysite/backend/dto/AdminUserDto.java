package com.joysite.backend.dto;

import java.time.LocalDateTime;

public class AdminUserDto {

	private Long adminUserId;

	private String email;

	private String password;

	private LocalDateTime insTime;

	private LocalDateTime updTime;

	public AdminUserDto() {}

	public AdminUserDto(Long adminUserId, String email) {
		this.adminUserId = adminUserId;
		this.email = email;
	}

	public Long getAdminUserId() {
		return adminUserId;
	}

	public void setAdminUserId(Long adminUserId) {
		this.adminUserId = adminUserId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getInsTime() {
		return insTime;
	}

	public void setInsTime(LocalDateTime insTime) {
		this.insTime = insTime;
	}

	public LocalDateTime getUpdTime() {
		return updTime;
	}

	public void setUpdTime(LocalDateTime updTime) {
		this.updTime = updTime;
	}

}
