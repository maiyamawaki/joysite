package com.joysite.backend.service;

import org.springframework.stereotype.Service;

import com.joysite.backend.repository.OrderRepository;
import com.joysite.backend.entity.Order;
import com.joysite.backend.entity.Usr;
import com.joysite.backend.dto.OrderDto;

@Service
public class OrderService {
	
	private OrderRepository orderRepo;

	public OrderService(OrderRepository orderRepo) {
		this.orderRepo = orderRepo;
	}

	public Order registerOrder(OrderDto orderDto, Usr user) {
		Order newOrder = new Order(user,
															orderDto.getTotalAmount(),
															orderDto.getStatus());
		orderRepo.save(newOrder);
		return newOrder;
	}

}
