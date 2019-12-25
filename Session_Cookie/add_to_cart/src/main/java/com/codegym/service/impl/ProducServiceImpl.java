package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;
import com.codegym.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProducServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return (List<Product>)productRepository.findAll();
    }
    @Override
    public Product findById(Long id) {
        return  productRepository.findById(id).orElse(null);
    }
}
