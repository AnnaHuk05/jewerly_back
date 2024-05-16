package com.example.jewellery.repository;
import com.example.jewellery.model.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ConsultationRepository extends JpaRepository<Consultation, Long>{
    String QueryConsultation = "SELECT * FROM consultation Limit 10";
    String QueryConsultationStartWith = "SELECT * FROM consultation WHERE CAST(id AS VARCHAR) LIKE CAST(?1 AS VARCHAR) || '%'  LIMIT 40";
    @Query(value = QueryConsultation, nativeQuery = true)
    List<Consultation> find10();
    List<Consultation> findByConsultationDateAfter(Date startDate);

    @Query(value = QueryConsultationStartWith, nativeQuery = true)
    List<Consultation> findConsultationStartWith(Long id);
}
