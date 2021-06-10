package com.example.crudspringbootmysql.controller;

import com.example.crudspringbootmysql.entity.Car;
import com.example.crudspringbootmysql.service.CarService;
import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/allCars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/Car/{name}")
    public Car getCarName(@PathVariable String name ){return carService.getCarName(name);};
}


