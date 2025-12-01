package com.example.springd.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springd.entity.Product;
@Repository
public interface ProductRespostory extends JpaRepository<Product, Integer> {

}
