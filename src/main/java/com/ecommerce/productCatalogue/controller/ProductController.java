package com.ecommerce.productCatalogue.controller;

import com.ecommerce.productCatalogue.model.Product;
import com.ecommerce.productCatalogue.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @GetMapping("/category/{categoryId}")
    public List<Product> getAllProductByCategory(@PathVariable  Long categoryId){
        return productService.getProductsByCategory(categoryId);
    }
}
