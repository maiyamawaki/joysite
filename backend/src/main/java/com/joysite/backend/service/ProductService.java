package com.joysite.backend.service;

import java.util.stream.Collectors;
import java.util.List;

import org.springframework.stereotype.Service;

import com.joysite.backend.repository.ProductRepository;
import com.joysite.backend.entity.Product;
import com.joysite.backend.dto.ProductDto;

@Service
public class ProductService {
	
	ProductRepository productRepo;

	public ProductService(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}

	private ProductDto toDto(Product product) {
		ProductDto dto = new ProductDto(product.getProductId(),
																		product.getProductName(),
																		product.getDescription(),
																		product.getPrice(),
																		product.getProductImage(),
																		product.getStock(),
																		product.isDelFlg(),
																		product.getInsTime(),
																		product.getUpdTime());
		return dto;
	}

	public List<ProductDto> getAllProduct() {
		List<ProductDto> productList = productRepo.findAll()
																				.stream()
																				.map(product->toDto(product))
																				.collect(Collectors.toList());
		return productList;
	}

	public List<ProductDto> createProduct(ProductDto productDto) {
		Product product =  new Product(productDto.getProductName(),
																	productDto.getDescription(),
																	productDto.getPrice(),
																	productDto.getProductImage(),
																	productDto.getStock(),
																	false);
		productRepo.save(product);
		return getAllProduct();
	}
}
