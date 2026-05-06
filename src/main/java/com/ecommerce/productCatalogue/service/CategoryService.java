package com.ecommerce.productCatalogue.service;

import com.ecommerce.productCatalogue.model.Category;
import com.ecommerce.productCatalogue.repo.CategoryRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryService {


    private final CategoryRepo categoryRepo;



    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }
}

