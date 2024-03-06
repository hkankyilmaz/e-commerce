package edu.sabanciuniv.main.Repository;

import edu.sabanciuniv.main.Entity.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {


    @Query("select p from Product p where p.name = ?1")
    public List<Product> findByName(String name);

    @Query("select p from Product p where p.price = ?1")
    public List<Product>  findByPrice(double price);



}
