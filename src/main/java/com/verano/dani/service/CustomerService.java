package com.verano.dani.service;

import com.verano.dani.model.Customer;
import com.verano.dani.repository.SimpleCustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    private final SimpleCustomerRepository customerRepository = new SimpleCustomerRepository();

    @Override
    public List<Customer> getAll() {
        return this.customerRepository.getAll();
    }
}
