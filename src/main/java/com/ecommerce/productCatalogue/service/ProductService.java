package com.ecommerce.productCatalogue.service;

import com.ecommerce.productCatalogue.model.Product;
import com.ecommerce.productCatalogue.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
    public List<Product> getProductsByCategory(Long categoryId){
        return productRepo.findByCategoryId(categoryId);
    }
}
