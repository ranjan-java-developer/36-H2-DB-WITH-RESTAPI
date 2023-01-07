package com.ranjanit.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ranjanit.restapi.product.Product;

public interface ProductRepository extends JpaRepository<Product ,Integer>{

}
