package com.example.jewellery.repository;

import com.example.jewellery.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment,Long> {
    String SELECT_PAYMENTS = "SELECT p.* FROM payment p  Order by p.payment_date DESC LIMIT 30";

    @Query(value = SELECT_PAYMENTS,nativeQuery = true )
    List<Payment> findLatest();
}
