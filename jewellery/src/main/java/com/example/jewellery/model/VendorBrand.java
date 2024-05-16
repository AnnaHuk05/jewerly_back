package com.example.jewellery.model;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import jakarta.persistence.*;
@Entity
@Table(name = "vendor_brand")
public class VendorBrand {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "address_id")
    private Address addressId;
    private String name;
    @Column(name = "company_size")
    private String factorySize;
    @Column(name = "establish_date")
    private Date establishDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddressId() {
        return addressId;
    }

    public void setAddressId(Address addressId) {
        this.addressId = addressId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFactorySize() {
        return factorySize;
    }

    public void setFactorySize(String factorySize) {
        this.factorySize = factorySize;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }
}