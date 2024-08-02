package com.verano.dani.service;

import com.verano.dani.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();
    void save(Product p);
}
