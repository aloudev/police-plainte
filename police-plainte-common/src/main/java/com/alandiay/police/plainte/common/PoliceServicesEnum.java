package com.alandiay.police.plainte.common;


public enum PoliceServicesEnum {

	/**
	 * service d'enregistrement de déclaration de plainte
	 */
	PLAINTEENREGISTREMENT("PP1","service d'enregistrement des plaintes");

	private PoliceServicesEnum(String code, String libelle) {
		this.code = code;
		this.libelle = libelle;
	}

	private String code;
	
	public String getCode() {
		return code;
	}

	public String getLibelle() {
		return libelle;
	}

	private String libelle;
	
}
