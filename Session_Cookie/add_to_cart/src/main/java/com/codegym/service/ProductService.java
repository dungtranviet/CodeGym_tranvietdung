package com.codegym.service;

import com.codegym.model.Product;

import java.util.List;

public interface ProductService {
     List<Product> findAll();
     Product findById(Long id);
}
