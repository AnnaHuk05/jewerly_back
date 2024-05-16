package com.example.jewellery.repository;

import com.example.jewellery.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepositoty extends JpaRepository<Customer,Long> {
    String SELECT_CUSTOMERS = "SELECT DISTINCT c.* FROM customer c JOIN person pd ON pd.id=c.person_data_id WHERE pd.first_name LIKE ?1% OR pd.last_name LIKE ?1%  Limit 10";
    @Query(value = SELECT_CUSTOMERS, nativeQuery = true)
    List<Customer> findCustomersByFirstNameOrLastName(String firstNameOrLastName);

}

