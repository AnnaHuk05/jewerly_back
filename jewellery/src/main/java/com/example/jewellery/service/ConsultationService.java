package com.example.jewellery.service;

import com.example.jewellery.model.Consultation;
import com.example.jewellery.repository.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class ConsultationService {
    @Autowired
    private ConsultationRepository consultationRepository;

    public List<Consultation> getConsultationsFromStartDate(Date startDate) {
        return consultationRepository.findByConsultationDateAfter(startDate);

    }
    public List<Consultation> get10Consultations() {
        return consultationRepository.find10();
    }
    public List<Consultation> getConsultationsStartWith( Long id) {
        return consultationRepository.findConsultationStartWith(id);
    }
}