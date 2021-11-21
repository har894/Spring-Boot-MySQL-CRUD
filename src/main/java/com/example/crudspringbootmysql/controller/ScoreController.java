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
    public static int currentID = 1;

    @Autowired
    private ScoreService scoreService;

    @GetMapping("newgame/{team1}/{team2}")
    public String setCurrent(@PathVariable String team1, @PathVariable String team2){
        Score score = scoreService.createGame(team1,team2);
        return "Game "+ score.getFirstTeamName() + " vs " + score.getSecondTeamName()+" created.";
    }

    @GetMapping("active/{id}")
    public String setCurrent(@PathVariable int id){
        currentID = id;
        return "ID is " + id;
    }

    @GetMapping("/arduino")
    public Map findScoreByGameId() {
        Score score = scoreService.getScoreByGameId(currentID);
        Map<String, Integer> integerList = new HashMap<>();
        integerList.put("ft",score.getFirstTeamScore());
        integerList.put("st",score.getSecondTeamScore());
        integerList.put("fts",score.getFirstTeamSetScore());
        integerList.put("sts",score.getSecondTeamSetScore());
        return integerList;
    }

    @GetMapping("/gameId/{id}")
    public Score findScoreByGameId(@PathVariable int id) {
        return scoreService.getScoreByGameId(currentID);
    }

    @PostMapping("/resetScore")
    public void reset() {
        scoreService.resetScore(currentID);
    }

    @PostMapping("/resetSet")
    public void resetSet() {
        scoreService.resetSet(currentID);
    }

    @PostMapping("/increment/{id}/{teamNumber}")
    public Score incrementScore(@PathVariable int id, @PathVariable int teamNumber) {
        return scoreService.incrementScore(currentID, teamNumber);
    }

    @PostMapping("/reduce/{id}/{teamNumber}")
    public Score reduceScore(@PathVariable int id, @PathVariable int teamNumber) {
        return scoreService.reduceScore(currentID, teamNumber);
    }
    @PostMapping("/incrementSet/{id}/{teamNumber}")
    public Score  incrementSetScore(@PathVariable int id, @PathVariable int teamNumber) {
        return scoreService.incrementSetScore(currentID, teamNumber);
    }
    @PostMapping("/reduceSet/{id}/{teamNumber}")
    public Score reduceSetScore(@PathVariable int id, @PathVariable int teamNumber) {
        return scoreService.reduceSetScore(currentID, teamNumber);
    }
}

