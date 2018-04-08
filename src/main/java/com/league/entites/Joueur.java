package com.league.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity 
@Table(name="JOUEUR")
public class Joueur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	 private long id;
	 private String name;
	 @JsonIgnore
	 @ManyToOne
	 private Clube clube;
	 @OneToOne(mappedBy="joueur")
	 private Licence licence;
	public Joueur(String name) {
		super();
		
		this.name = name;
	}
	public Joueur() {
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
	public Licence getLicence() {
		return licence;
	}
	public void setLicence(Licence licence) {
		this.licence = licence;
	}
	@Override
	public String toString() {
		return "Joueur [id=" + id + ", name=" + name + "]";
	}
	 

}
