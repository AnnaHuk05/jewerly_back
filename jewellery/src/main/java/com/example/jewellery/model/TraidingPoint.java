package com.example.jewellery.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import jakarta.persistence.*;
@Entity
@Table(name = "traiding_point")
public class TraidingPoint {
    @Id
    private Long id;
    @Column(name = "address_id")
    private BigInteger addressId;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String email;
    @Column(name = "open_time")
    private Time openTime;
    @Column(name = "closed_time")
    private Time closedTime;
    private float area;
    @Column(name = "establish_date")
    private Date establishDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigInteger getAddressId() {
        return addressId;
    }

    public void setAddressId(BigInteger addressId) {
        this.addressId = addressId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Time getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Time openTime) {
        this.openTime = openTime;
    }

    public Time getClosedTime() {
        return closedTime;
    }

    public void setClosedTime(Time closedTime) {
        this.closedTime = closedTime;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }
}