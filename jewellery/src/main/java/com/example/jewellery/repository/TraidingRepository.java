package com.example.jewellery.repository;

import com.example.jewellery.model.TraidingPoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TraidingRepository extends JpaRepository<TraidingPoint,Long> {
}
