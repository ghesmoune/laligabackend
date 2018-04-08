package com.league.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.league.dao.MatchRepository;
import com.league.entites.Match;

public class MatchSevice {
	@Autowired
	private MatchRepository matchRepository;
	public Match addMatch(Match match) {	
	return matchRepository.saveAndFlush(match);	
	}
	public Match updateMatch(Match match) {
		return matchRepository.saveAndFlush(match);
	}
	public Match findMatchByID(long id) {
		return matchRepository.findOne(id);
	}
	public List<Match> findAllMatchs(){
		return matchRepository.findAll();
	}
    public void deleteMatch(Long id) {
    	matchRepository.delete(id);
    }
}
