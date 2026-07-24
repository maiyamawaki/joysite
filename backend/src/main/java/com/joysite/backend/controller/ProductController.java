package com.joysite.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.joysite.backend.service.ProductService;
import com.joysite.backend.dto.ProductDto;

@RestController
public class ProductController {
	
	ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	public List<ProductDto> getAllProduct() {
		List<ProductDto> productList = productService.getAllProduct();
		return productList;
	}
}
