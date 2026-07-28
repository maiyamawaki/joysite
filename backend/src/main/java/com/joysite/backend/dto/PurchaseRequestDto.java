package com.joysite.backend.dto;

import java.util.List;

public class PurchaseRequestDto {
	
	private OrderDto orderDto;

	private List<OrderItemDto> orderItemListDto;

	private UsrDto userDto;

	public PurchaseRequestDto() {}

	public PurchaseRequestDto(OrderDto orderDto, List<OrderItemDto> orderItemListDto, UsrDto usrDto) {
		this.orderDto = orderDto;
		this.orderItemListDto = orderItemListDto;
		this.userDto = usrDto;
	}

	public OrderDto getOrderDto() {
		return orderDto;
	}

	public void setOrderDto(OrderDto orderDto) {
		this.orderDto = orderDto;
	}

	public List<OrderItemDto> getOrderItemListDto() {
		return orderItemListDto;
	}

	public void setOrderItemListDto(List<OrderItemDto> orderItemListDto) {
		this.orderItemListDto = orderItemListDto;
	}

	public UsrDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UsrDto userDto) {
		this.userDto = userDto;	
	}
}
