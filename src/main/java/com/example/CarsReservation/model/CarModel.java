package com.example.CarsReservation.model;


import com.example.CarsReservation.model.form.CarForm;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;


@Data
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class CarModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String surname;
    private String brand;
    private String model;
    private String transmission;
    private String body;
    private String fuel;
    private String color;
    private String isavailable;
    private int price;
    private LocalDate date;



    public CarModel(CarForm carForm){
        surname = carForm.getSurname();
        brand = carForm.getBrand();
        model = carForm.getModel();
        transmission = carForm.getTransmission();
        body = carForm.getBody();
        fuel =carForm.getFuel();
        color = carForm.getColor();
        isavailable = carForm.getIsavailable();
        price = carForm.getPrice();
        date = carForm.getFormatedDate();
    }
}
