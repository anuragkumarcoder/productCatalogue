package com.ecommerce.productCatalogue.config;

import com.ecommerce.productCatalogue.model.Category;
import com.ecommerce.productCatalogue.model.Product;
import com.ecommerce.productCatalogue.repo.CategoryRepo;
import com.ecommerce.productCatalogue.repo.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

import static com.fasterxml.jackson.databind.cfg.CoercionInputShape.Array;

@Component
@RequiredArgsConstructor
public class DataSeeder implements CommandLineRunner {
    private final ProductRepo productRepo;
    private final CategoryRepo categoryRepo;
    @Override
    public void run(String... args) throws Exception {
        productRepo.deleteAll();
        categoryRepo.deleteAll();
        Category electronics=new Category();
        electronics.setName("Electronics");
        Category clothing=new Category();
        clothing.setName("Clothing");
        Category home=new Category();
        home.setName("home");
        categoryRepo.saveAll(Arrays.asList(electronics,home,clothing));
        Product phone=new Product();
        phone.setName("smartPhone");
       phone.setDescription("latest phone with amazing features ");
       phone.setImageUrl("https://placehold.co/600x400");
       phone.setPrice(499.99);
       phone.setCategory(electronics);

        Product laptop=new Product();
        laptop.setName("laptop");
        laptop.setDescription("latest laptop with amazing features ");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product shirt=new Product();
        shirt.setName("check shirt");
        shirt.setDescription("fashionable shirt ");
        shirt.setImageUrl("https://placehold.co/600x400");
        shirt.setPrice(99.99);
        shirt.setCategory(clothing);

        Product blender=new Product();
        blender.setName("blender");
        blender.setDescription("latest blender with amazing features ");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(299.99);
        blender.setCategory(home);
        productRepo.saveAll(Arrays.asList(phone,laptop,shirt,blender));




    }
}
