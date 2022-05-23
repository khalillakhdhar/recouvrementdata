package com.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Offre {
@Id
private String id;
private String titre;
private String debut;
private String fin;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public String getDebut() {
	return debut;
}
public void setDebut(String debut) {
	this.debut = debut;
}
public String getFin() {
	return fin;
}
public void setFin(String fin) {
	this.fin = fin;
}








}
