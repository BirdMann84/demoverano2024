package com.verano.dani.controller;

import com.verano.dani.dto.CreateProductRequest;
import com.verano.dani.model.Product;
import com.verano.dani.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private final IProductService productService;

    public ProductController(IProductService productService){
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll(){
        return this.productService.getAllProducts();
    }

    @PostMapping
    public void createProduct(@RequestBody CreateProductRequest request){
        Product p = new Product();

        p.setName(request.getName());
        p.setPrice(request.getPrice());
        p.setWeigh(request.getWeigh());
        p.setAvailable(request.getAvailable());

        this.productService.save(p);

    }

}
