package com.example.CarsReservation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = { CarsReservationApplication.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class CarsReservationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsReservationApplication.class, args);
	}
}
