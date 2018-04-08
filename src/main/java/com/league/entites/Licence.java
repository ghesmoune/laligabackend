package com.league.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity 
@Table(name="LICENCES")
public class Licence {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private long id;
	 private String N;
	 @JsonIgnore
	 @OneToOne
	 private Joueur joueur;
	 @ManyToOne
	 private League league;
	public Licence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Licence(String n) {
		super();
		N = n;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getN() {
		return N;
	}
	public void setN(String n) {
		N = n;
	}
	public Joueur getJoueur() {
		return joueur;
	}
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}
	
	@Override
	public String toString() {
		return "Licence [id=" + id + ", N=" + N + ", joueur=" + joueur + ", league=" + league + "]";
	}
	
}
