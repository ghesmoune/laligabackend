package com.league.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.league.dao.ClubeRepository;
import com.league.entites.Clube;

@Service
public class ClubeService {
	@Autowired
	private ClubeRepository clubeRepository;
	public Clube addClube(Clube clube) {	
	return clubeRepository.saveAndFlush(clube);	
	}
	public Clube updateClube(Clube clube) {
		return clubeRepository.saveAndFlush(clube);
	}
	public Clube findClubeByID(long id) {
		return clubeRepository.findOne(id);
	}
	public List<Clube> findAllClubes(){
		return clubeRepository.findAll();
	}
    public void deleteClube(Long id) {
    	clubeRepository.delete(id);
    }
}
