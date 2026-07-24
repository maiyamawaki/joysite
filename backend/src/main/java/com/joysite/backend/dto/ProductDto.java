package com.joysite.backend.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ProductDto {
	private Long productId;

	private String productName;

	private String description;

	private BigDecimal price;

	private String productImage;

	private Integer stock;

	private boolean delFlg;

	private LocalDateTime insTime;

	private LocalDateTime updTime;

	public ProductDto() {}

	public ProductDto(Long productId, String productName, String description, BigDecimal price, String productImage, Integer stock, boolean delFlg, LocalDateTime insTime, LocalDateTime updTime) {
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.productImage = productImage;
		this.stock = stock;
		this.delFlg = delFlg;
		this.insTime = insTime;
		this.updTime = updTime;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}

	public boolean isDelFlg() {
		return delFlg;
	}

	public void setDelFlg(boolean delFlg) {
		this.delFlg = delFlg;
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

