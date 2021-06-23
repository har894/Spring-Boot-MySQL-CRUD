package com.example.crudspringbootmysql.service;

import com.example.crudspringbootmysql.entity.Score;
import com.example.crudspringbootmysql.repository.ScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public Score getScoreByGameId(int id) {
        return scoreRepository.findById(id).orElse(null);
    }

    public Score incrementScore(int id, int teamNumber) {
        Optional<Score> tempOptionalScore = scoreRepository.findById(id);
        Score tempScore = tempOptionalScore.get();
        int currentScore;
        if (teamNumber == 1) {
            currentScore = tempScore.getFirstTeamScore();
            tempScore.setFirstTeamScore(currentScore + 1);
        } else if (teamNumber == 2) {
            currentScore = tempScore.getSecondTeamScore();
            tempScore.setSecondTeamScore(currentScore + 1);
        }
        scoreRepository.save(tempScore);
        return scoreRepository.findById(id).orElseGet(null);
    }

    public Score reduceScore(int id, int teamNumber) {
        Optional<Score> tempOptionScore = scoreRepository.findById(id);
        Score tempScore = tempOptionScore.get();
        int currentScore;
        if (teamNumber == 1) {
            currentScore = tempScore.getFirstTeamScore();
            tempScore.setFirstTeamScore(currentScore - 1);
        } else if (teamNumber == 2) {
            currentScore = tempScore.getSecondTeamScore();
            tempScore.setSecondTeamScore(currentScore - 1);
        }
        scoreRepository.save(tempScore);
        return scoreRepository.findById(id).orElseGet(null);
    }
    public Score incrementSetScore(int id, int teamNumber) {
        Optional<Score> tempOptionalScore = scoreRepository.findById(id);
        Score tempSetScore = tempOptionalScore.get();
        int currentScore;
        if (teamNumber == 1) {
            currentScore = tempSetScore.getFirstTeamSetScore();
            tempSetScore.setFirstTeamSetScore(currentScore + 1);
        } else if (teamNumber == 2) {
            currentScore = tempSetScore.getSecondTeamSetScore();
            tempSetScore.setSecondTeamSetScore(currentScore + 1);
        }
        scoreRepository.save(tempSetScore);
        return scoreRepository.findById(id).orElseGet(null);
    }
    public Score reduceSetScore(int id, int teamNumber) {
        Optional<Score> tempOptionalScore = scoreRepository.findById(id);
        Score tempSetScore = tempOptionalScore.get();
        int currentScore;
        if (teamNumber == 1) {
            currentScore = tempSetScore.getFirstTeamSetScore();
            tempSetScore.setFirstTeamSetScore(currentScore - 1);
        } else if (teamNumber == 2) {
            currentScore = tempSetScore.getSecondTeamSetScore();
            tempSetScore.setSecondTeamSetScore(currentScore - 1);
        }
        scoreRepository.save(tempSetScore);
        return scoreRepository.findById(id).orElseGet(null);
    }
}

