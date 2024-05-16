package com.example.jewellery.model;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "storage")
public class Storage {
    @Id
    private BigInteger id;

    @Column(name = "real_weight")
    private float realWeight;

  //  @OneToMany( mappedBy= "storage")
 //   private <Order> order;
    @OneToOne
    @JoinColumn(name = "trading_point_id")
    private TraidingPoint tradingPoint;
    @Column(name = "deliver_date")
    private Date deliveringDate;

    // Геттери і сеттери
}
