package com.league.entites;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity 
@Table(name="TEAMS")
public class Team {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private long id;
	 private String name;
	 @JsonIgnore
	 @ManyToOne
	 private Clube clube;
	 @OneToMany(mappedBy="localTeam")
	 private Collection<Match> localMatchs;
	 @OneToMany(mappedBy="visiteuseTeam")
	 private Collection<Match> visiteuseMatchs;
	public Team(String name) {
		super();
		this.name = name;
	}
	public Team() {
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
	public Clube getClube() {
		return clube;
	}
	public void setClube(Clube clube) {
		this.clube = clube;
	}
	
	public Collection<Match> getLocalMatchs() {
		return localMatchs;
	}
	public void setLocalMatchs(Collection<Match> localMatchs) {
		this.localMatchs = localMatchs;
	}
	public Collection<Match> getVisiteuseMatchs() {
		return visiteuseMatchs;
	}
	public void setVisiteuseMatchs(Collection<Match> visiteuseMatchs) {
		this.visiteuseMatchs = visiteuseMatchs;
	}
	@Override
	public String toString() {
		return "Equipe [id=" + id + ", name=" + name + "]";
	}
	
}

