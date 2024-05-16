package com.example.jewellery.repository;

import com.example.jewellery.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface ContractRepository extends JpaRepository<Contract,Long>{
    String SELECT_CONTRACTS = "SELECT c.* FROM contract c JOIN orders o ON o.id=c.order_id WHERE o.status != 'paid' Order by c.conclusion_date DESC LIMIT 30";
    String SELECT_CONTRACTS_BETWEEN_DATES = "SELECT * FROM contract WHERE conclusion_date BETWEEN :startDate AND :endDate";
    String SELECT_CONTRACTS_BY_MANAGER = "SELECT c.* FROM contract c JOIN orders o ON c.order_id = o.id JOIN manager m ON m.id = o.manager_id JOIN person p ON p.id = m.person_data_id  WHERE (p.first_name LIKE ?1% OR p.last_name LIKE ?1% LIMIT 50";
    String SELECT_CONTRACTS_BY_CUSTOMER = "SELECT c.* FROM contract c JOIN orders o ON c.order_id = o.id JOIN customer cu ON cu.id = o.customer_id JOIN person p ON p.id = cu.person_data_id WHERE (p.first_name LIKE ?1% OR p.last_name LIKE ?1% LIMIT 50";
    String SELECT_CONTRACTS_BY_STARTING_ORDER_ID = "SELECT * FROM contract WHERE order_id LIKE ?1% LIMIT 50";
    String SELECT_CONTRACTS_BY_START_ID = "SELECT * FROM contract WHERE CAST(id AS VARCHAR) LIKE CAST(?1 AS VARCHAR) || '%'  LIMIT 40";
    @Query(value = SELECT_CONTRACTS, nativeQuery = true)
    List<Contract> find10();
    @Query(value = SELECT_CONTRACTS_BY_MANAGER, nativeQuery = true)
    List<Contract> findContractsByManager( String managerName);

    @Query(value = SELECT_CONTRACTS_BY_CUSTOMER, nativeQuery = true)
    List<Contract> findContractsByCustomer( String customerName);
    @Query(value = SELECT_CONTRACTS_BETWEEN_DATES,nativeQuery = true)
    List<Contract> findAllContractsBetweenDates(@Param("startDate") Date startDate, @Param("endDate") Date endDate);

    // Java
    @Query(value =SELECT_CONTRACTS_BY_STARTING_ORDER_ID, nativeQuery = true)
    List<Contract> findContractsByStartingOrderId(Long  startingOrderId);
    @Query(value = SELECT_CONTRACTS_BY_START_ID, nativeQuery = true)
    List<Contract> findContractsByStartingId(Long startingOrderId);
}
