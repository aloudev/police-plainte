package com.alandiay.police.plainte.domaine.interfaces.models;

import java.io.Serializable;

public interface PlainteEntity<Id extends Serializable> extends Serializable {
	
	/**
	 * identifiant de l'entité
	 * @return
	 */
	public Id getId();

}
