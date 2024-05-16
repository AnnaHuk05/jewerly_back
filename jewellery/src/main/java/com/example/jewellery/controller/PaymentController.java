package com.example.jewellery.controller;

import com.example.jewellery.model.Order;
import com.example.jewellery.model.Payment;
import com.example.jewellery.service.OrderService;
import com.example.jewellery.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/pay")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @GetMapping("/getall")
    public List<Payment> getAllOrders(){
        List<Payment> all = paymentService.getAllPayment();
        return all;
    }
    @GetMapping("/getlatest")
    public List<Payment> getLatest(){
        return paymentService.getLatest();
    }
    @PostMapping("/add")
    public void addPayment(@RequestBody Payment payment){
        paymentService.addPayment(payment);
    }
}
