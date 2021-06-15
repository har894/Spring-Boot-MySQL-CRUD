package com.example.crudspringbootmysql.repository;

import com.example.crudspringbootmysql.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Integer> {
}
