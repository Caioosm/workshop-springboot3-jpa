package com.cursospring.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursospring.cursospring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
