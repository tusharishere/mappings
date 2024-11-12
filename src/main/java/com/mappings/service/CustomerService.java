package com.mappings.service;

import com.mappings.entity.Customer;
import com.mappings.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer createCustomer(Customer customer) {
        Customer saved = customerRepository.save(customer);
        return saved;
    }
}
