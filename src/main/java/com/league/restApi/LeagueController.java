package com.league.restApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.league.entites.League;
import com.league.service.LeagueService;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping(value="/api")
public class LeagueController {
	@Autowired
	private LeagueService leagueService;
	
	@RequestMapping(value="/leagues",method=RequestMethod.POST)
	public League save(@RequestBody League league) {
		return leagueService.addLeague(league);
	}
	@RequestMapping(value="/leagues",method=RequestMethod.GET)
    public List<League> findAll(){
    	return leagueService.findAllLeagues();
    }
	@RequestMapping(value="/leagues/{id}",method=RequestMethod.GET)
	public League getById(@PathVariable("id")Long id) {
		return leagueService.findLeagueByID(id);	
	}
	@RequestMapping(value="/leagues",method=RequestMethod.PUT)
	public League update(@RequestBody League ligue) {
		return leagueService.updateLeague(ligue);
	}
    @RequestMapping(value="/leagues/{id}",method=RequestMethod.DELETE)
    public void delete(@PathVariable("id") Long id) {
    	leagueService.deleteLeague(id);;
    }

}
