package com.cursospring.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.cursospring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
