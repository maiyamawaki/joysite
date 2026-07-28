package com.joysite.backend.service;

import org.springframework.stereotype.Service;

import com.joysite.backend.repository.OrderItemRepository;
import com.joysite.backend.entity.Product;
import com.joysite.backend.entity.Order;
import com.joysite.backend.entity.OrderItem;
import com.joysite.backend.dto.OrderItemDto;

@Service
public class OrderItemService {
	
	private OrderItemRepository orderItemRepo;

	public OrderItemService(OrderItemRepository orderItemRepo) {
		this.orderItemRepo = orderItemRepo;
	}

	public void registerOrderItem(OrderItemDto orderItemDto, Order order, Product product) {
		OrderItem newOrderItem = new OrderItem(order,
																					product,
																					orderItemDto.getPrice(),
																					orderItemDto.getQuantity());
		orderItemRepo.save(newOrderItem);
	}

}
