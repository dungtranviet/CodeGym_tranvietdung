package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private  static Map<Integer, Product> products;

    static {

        products = new HashMap<>();
        products.put(1, new Product(1, "Iphone 7", "apple", 800));
        products.put(2, new Product(2, "Galaxy 4S", "Samsung", 500));
        products.put(3, new Product(3, "Qmobile 3", "Qmobile", 300));
        products.put(4, new Product(4, "Iphone X", "Iphone", 1200));
        products.put(5, new Product(5, "Sony Z3", "Sony", 300));
        products.put(6, new Product(6, "Sony Z5", "Sony", 600));
    }
    @Override
    public List<Product> findAll(){
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product){

        products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id){
        return products.get(id);
    }

    @Override
    public  void update(int id, Product product){
        products.put(id, product);

    }

    @Override
    public void remove(int id){
        products.remove(id);
    }
}
