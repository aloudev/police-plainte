package com.alandiay.police.plainte.domaine.models;


import com.alandiay.police.plainte.domaine.interfaces.models.PlainteObjectValue;

/**
 * adresse
 * @author alandiay
 *
 */
public class AdresseValue extends PlainteObjectValue{

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



	@Override
	public String getNomObjectValue() {
		return this.getClass().getSimpleName() ;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



}
