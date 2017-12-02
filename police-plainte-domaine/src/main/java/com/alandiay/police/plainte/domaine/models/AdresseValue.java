package com.alandiay.police.plainte.domaine.models;

import com.alandiay.police.plainte.domaine.interfaces.models.PlainteObjectValue;



/**
 * adresse
 * @author alandiay
 *
 */
public class AdresseValue implements PlainteObjectValue{

	/**
	 * arrondissement
	 */
	private final String arrondissement;
	/**
	 * numéro de la rue
	 */
	private final int numeroRue;

	/**
	 * nom de la rue
	 */
	private final String nomRue;

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






	public AdresseValue(String arrondissement, int numeroRue, String nomRue,
			String region) {
		super();
		this.arrondissement = arrondissement;
		this.numeroRue = numeroRue;
		this.nomRue = nomRue;
		this.region = region;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



}
