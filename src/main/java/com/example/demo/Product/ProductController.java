package com.example.demo.Product;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
    ProductService productService;

    @PostMapping("/addProduct")
    public String addProduct(@RequestBody Product product)
    {
    	return productService.addProduct(product);
    }

    @GetMapping("/getProductByCompanyNameAndType/{name}/{type}")
    public Optional<Product> getProductByCompanyNameAndType(@PathVariable("name") String name,@PathVariable("type") String type)
    {
    	return productService.getProductByCompanyNameAndType(name,type);
    }

    @DeleteMapping("/deleteProductById/{id}")
    public String deleteProductById(@PathVariable("id") String id)
    {
    	return productService.deleteProductById(id);
    }

}
