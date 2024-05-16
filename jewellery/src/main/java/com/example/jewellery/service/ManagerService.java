package com.example.jewellery.service;

import com.example.jewellery.model.Manager;
import com.example.jewellery.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepository managerRepository;

    public List<Manager> getAll(){
       return managerRepository.findAll();
    }
}
