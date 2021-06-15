package com.example.crudspringbootmysql.controller;

import com.example.crudspringbootmysql.entity.Car;
import com.example.crudspringbootmysql.entity.Score;
import com.example.crudspringbootmysql.service.CarService;
import com.example.crudspringbootmysql.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/scoreId/{id}")
    public Score findScoreByGameId(@PathVariable int id) {
        return scoreService.getScoreByGameId(id);
    }

    @PostMapping("/increment/{id}/{teamNumber}")
    public Score incrementScore(@PathVariable int id, @PathVariable int teamNumber) {
        return scoreService.incrementScore(id, teamNumber);
    }

    @PostMapping("/reduce/{id}/{teamNumber}")
    public Score reduceScore(@PathVariable int id, @PathVariable int teamNumber) {
        return scoreService.reduceScore(id, teamNumber);
    }
    @PostMapping("/incrementSet/{id}/{teamNumber}")
    public Score  incrementSetScore(@PathVariable int id, @PathVariable int teamNumber) {
        return scoreService.incrementSetScore(id, teamNumber);
    }
    @PostMapping("/reduceSet/{id}/{teamNumber}")
    public Score reduceSetScore(@PathVariable int id, @PathVariable int teamNumber) {
        return scoreService.reduceSetScore(id, teamNumber);
    }
}

