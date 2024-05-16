package com.example.jewellery.controller;

import com.example.jewellery.model.Manager;
import com.example.jewellery.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/manager")
public class ManagerController {
    @Autowired
    ManagerService managerService;
    @GetMapping("/getall")
    public List<Manager> getAllManager()
    {

        return managerService.getAll();
    }
}
