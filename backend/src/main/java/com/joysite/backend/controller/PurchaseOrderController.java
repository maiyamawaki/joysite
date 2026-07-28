package com.joysite.backend.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joysite.backend.dto.PurchaseRequestDto;
import com.joysite.backend.service.PurchaseOrderService;

@RestController
public class PurchaseOrderController {
	
	private PurchaseOrderService purchaseService;

	public PurchaseOrderController(PurchaseOrderService purchaseService) {
		this.purchaseService = purchaseService;
	}

	public void purchaseOrder(@RequestBody PurchaseRequestDto purchaseRequestDto) {
		purchaseService.purchaseOrder(purchaseRequestDto);
	}

}
