package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
