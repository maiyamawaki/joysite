package com.joysite.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joysite.backend.service.ProductService;
import com.joysite.backend.dto.ProductDto;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public List<ProductDto> getAllProduct() {
		List<ProductDto> productList = productService.getAllProduct();
		return productList;
	}

	@PostMapping
	public List<ProductDto> registerProdutct(@RequestBody ProductDto productDto) {
		List<ProductDto> productList = productService.createProduct(productDto);
		return productList;
	}

	@PutMapping("/{id}")
	public List<ProductDto> updateProduct(@PathVariable Long productId, @RequestBody ProductDto productDto) {
		List<ProductDto> productList = productService.updateProduct(productId, productDto);
		return productList;
	}
}
