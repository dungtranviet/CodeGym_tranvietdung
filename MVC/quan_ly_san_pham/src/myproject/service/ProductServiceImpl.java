package myproject.service;

import myproject.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product>customers;
    static {
        customers=new HashMap<>();
        customers.put(1,new Product(1,"S3 phone",300,"san xuat 2009","samsung"));
        customers.put(2,new Product(2,"iphone 8",1000,"san xuat 2018","apple"));
        customers.put(3,new Product(3,"sony z3",400,"san xuat 2010","sony"));
        customers.put(4,new Product(4,"oppo p8",200,"san xuat 2012","oppo"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Product product) {
      customers.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return  customers.get(id);
    }

    @Override
    public void update(int id, Product product) {
       customers.put(id, product);
    }

    @Override
    public void remove(int id) {
     customers.remove(id);
    }
}
