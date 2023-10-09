package com.example.demo.Product;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product,String>{
	
	Optional<Product> findByCompanyNameAndType(String name, String type);

}
