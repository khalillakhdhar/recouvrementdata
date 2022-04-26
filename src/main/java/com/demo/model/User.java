package com.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.lang.NonNull;

@Document
public class User {
@Id
private String id;
@NotEmpty
private String nom;
@NotEmpty
private String prenom;
@NonNull
private int age;
@NotBlank
private String tel1;
@Null
private String tel2;
@NotBlank
private String adresse;
@Email
@NotBlank
private  String email;
@NotBlank
private String mdp;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getTel1() {
	return tel1;
}
public void setTel1(String tel1) {
	this.tel1 = tel1;
}
public String getTel2() {
	return tel2;
}
public void setTel2(String tel2) {
	this.tel2 = tel2;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMdp() {
	return mdp;
}
public void setMdp(String mdp) {
	this.mdp = mdp;
}
public User(@NotEmpty String nom, @NotEmpty String prenom, int age, @NotBlank String tel1, @Null String tel2,
		@NotBlank String adresse, @Email @NotBlank String email, @NotBlank String mdp) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.age = age;
	this.tel1 = tel1;
	this.tel2 = tel2;
	this.adresse = adresse;
	this.email = email;
	this.mdp = mdp;
}
public User() {

}














}
