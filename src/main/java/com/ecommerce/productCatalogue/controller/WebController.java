package com.ecommerce.productCatalogue.controller;

import com.ecommerce.productCatalogue.service.CategoryService;
import com.ecommerce.productCatalogue.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class WebController {

    private final ProductService productService;
    private final CategoryService categoryService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("categories", categoryService.getAllCategories());
        return "index";
    }

    @GetMapping("/category/{id}")
    public String filterByCategory(@PathVariable Long id, Model model) {
        model.addAttribute("products", productService.getProductsByCategory(id));
        model.addAttribute("categories", categoryService.getAllCategories());
        model.addAttribute("activeCategoryId", id);
        return "index";
    }
}