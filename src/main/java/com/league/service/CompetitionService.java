package com.league.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.dao.CompetitionRepository;
import com.league.entites.Competition;


	
	@Service
	public class CompetitionService {
		@Autowired
		private CompetitionRepository competitionRepository;
		public Competition addCompetition(Competition competition) {	
		return competitionRepository.saveAndFlush(competition);	
		}
		public Competition updateCompetition(Competition competition) {
			return competitionRepository.saveAndFlush(competition);
		}
		public Competition findCompetitionByID(long id) {
			return competitionRepository.findOne(id);
		}
		public List<Competition> findAllCompetitions(){
			return competitionRepository.findAll();
		}
	    public void deleteCompetition(Long id) {
	    	competitionRepository.delete(id);
	    }
	

}
