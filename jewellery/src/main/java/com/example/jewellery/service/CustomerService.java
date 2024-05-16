package com.example.jewellery.service;

import com.example.jewellery.model.Customer;
import com.example.jewellery.repository.CustomerRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepositoty customerRepositoty;
    //TODO: Add methods to interact with customer repository
    public List<Customer> getAllCustomer()
    {
        return customerRepositoty.findAll();
    }
    public Customer getCustomerById(Long id)
    {
        return customerRepositoty.findById(id).get();
    }
    public void addCustomer(Customer customer)
    {
        customerRepositoty.save(customer);
    }
    public void updateCustomer(Customer customer) {
        customerRepositoty.save(customer);
    }
    public List<Customer> FilterByNameAndLastName(String firstNameOrLastName)
    {
        return customerRepositoty.findCustomersByFirstNameOrLastName(firstNameOrLastName);
    }

}
