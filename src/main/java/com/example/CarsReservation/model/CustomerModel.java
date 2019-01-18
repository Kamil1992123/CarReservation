package com.example.CarsReservation.model;


import com.example.CarsReservation.model.form.CustomerForm;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "cust")
@AllArgsConstructor
public class CustomerModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idCust;
    private String name;
    private String surname;


    public CustomerModel(CustomerForm customerForm) {
        name = customerForm.getName();
        surname = customerForm.getSurname();
    }
}
