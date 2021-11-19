package com.example.crudspringbootmysql.controller;

import com.example.crudspringbootmysql.entity.Score;
import com.example.crudspringbootmysql.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@CrossOrigin
@RestController
public class ScoreController {
    @Autowired
    private ScoreService scoreService;

    @GetMapping("/arduino")
    public Map findScoreByGameId() {
        int id = 1;
        Score score = scoreService.getScoreByGameId(id);
        Map<String, Integer> integerList = new HashMap<>();
        integerList.put("ft",score.getFirstTeamScore());
        integerList.put("st",score.getSecondTeamScore());
        integerList.put("fts",score.getFirstTeamSetScore());
        integerList.put("sts",score.getSecondTeamSetScore());
        return integerList;
    }

    @GetMapping("/gameId/{id}")
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

