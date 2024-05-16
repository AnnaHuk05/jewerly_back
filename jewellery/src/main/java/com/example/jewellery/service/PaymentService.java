package com.example.jewellery.service;

import com.example.jewellery.model.Payment;
import com.example.jewellery.repository.OrderRepository;
import com.example.jewellery.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    public List<Payment> getAllPayment()
    {
        return paymentRepository.findAll();
    }
    public List<Payment> getLatest()
    {
        return paymentRepository.findLatest();
    }
    public void addPayment(Payment payment)
    {
        paymentRepository.save(payment);
    }

}
