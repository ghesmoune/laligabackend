package com.league.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.league.entites.Match;


public interface MatchRepository extends JpaRepository<Match,Long> {

}
