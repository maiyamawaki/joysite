package com.joysite.backend.service;

import java.util.stream.Collectors;
import java.util.List;

import org.springframework.stereotype.Service;

import com.joysite.backend.repository.ProductRepository;
import com.joysite.backend.entity.Product;
import com.joysite.backend.dto.ProductDto;

@Service
public class ProductService {
	
	private ProductRepository productRepo;

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

	public Product toEntity(ProductDto productDto) {
		Product product = new Product(productDto.getProductName(),
																	productDto.getDescription(),
																	productDto.getPrice(),
																	productDto.getProductImage(),
																	productDto.getStock(),
																	productDto.isDelFlg());
		return product;
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

	public Product getProductById(Long productId) {
		Product product = productRepo.findById(productId).orElse(null);
		return product;
	}

	public List<ProductDto> updateProduct(Long productId, ProductDto productDto){
		Product product = productRepo.findById(productId).orElse(null);
		if(product != null) {
			product.setProductName(productDto.getProductName());
			product.setDescription(productDto.getDescription());
			product.setPrice(productDto.getPrice());
			product.setProductImage(productDto.getProductImage());
			product.setStock(productDto.getStock());
			productRepo.save(product);
		}
		return getAllProduct();
	}

}
