package com.league.entites;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity 
@Table(name="MATCHS")
public class Match {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@JsonIgnore
	@ManyToOne(fetch=FetchType.EAGER)
	private Team localTeam;
	@JsonIgnore
	@ManyToOne(fetch=FetchType.EAGER)
	private Team visiteuseTeam;
	@JsonIgnore
	@ManyToOne
	private Competition competition;
	public Match(long id,Team localTeam, Team  visiteuseTeam, Competition competition) {
		super();
		this.id = id;
		this.localTeam = localTeam;
		this.visiteuseTeam = visiteuseTeam;
		this.competition = competition;
	}

	public Match() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public Team getLocalTeam() {
		return localTeam;
	}

	public void setLocalTeam(Team localTeam) {
		this.localTeam = localTeam;
	}

	public Team getVisiteuseTeam() {
		return visiteuseTeam;
	}

	public void setVisiteuseTeam(Team visiteuseTeam) {
		this.visiteuseTeam = visiteuseTeam;
	}

	@Override
	public String toString() {
		return "Match [id=" + id + ", localTeam=" + localTeam + ", visiteuseTeam=" + visiteuseTeam + ", competition="
				+ competition + "]";
	}
	

	
	
}
