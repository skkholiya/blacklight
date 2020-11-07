package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistances.Match;

@Repository
public interface MatchRepo extends JpaRepository<Match, Long> {

}
