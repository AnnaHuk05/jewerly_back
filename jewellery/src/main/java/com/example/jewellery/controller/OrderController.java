package com.example.jewellery.controller;

import com.example.jewellery.model.Order;
import com.example.jewellery.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/getall")
    public List<Order> getAllOrders(){
        return orderService.getAllOrders();
    }
    @GetMapping("/{id}")
    public Optional<Order> GetOrderById(@PathVariable Long id){
        return  orderService.getOrderById(id);
    }
    @PostMapping("/add")
    public void addOrder(@RequestBody Order order){
        orderService.addOrder(order);
    }


}
