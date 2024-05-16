package com.example.jewellery.model;
import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
@Entity
@Table(name = "scheduled_reminder")
public class ScheduledReminder {
    @Id
    private BigInteger id;
    @Column(name = "contract_id")
    private BigInteger contractId;
    @Column(name = "reminder_time")
    private Date reminderTime;
    @Column(name = "need_to_pay")
    private String needToPay;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public BigInteger getContractId() {
        return contractId;
    }

    public void setContractId(BigInteger contractId) {
        this.contractId = contractId;
    }

    public Date getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Date reminderTime) {
        this.reminderTime = reminderTime;
    }

    public String getNeedToPay() {
        return needToPay;
    }

    public void setNeedToPay(String needToPay) {
        this.needToPay = needToPay;
    }
}