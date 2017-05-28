package com.alandiay.police.plainte.domaine.interfaces.objects;



/**
 * referentiel entity
 * @author alandiay
 *
 */
public abstract class ReferentielEntity implements PlainteEntity<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	
	
	private String libelle;
	
	
	public String getId() {
		return id;
	}


	public String getLibelle() {
		return libelle;
	}

	
}
