package com.example.CarsReservation.repository;

import com.example.CarsReservation.model.CarModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends CrudRepository<CarModel,Integer> {

//    CarModel deleteById(int id);
//    List<CarModel> deleteByPrice(int price);
//    List<CarModel> deleteBySurnameAndModel;
    List<CarModel> findByBrand(String brand);
//     CarModel findByBrand(String brand);





//     List<CarModel> deleteBySurname(String brand);




}
