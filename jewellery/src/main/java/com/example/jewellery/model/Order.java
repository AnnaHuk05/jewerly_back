package com.example.jewellery.model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
@Entity
@Table(name = "orders")
public class Order {
    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "vendor_brand_id")
    private VendorBrand vendorBrand;
    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;
    @Column(name = "jewellery_type")
    private String jewelleryType;
    @Column(name = "main_color")
    private String mainColor;
    @Column(name = "main_metal")
    private String mainMetal;
//    @ManyToOne
//    @JoinColumn(name= "order_id")
 //   private Storage storage;
    @Column(name = "main_gem")

    private String mainGem;
    private String assay;
    private float weight;
    private String status;
    @Column(name = "vendor_cost")
    private float vendorCost;
    @Column(name = "conclusion_date")
    private Date conclusionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public VendorBrand getVendorBrand() {
        return vendorBrand;
    }

    public void setVendorBrand(VendorBrand vendorBrand) {
        this.vendorBrand = vendorBrand;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public String getJewelleryType() {
        return jewelleryType;
    }

    public void setJewelleryType(String jewelleryType) {
        this.jewelleryType = jewelleryType;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public String getMainMetal() {
        return mainMetal;
    }

    public void setMainMetal(String mainMetal) {
        this.mainMetal = mainMetal;
    }

    public String getMainGem() {
        return mainGem;
    }

    public void setMainGem(String mainGem) {
        this.mainGem = mainGem;
    }

    public String getAssay() {
        return assay;
    }

    public void setAssay(String assay) {
        this.assay = assay;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getVendorCost() {
        return vendorCost;
    }

    public void setVendorCost(float vendorCost) {
        this.vendorCost = vendorCost;
    }

    public Date getConclusionDate() {
        return conclusionDate;
    }

    public void setConclusionDate(Date conclusionDate) {
        this.conclusionDate = conclusionDate;
    }
}

