package com.joysite.backend.dto;

import java.time.LocalDateTime;

import org.springframework.cglib.core.Local;

public class UsrDto {
	
	private Long userId;

	private String familyName;

	private String firstName;

	private String email;

	private String phoneNumber;

	private String postalCode;

	private String address;

	private LocalDateTime insTime;

	private LocalDateTime updTime;

	public UsrDto() {}

	public UsrDto(Long userId, String familyName, String firstName, String email, String phoneNumber, String postalCode, String address, LocalDateTime insTime, LocalDateTime updTime) {
		this.userId = userId;
		this.familyName = familyName;
		this.firstName = firstName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.postalCode = postalCode;
		this.address = address;
		this.insTime = insTime;
		this.updTime = updTime;
	}

	public Long getUserId() {
		return userId;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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
