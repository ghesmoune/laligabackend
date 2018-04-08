package com.league.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.league.dao.TeamRepository;
import com.league.entites.Team;

public class TeamSevice {
	
	
		@Autowired
		private TeamRepository teamRepository;
		public Team addTeam(Team team) {	
		return teamRepository.saveAndFlush(team);	
		}
		public Team updateTeam(Team team) {
			return teamRepository.saveAndFlush(team);
		}
		public Team findTeamByID(long id) {
			return teamRepository.findOne(id);
		}
		public List<Team> findAllTeams(){
			return teamRepository.findAll();
		}
	    public void deleteTeam(Long id) {
	    	teamRepository.delete(id);
	    }
	}



