package com.example.jewellery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.jewellery.model.VendorBrand;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VendorBrandRepository extends JpaRepository<VendorBrand,Long> {
    String SElECT_VENDOR_BY_NAME = "SELECT * FROM vendor_brand WHERE name LIKE ?1% LIMIT 10";
    @Query(value = SElECT_VENDOR_BY_NAME, nativeQuery = true)
    List<VendorBrand> findVendorByName(String name);
}
