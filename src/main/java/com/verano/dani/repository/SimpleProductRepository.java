package com.verano.dani.repository;

import com.verano.dani.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleProductRepository {

    private Map<Integer, Product> productMap = new HashMap<>();
    private Integer lastAssignedId = 0;

    public SimpleProductRepository(){
        super();
        this.lastAssignedId = 0;
        this.productMap.put(this.lastAssignedId+1,
                new Product(this.lastAssignedId+1,
                        "Lentejas",
                        Float.valueOf(1.5f),
                        Float.valueOf(1.0f),
                        Boolean.valueOf(true)));
        this.lastAssignedId = this.lastAssignedId + 1;
        this.productMap.put(this.lastAssignedId+1,
                new Product(this.lastAssignedId+1,
                        "Chorizo",
                        Float.valueOf(3f),
                        Float.valueOf(0.5f),
                        Boolean.valueOf(true)));
        this.lastAssignedId = this.lastAssignedId + 1;
        this.productMap.put(this.lastAssignedId+1,
                new Product(this.lastAssignedId+1,
                        "Coca",
                        Float.valueOf(9.0f),
                        Float.valueOf(0.001f),
                        Boolean.valueOf(false)));
        this.lastAssignedId = this.lastAssignedId + 1;
    }

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
