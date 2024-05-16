package com.example.jewellery.controller;

import com.example.jewellery.model.Contract;
import com.example.jewellery.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/contract")
public class ContractController {
    //get mapping for all contracts and return all contracts
    @Autowired
    private ContractService contractService;
    @GetMapping("/getall")
    public List<Contract> getAllContracts(){
        return contractService.getAllContracts();
    }
    @GetMapping("/{id}")
    public Optional<Contract> getContractById(@PathVariable Long id){
        return contractService.getContractById(id);
    }
    @GetMapping("/get10")
    public List<Contract> get10Contracts(){
        return contractService.get10Contracts();
    }
    @GetMapping("/getBetweenDates/{startDate}/{endDate}")


    public List<Contract> findAllContractsBetweenDates(@PathVariable String startDate, @PathVariable String endDate){
        //parse the date

        return contractService.findAllContractsBetweenDates(startDate, endDate);
    }

    @GetMapping("/manager/{managerName}")
    public List<Contract> getContractsByManager(@PathVariable String managerName){
        return contractService.getContractsByManager(managerName);
    }

    @GetMapping("/customer/{customerName}")
    public List<Contract> getContractsByCustomer(@PathVariable String customerName){
        return contractService.getContractsByCustomer(customerName);
    }
    // Java
    @GetMapping("/order/{startingOrderId}")
    public List<Contract> getContractsByStartingOrderId(@PathVariable Long startingOrderId){
        return contractService.getContractsByStartingOrderId(startingOrderId);
    }
    @GetMapping("/getStartWith/{startingOrderId}")
    public List<Contract> getContractsByStartingId(@PathVariable Long startingOrderId){
        return contractService.getContractsByStartingId(startingOrderId);
    }


    //get mapping for contract by id and return contract by id

}
