package com.joysite.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joysite.backend.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
