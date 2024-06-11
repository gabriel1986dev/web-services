package com.gabriel86dev.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel86dev.web_services.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
