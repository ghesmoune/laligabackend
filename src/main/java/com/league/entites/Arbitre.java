package com.league.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="ARBITRE")
public class Arbitre {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;

}
