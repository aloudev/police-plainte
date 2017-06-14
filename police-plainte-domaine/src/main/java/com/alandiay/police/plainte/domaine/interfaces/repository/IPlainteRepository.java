package com.alandiay.police.plainte.domaine.interfaces.repository;

import java.util.List;

import com.alandiay.police.plainte.domaine.interfaces.models.AbstractReferentielEntity;

public interface IPlainteRepository< T extends AbstractReferentielEntity, C > {
	
	/**
	 * 
	 */
	public List<T> findAll();
	
	/**
	 * 
	 * @param c identifiant
	 * @return 
	 */
	public T find(C c);
	
}
