package com.verano.dani.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleTicket {

    private Customer customer;

    private CustomerAddress deliveryAddress;

    List<SaleTicketEntry> entries = new ArrayList<>();
}
