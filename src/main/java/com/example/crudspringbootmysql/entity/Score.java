package com.example.crudspringbootmysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "scores")
public class Score {
    @Id
    @GeneratedValue
    private int gameId;
    private String firstTeamName;
    private Integer firstTeamScore;
    private int firstTeamSetScore;
    private String secondTeamName;
    private Integer secondTeamScore;
    private int secondTeamSetScore;


}
