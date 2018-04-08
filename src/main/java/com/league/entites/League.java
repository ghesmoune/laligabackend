package com.league.entites;

import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity 
@Table(name="LEAGUES")
public class League {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
 private long id;
 private String name;
 private String description;
 private String address;
 @OneToOne(cascade={CascadeType.REMOVE})
 private Image image;
@OneToMany(mappedBy="league" ,cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
 private Collection<Clube> Clubes ;
 @OneToMany(mappedBy="league" ,cascade=CascadeType.REMOVE,fetch=FetchType.LAZY)
 private Collection<Licence> licences ;
 @OneToMany(mappedBy="league",cascade=CascadeType.REMOVE,fetch=FetchType.EAGER)
 private Collection<Categorie> categories ;
public League(String name) {
	super();
	this.name = name;
}
public League() {
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

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Collection<Clube> getClubes() {
	return Clubes;
}
public void setClubes(Collection<Clube> clubes) {
	Clubes = clubes;
}
public Collection<Licence> getLicences() {
	return licences;
}
public void setLicences(Collection<Licence> licences) {
	this.licences = licences;
}
public Image getImage() {
	return image;
}
public void setImage(Image image) {
	this.image = image;
}
public Collection<Categorie> getCategories() {
	return categories;
}
public void setCategories(Collection<Categorie> categories) {
	this.categories = categories;
}
@Override
public String toString() {
	return "League [id=" + id + ", name=" + name + "]";
}
 
}
