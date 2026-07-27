package com.joysite.backend.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderDto {

	private Long orderId;

	private BigDecimal totalAmount;

	private String status;

	private LocalDateTime insTime;

	private LocalDateTime updTime;

	public OrderDto() {}

	public OrderDto(Long orderId, BigDecimal totalAmount, String status, LocalDateTime insTime, LocalDateTime updTime) {
		this.orderId = orderId;
		this.totalAmount = totalAmount;
		this.status = status;
		this.insTime = insTime;
		this.updTime = updTime;
	}
	
	public Long getOrderId() {
		return orderId;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
