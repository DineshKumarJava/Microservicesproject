package com.ecom.din.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.din.product.domain.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

}
