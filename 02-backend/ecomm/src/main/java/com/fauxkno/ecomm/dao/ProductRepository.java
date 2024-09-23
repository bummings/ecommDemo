package com.fauxkno.ecomm.dao;

import com.fauxkno.ecomm.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
