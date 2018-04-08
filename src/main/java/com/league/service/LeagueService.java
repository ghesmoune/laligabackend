package com.league.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.dao.LeagueRepository;
import com.league.entites.League;

@Service
public class LeagueService {
	@Autowired
	private LeagueRepository leagueRepository;
	public League addLeague(League league) {	
	//System.out.println(league.getImage().getId());
	return leagueRepository.saveAndFlush(league);	
	}
	public League updateLeague(League league) {
		return leagueRepository.saveAndFlush(league);
	}
	public League findLeagueByID(long id) {
		return leagueRepository.findOne(id);
	}
	public List<League> findAllLeagues(){
		return leagueRepository.findAll();
	}
    public void deleteLeague(Long id) {
    	leagueRepository.delete(id);
    }
}
