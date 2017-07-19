package com.ecom.din.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.din.product.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
