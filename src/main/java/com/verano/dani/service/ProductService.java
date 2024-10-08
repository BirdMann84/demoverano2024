package com.verano.dani.service;

import com.verano.dani.model.Product;
import com.verano.dani.repository.SimpleProductRepository;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@NoArgsConstructor
public class ProductService implements IProductService{

    private SimpleProductRepository repository = new SimpleProductRepository();

    public List<Product> getAllProducts(){
        final List<Product> allProducts = this.repository.getProducts();

        final List<Product> productsToReturn = new ArrayList<>();

        for (Product p : allProducts){
            if (p.getAvailable()){
                productsToReturn.add(p);
            }
        }

        return productsToReturn;
    }

    public void save(Product p){

        this.repository.save(p);
    }

}
