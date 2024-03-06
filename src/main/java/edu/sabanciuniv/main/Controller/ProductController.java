package edu.sabanciuniv.main.Controller;


import edu.sabanciuniv.main.Entity.Product;
import edu.sabanciuniv.main.Services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ProductsController")
public class ProductController {

    @Autowired
    private ProductServices productServices;

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product) {
        productServices.addProduct(product);

        return "Product added";

    }

    @GetMapping("/getProducts")
    public List<Product> getProducts() {
        return productServices.getProducts();
    }

    @DeleteMapping("/deleteProduct/{id}")
    public void deleteProduct(@PathVariable("id") int id) {
        productServices.deleteProduct(id);
    }

    @PutMapping("/updateProduct")
    public void updateProduct(@RequestBody Product product) {
        productServices.updateProduct(product);
    }

    @GetMapping("/getProduct/{id}")
    public Product getProduct(@PathVariable("id") int id) {
        return productServices.getProductById(id);
    }

    @GetMapping("/getProductsByName/{name}")
    public List<Product> getProductsByName(@PathVariable("name") String name) {
        return productServices.getProductsByName(name);
    }

    @GetMapping("/getProductsByPrice/{price}")
    public List<Product> getProductsByPrice(@PathVariable("price") double price) {
        return productServices.getProductsByPrice(price);
    }


}
