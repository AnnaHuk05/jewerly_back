package com.example.jewellery.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import jakarta.persistence.*;
@Entity
@Table(name = "manager")
public class Manager {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "trading_point_id")
    private TraidingPoint tradingPoint;
    @OneToOne
    @JoinColumn(name = "person_data_id")
    private Person personData;
    private float salary;
    @Column(name = "hire_date")
    private Date hireDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TraidingPoint getTradingPoint() {
        return tradingPoint;
    }

    public void setTradingPoint(TraidingPoint tradingPoint) {
        this.tradingPoint = tradingPoint;
    }

    public Person getPersonData() {
        return personData;
    }

    public void setPersonData(Person personData) {
        this.personData = personData;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}


