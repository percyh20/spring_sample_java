package com.PHS.interfaces;

import com.PHS.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
