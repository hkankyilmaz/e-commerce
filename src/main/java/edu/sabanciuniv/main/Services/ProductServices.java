package edu.sabanciuniv.main.Services;


import edu.sabanciuniv.main.Entity.Product;
import edu.sabanciuniv.main.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServices {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {

        productRepository.save(product);
    }

    public List<Product> getProducts() {

        Iterable<Product> products = productRepository.findAll();
        List<Product> result = new ArrayList<>();
        for (Product product : products) {
            result.add(product);
        }
        return result;

    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }

    public void updateProduct(Product product) {

        productRepository.save(product);
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).get();
    }


    public List<Product> getProductsByName(String name) {
        return productRepository.findByName(name);
    }

    public List<Product> getProductsByPrice(double price) {
        return productRepository.findByPrice(price);
    }
}
