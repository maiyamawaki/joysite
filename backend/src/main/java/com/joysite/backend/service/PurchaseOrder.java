package com.joysite.backend.service;

import org.springframework.stereotype.Service;


import com.joysite.backend.entity.Order;
import com.joysite.backend.entity.Product;
import com.joysite.backend.entity.Usr;
import com.joysite.backend.dto.OrderDto;
import com.joysite.backend.dto.OrderItemDto;
import com.joysite.backend.dto.ProductDto;
import com.joysite.backend.dto.UsrDto;

@Service
public class PurchaseOrder {

	private OrderService orderService;
	private OrderItemService orderItemService;
	private UsrService usrService;
	private ProductService productService;

	public PurchaseOrder(OrderService orderService, OrderItemService orderItemService, UsrService usrService) {
		this.orderService = orderService;
		this.orderItemService = orderItemService;
		this.usrService = usrService;
	}
	
	public void registerOrder(OrderDto orderDto, OrderItemDto orderItemDto, ProductDto productDto, UsrDto usrDto) {
		// register Usr
		Usr newUsr = usrService.registerUser(usrDto);

		// register Order
		Order newOrder = orderService.registerOrder(orderDto, newUsr);

		// register OrderItem
		Product product = productService.toEntity(productDto);
		orderItemService.registerOrderItem(orderItemDto, newOrder, product);
	}
}
