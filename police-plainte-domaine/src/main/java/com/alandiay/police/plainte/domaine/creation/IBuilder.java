package com.alandiay.police.plainte.domaine.creation;


import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;

/**
 * interface des monteurs d'entités
 * @author alandiay
 *
 * @param <Entite>
 */
@SuppressWarnings("rawtypes")
public interface IBuilder<Entite extends PlainteEntity> {

	/**
	 * permet de monter une entité
	 * @return retourne une entité
	 */
	public Entite build();
	
	
	
}
