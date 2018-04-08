package com.league.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.league.entites.Team;

public interface TeamRepository extends JpaRepository<Team,Long>{

}
