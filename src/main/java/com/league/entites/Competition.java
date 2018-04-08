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

@Entity 
@Table(name="COMPETITIONS")
public class Competition {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;
	@ManyToOne
	private League league;
	@ManyToOne
	private Categorie categorie;
	@OneToMany(mappedBy="competition",cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private Collection<Match> matches;
	
	
	public Competition() {
		super();
		
	}
	public Competition(String name) {
		super();
		this.name = name;
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
	
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	public Collection<Match> getMatches() {
		return matches;
	}
	public void setMatches(Collection<Match> matches) {
		this.matches = matches;
	}
	@Override
	public String toString() {
		return "Competition [id=" + id + ", name=" + name + "]";
	}
    
}
