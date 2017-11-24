package com.alandiay.police.plainte.domaine.models;



/**
 * adresse
 * @author alandiay
 *
 */
public class AdresseValue{

	/**
	 * arrondissement
	 */
	private String arrondissement;
	/**
	 * numéro de la rue
	 */
	private int numeroRue;

	/**
	 * nom de la rue
	 */
	private String nomRue;

	/**
	 * région
	 */
	private String region;

	public String getArrondissement() {
		return arrondissement;
	}



	public int getNumeroRue() {
		return numeroRue;
	}


	public String getNomRue() {
		return nomRue;
	}






	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



}
