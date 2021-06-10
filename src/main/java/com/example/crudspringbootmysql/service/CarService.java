package com.example.crudspringbootmysql.service;

import com.example.crudspringbootmysql.entity.Car;
import com.example.crudspringbootmysql.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;


    public List<Car> getCars() {
        return carRepository.findAll();
    }

}

