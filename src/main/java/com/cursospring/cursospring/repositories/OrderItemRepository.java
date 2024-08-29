package com.cursospring.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.cursospring.entities.OrderItem;
import com.cursospring.cursospring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
