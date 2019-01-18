package com.example.CarsReservation.controller;


import com.example.CarsReservation.model.CustomerModel;
import com.example.CarsReservation.model.form.CarForm;
import com.example.CarsReservation.model.form.CustomerForm;
import com.example.CarsReservation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerController {



    @Autowired
    CustomerRepository customerRepository;


    @GetMapping("/customer")
    public String home(Model model){
        model.addAttribute("newCustomer", new CustomerForm());
        return "addCustomer";
    }

    @PostMapping("/addedCustomer")
    @ResponseBody
    public String addCustomer(@ModelAttribute("newCustomer") CustomerForm form){

        CustomerModel customerModel = new CustomerModel(form);

        customerRepository.save(customerModel);
        return "Dodano Klienta";
    }


}
