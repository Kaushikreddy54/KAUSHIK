package com.example.demo.Product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
    ProductRepository productRepository;
    public String addProduct(Product product)
    {
        productRepository.save(product);
        return product.getProductName()+" is added successfully";
    }
    public Optional<Product> getProductByCompanyNameAndType(String name,String type)
    {
        return productRepository.findByCompanyNameAndType(name,type);
    }
    public String deleteProductById(String id)
    {
        productRepository.deleteById(id);
        return id+" deleted successfully";
    }

}
