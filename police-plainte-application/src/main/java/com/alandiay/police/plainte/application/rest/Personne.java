package com.alandiay.police.plainte.application.rest;

 class Personne{
    	public Personne() {
		super();
	}
		private String nom;
		private String prenom;
    	Personne (String nom, String prenom){
    		this.setNom(nom);
    		this.setPrenom(prenom);
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
    }