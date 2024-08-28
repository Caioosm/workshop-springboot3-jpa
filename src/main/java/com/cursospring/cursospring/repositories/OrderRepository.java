package com.cursospring.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.cursospring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
