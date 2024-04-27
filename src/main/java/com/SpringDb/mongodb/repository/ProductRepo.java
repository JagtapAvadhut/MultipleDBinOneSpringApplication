package com.SpringDb.mongodb.repository;

import com.SpringDb.mongodb.entites.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepo extends MongoRepository<Product,String> {
}
