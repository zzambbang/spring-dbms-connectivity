package com.certiware.dbms.dao.product;

import com.certiware.dbms.model.product.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{
    
}
