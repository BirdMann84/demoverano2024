package com.verano.dani.repository;

import com.verano.dani.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleProductRepository {

    private Map<Integer, Product> productMap = new HashMap<>();
    private Integer lastAssignedId = 0;

    public List<Product> getProducts(){
        return new ArrayList<>(this.productMap.values());
    }

    public void save(Product p){
        if(p.getId() == null){
            p.setId(lastAssignedId + 1);
            this.lastAssignedId = p.getId();
        }
        this.productMap.put(p.getId(), p);
    }
}
