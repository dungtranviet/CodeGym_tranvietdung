package com.codegym.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Long,Integer>products;

    public Cart() {
        products=new HashMap<>();
    }

    public void addToCart(Long id){
        if (products.containsKey(id)) {
            products.replace(id,products.get(id)+1);
        }
        else {
            products.put(id,1);
        }
    }

    public Map<Long, Integer> getProducts() {
        return products;
    }
    public int getQuantity(Long id) {
        return products.get(id);
    }
    public void remove(Long id){
        products.remove(id);
    }
}
