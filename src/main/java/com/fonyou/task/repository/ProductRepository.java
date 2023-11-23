package com.fonyou.task.repository;

import com.fonyou.task.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, String> {


}