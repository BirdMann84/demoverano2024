package com.verano.dani.repository;

import com.verano.dani.model.Customer;

import java.util.*;

public class SimpleCustomerRepository {

    private final Map<Integer, Customer> customerMap = new HashMap<>();
    private Integer lastAssignedId = 0;

    public SimpleCustomerRepository(){
        super();
        this.save(new Customer("Julio", new Date()));
        this.save(new Customer("Alfonso", new Date()));

        Date tomorrow = new Date();

        this.save(new Customer("Pepe", tomorrow));
    }

    public List<Customer> getAll() {
        return new ArrayList<>(this.customerMap.values());
    }


    public void save(Customer c){
        if(c.getId() == null){
            c.setId(lastAssignedId + 1);
            this.lastAssignedId = c.getId();
        }
        this.customerMap.put(c.getId(), c);
    }
}
