package com.usa.retofinal.repository.crudrepository;

import com.usa.retofinal.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductCrudRepository extends MongoRepository<Product, String> {
    public List<Product> findByDescriptionContainingIgnoreCase(String description);
    public List<Product> findByPriceLessThanEqual(Double price);
}
