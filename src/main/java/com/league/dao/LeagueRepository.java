package com.league.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.league.entites.League;

public interface LeagueRepository extends JpaRepository<League,Long> {

}