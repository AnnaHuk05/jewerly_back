package com.example.jewellery.service;

import com.example.jewellery.model.Contract;
import com.example.jewellery.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ContractService {
    @Autowired
    ContractRepository contractRepository;
    public List<Contract> getAllContracts(){
        return contractRepository.findAll();
    }

    public List<Contract> get10Contracts(){
        return contractRepository.find10();
    }

    public Optional<Contract> getContractById(Long id){
        return contractRepository.findById(id);
    }
    public List<Contract> findAllContractsBetweenDates(String startDate, String endDate) {
        return contractRepository.findAllContractsBetweenDates(parseStringToDate(startDate), parseStringToDate(endDate));
    }
    public List<Contract> getContractsByStartingOrderId(Long startingOrderId){
        return contractRepository.findContractsByStartingOrderId(startingOrderId);
    }
    public List<Contract> getContractsByManager(String managerName){
        return contractRepository.findContractsByManager(managerName);
    }

    public List<Contract> getContractsByCustomer(String customerName){
        return contractRepository.findContractsByCustomer(customerName);
    }
    public List<Contract> getContractsByStartingId(Long startingOrderId){
        return contractRepository.findContractsByStartingId(startingOrderId);
    }

    public Date parseStringToDate(String dateStr) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = formatter.parse(dateStr);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
