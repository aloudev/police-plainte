package com.alandiay.polite.plainte.common.exception;

public abstract class AbstractPlainteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private String code;
	
	private String libelle;

	/**
	 * 
	 * @param code code
	 * @param libelle libelle
	 */
	public AbstractPlainteException(String code, String libelle){
		this.code  = code;
		this.libelle = libelle;
	}
	
	/**
	 * constructeur vide
	 */
	public AbstractPlainteException(){
		super();
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	
}
