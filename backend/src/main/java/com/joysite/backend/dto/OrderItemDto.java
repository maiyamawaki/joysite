package com.joysite.backend.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderItemDto {
	private Long itemId;

	private Long productId;

	private BigDecimal price;

	private Integer quantity;

	private LocalDateTime insTime;

	private LocalDateTime updTime;

	public OrderItemDto() {}

	public OrderItemDto(Long itemId, Long productId, BigDecimal price, Integer quantity, LocalDateTime insTime, LocalDateTime updTime) {
		this.itemId = itemId;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.insTime = insTime;
		this.updTime = updTime;
	}

	public Long getItemId() {
		return itemId;
	}

	public Long getProductId() {
		return productId;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
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
