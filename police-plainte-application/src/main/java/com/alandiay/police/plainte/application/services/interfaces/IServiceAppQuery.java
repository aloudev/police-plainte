package com.alandiay.police.plainte.application.services.interfaces;

import java.util.List;

import com.alandiay.police.plainte.application.interfaces.query.IQueryParam;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

/**
 * interfaces des services de recherches
 * @author alandiay
 *
 */
public interface IServiceAppQuery {

	/**
	 * retourne une collections de plaintes
	 * @param paramOfQuery critères de la recherche
	 * @return collection de {@link PlainteAggregateRoot}
	 */
	   public List<PlainteAggregateRoot> query(IQueryParam paramOfQuery); 
	
}
