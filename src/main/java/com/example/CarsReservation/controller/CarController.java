package com.example.CarsReservation.controller;


import com.example.CarsReservation.model.CarModel;
import com.example.CarsReservation.model.form.CarForm;
import com.example.CarsReservation.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @Autowired
    CarRepository carRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }


    @GetMapping("/reservation")
    public String home(Model model) {
        model.addAttribute("carsReservation", new CarForm());
        return "addReservation";
    }


    @PostMapping("/reservation")
    @ResponseBody
    public String addCars(@ModelAttribute("carsReservation") CarForm form) {

        CarModel carModel = new CarModel(form);
        carRepository.save(carModel);
        return "Dodano";
    }



    @GetMapping("/delete")
    @ResponseBody
    public String deleteHome() {
        return "Podaj w przeglądarce swoje nazwisko aby usunąć rezerwację. : /delete/...";
    }

    @Transactional
    @GetMapping("/delete/{surname}")
    public String deleteBySurname(@PathVariable String surname) {
//        carRepository.deleteBySurname(surname);
        return "delete";
    }


    @GetMapping("/showcars")
    public String showAllCars(Model model) {
        List<CarModel> carModelList = new ArrayList<>();
        Iterable<CarModel> carIterable = carRepository.findAll();

        for (CarModel car : carIterable)
            carModelList.add(car);

        model.addAttribute("cars", carModelList);
        return "showCars";
    }


    @GetMapping("/findcar")
    public String findCar(String brand, Model model) {
        List<CarModel> searchCarBy = new ArrayList<>();
        Iterable<CarModel> resultList = carRepository.findByBrand(brand);

        for (CarModel car : resultList)
            searchCarBy.add(car);

        model.addAttribute("search", searchCarBy);

        return "carSearch";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }
}