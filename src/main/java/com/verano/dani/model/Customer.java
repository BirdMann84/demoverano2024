package com.verano.dani.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private Integer id;

    private String name;

    private Date signupDate;

    private List<CustomerAddress> addresses;

    public Customer(String name, Date date) {
        this.name = name;
        this.signupDate = date;
    }
}
