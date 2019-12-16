package service;

import model.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products.put(1, new Product(1, "Dien thoai iphone", 1000, "iphone 7plus", "Apple"));
        products.put(1, new Product(2, "Dien thoai samsung", 1000, "galaxy s7", "samsung"));
        products.put(1, new Product(3, "Dien thoai sony", 1000, "sony z3", "sony"));
        products.put(1, new Product(4, "Dien thoai Qmobile", 1000, "Q3 sx 2009", "haiwei"));
        products.put(1, new Product(5, "Dien thoai oppo", 1000, "oppo 3", "oppo"));
    }

    @Override
    public List<Product> finAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
      products.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
       products.put(id,product);
    }

    @Override
    public void remove(int id) {
      products.remove(id);
    }
}
