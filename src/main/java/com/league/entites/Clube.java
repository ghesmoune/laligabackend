package com.league.entites;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity 
@Table(name="CLUBES")
public class Clube {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	@JsonIgnore
	@ManyToOne
	private League league;
	@OneToMany(mappedBy="clube",cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Collection<Team> teams ;
	@OneToMany(mappedBy="clube",cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Collection<Joueur> joueurs;
	public Clube(String name) {
		super();
		this.name = name;
	}
	public Clube() {
		super();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public League getLeague() {
		return league;
	}
	public void setLeague(League league) {
		this.league = league;
	}
	
	
	public void setTeams(Collection<Team> teams) {
		this.teams = teams;
	}
	public Collection<Team> getTeams() {
		return teams;
	}
	
	public Collection<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(Collection<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	@Override
	public String toString() {
		return "Clube [id=" + id + ", name=" + name + "]";
	}
	
	
}
