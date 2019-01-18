package com.example.CarsReservation.repository;


import com.example.CarsReservation.model.CustomerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerModel,Long> {









}
