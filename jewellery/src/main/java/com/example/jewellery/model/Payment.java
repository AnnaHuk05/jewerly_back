package com.example.jewellery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Date;
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "consultation_id",nullable = true)
    private Consultation consultation;
    @ManyToOne
    @JoinColumn(name = "contract_id",nullable = true)
    private Contract contract;
    private float amount;
    @Column(name = "payment_date")
    private Date paymentDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Consultation getConsultation() {
        return consultation;
    }

    public void setConsultation(Consultation consultation) {
        this.consultation = consultation;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}
