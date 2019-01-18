package com.example.CarsReservation.model.form;


import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Data
@Component
public class CarForm {

//    private String surname;
    private String brand;
    private String model;
    private String transmission;
    private String body;
    private String fuel;
    private String color;
//    private String isavailable;
//    private int price;
//    private String date;


//    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//
//    public LocalDate getFormatedDate(){
//        return LocalDate.parse(date,dateTimeFormatter);
//    }


}
