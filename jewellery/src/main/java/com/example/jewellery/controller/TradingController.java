package com.example.jewellery.controller;

import com.example.jewellery.service.TradingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/trading")
public class TradingController {
    @Autowired
    private TradingService tradingService;
}
