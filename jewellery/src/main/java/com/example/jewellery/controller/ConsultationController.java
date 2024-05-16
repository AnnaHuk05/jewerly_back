package com.example.jewellery.controller;

import com.example.jewellery.model.Consultation;
import com.example.jewellery.service.ConsultationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/consultation")
public class ConsultationController {
    @Autowired
    private ConsultationService consultationService;
    @GetMapping("/get10")
    public List<Consultation> get10Consultations(){
        return consultationService.get10Consultations();
    }
    @GetMapping("/getAfterDate")
    public List<Consultation> getConsultationsFromStartDate(@PathVariable String startDate) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date date = formatter.parse(startDate);
        return consultationService.getConsultationsFromStartDate(date);
    }
    @GetMapping("/getStartWith/{id}")
    public List<Consultation> getConsultationsStartWith(@PathVariable Long id){
        return consultationService.getConsultationsStartWith(id);
    }

}