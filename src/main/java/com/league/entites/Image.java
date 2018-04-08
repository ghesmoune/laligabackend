package com.league.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Image {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private long id;
   private String name;
   private String imageUri;
 public Image(long id,String name,String imageUri) {
	this.id=id;
	this.name=name;
	this.imageUri=imageUri;
 }  
   
public Image() {
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
public String getImageUri() {
	return imageUri;
}
public void setImageUri(String imageUri) {
	this.imageUri = imageUri;
}
   
}