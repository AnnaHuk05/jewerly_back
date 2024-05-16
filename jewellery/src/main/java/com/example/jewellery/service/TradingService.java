package com.example.jewellery.service;

import com.example.jewellery.model.TraidingPoint;
import com.example.jewellery.repository.TraidingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class TradingService {
    @Autowired
    private TraidingRepository traidingRepository;

    public List<TraidingPoint> getAllTrading(){
        return traidingRepository.findAll();
    }
    public Optional<TraidingPoint> getTradingById(Long id){
        return traidingRepository.findById(id);
    }
}
