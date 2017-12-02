package com.alandiay.police.plainte.domaine.interfaces.models;

import javax.persistence.Cacheable;




/**
 * referentiel entity
 * @author alandiay
 *
 */
@Cacheable
public abstract class AbstractReferentielEntity implements PlainteEntity<String>, PlainteObjectValue {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final  String id ;
	
	
	private final String libelle;
	
	
	public String getId() {
		return id;
	}


	public String getLibelle() {
		return libelle;
	}


	public AbstractReferentielEntity(String id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}

	
}
