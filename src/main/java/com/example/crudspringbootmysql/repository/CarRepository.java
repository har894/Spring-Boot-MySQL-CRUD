package com.example.crudspringbootmysql.repository;

import com.example.crudspringbootmysql.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findByName(String name);

    Car findByImgURL(String imgURL);

}
