package com.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Facture {
	@Id
private String id;
private String dateemission;
private double montant;
private String delai;
private String code;
private String etat;

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDateemission() {
	return dateemission;
}
public void setDateemission(String dateemission) {
	this.dateemission = dateemission;
}
public double getMontant() {
	return montant;
}
public void setMontant(double montant) {
	this.montant = montant;
}
public String getDelai() {
	return delai;
}
public void setDelai(String delai) {
	this.delai = delai;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getEtat() {
	return etat;
}
public void setEtat(String etat) {
	this.etat = etat;
}







}
