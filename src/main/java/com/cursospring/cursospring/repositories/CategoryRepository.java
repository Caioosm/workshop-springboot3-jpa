package com.cursospring.cursospring.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.cursospring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
