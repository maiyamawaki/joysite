package com.joysite.backend.service;

import org.springframework.stereotype.Service;

import com.joysite.backend.entity.Order;
import com.joysite.backend.entity.OrderItem;
import com.joysite.backend.entity.Product;
import com.joysite.backend.entity.Usr;
import com.joysite.backend.dto.OrderDto;
import com.joysite.backend.dto.OrderItemDto;
import com.joysite.backend.dto.PurchaseRequestDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseOrderService {

	private OrderService orderService;
	private OrderItemService orderItemService;
	private UsrService usrService;
	private ProductService productService;

	public PurchaseOrderService(OrderService orderService, OrderItemService orderItemService, UsrService usrService, ProductService productService) {
		this.orderService = orderService;
		this.orderItemService = orderItemService;
		this.usrService = usrService;
		this.productService = productService;
	}
	
	public void purchaseOrder(PurchaseRequestDto requestDto) {
		// register Usr
		Usr newUsr = usrService.registerUser(requestDto.getUserDto());

		// product List
		BigDecimal total = BigDecimal.ZERO;
		List<Product> productList = new ArrayList<>();
		for (OrderItemDto item : requestDto.getOrderItemListDto()) {
			Product product = productService.getProductById(item.getProductId());
			productList.add(product);

			BigDecimal subTotal = new BigDecimal(item.getQuantity()).multiply(product.getPrice());
			total = total.add(subTotal);
		}

		// register Order
		OrderDto orderDto = requestDto.getOrderDto();
		orderDto.setTotalAmount(total);
		Order newOrder = orderService.registerOrder(orderDto, newUsr);

		// register OrderItem
		for(int i = 0; i<requestDto.getOrderItemListDto().size(); i++) {
			OrderItemDto orderItemDto = requestDto.getOrderItemListDto().get(i);
			orderItemService.registerOrderItem(orderItemDto, newOrder, productList.get(i));
		}
	}
}
