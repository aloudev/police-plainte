package com.alandiay.parent.police.plainte.application.objects;

public class PlaignantObject {

	private String nom;

	private String prenom;

	private boolean sexe;

	private AdresseObject adresse;

	public AdresseObject getAdresse() {
		return adresse;
	}

	public void setAdresse(AdresseObject adresse) {
		this.adresse = adresse;
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

	public boolean isSexe() {
		return sexe;
	}

	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

}
