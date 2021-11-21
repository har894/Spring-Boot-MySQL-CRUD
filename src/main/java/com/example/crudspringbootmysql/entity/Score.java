package com.example.crudspringbootmysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "scores")
public class Score {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer gameId;
    private String firstTeamName;
    private Integer firstTeamScore;
    private Integer firstTeamSetScore;
    private String secondTeamName;
    private Integer secondTeamScore;
    private Integer secondTeamSetScore;
}
