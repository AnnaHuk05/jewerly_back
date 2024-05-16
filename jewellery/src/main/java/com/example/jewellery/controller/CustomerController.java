package com.example.jewellery.controller;

import com.example.jewellery.model.Customer;
import com.example.jewellery.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/getall")
    public List<Customer> getAllCustomer()
    {
        return customerService.getAllCustomer();
    }
    @GetMapping("/filter/{firstNameOrLastName}")
    public List<Customer> filterByNameAndLastName(@PathVariable String firstNameOrLastName) {
        return customerService.FilterByNameAndLastName(firstNameOrLastName);
    }
}
