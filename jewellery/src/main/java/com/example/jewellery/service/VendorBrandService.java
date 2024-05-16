package com.example.jewellery.service;

import com.example.jewellery.model.VendorBrand;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.jewellery.repository.VendorBrandRepository;

import java.util.List;

@Service
public class VendorBrandService {
    @Autowired
    private VendorBrandRepository vendorBrandRepository;

    public List<VendorBrand> getVendorByName(String name) {
        return vendorBrandRepository.findVendorByName(name);
    }
}
