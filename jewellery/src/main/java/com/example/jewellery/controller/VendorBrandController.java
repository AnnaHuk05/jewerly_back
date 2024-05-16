package com.example.jewellery.controller;

import com.example.jewellery.model.VendorBrand;
import com.example.jewellery.service.VendorBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/vendor")
public class VendorBrandController {

    @Autowired
    private VendorBrandService vendorBrandService;

    @GetMapping("/filter/{name}")
    public List<VendorBrand> getVendorBrandByName(@PathVariable String name) {
        return vendorBrandService.getVendorByName(name);
    }
}
