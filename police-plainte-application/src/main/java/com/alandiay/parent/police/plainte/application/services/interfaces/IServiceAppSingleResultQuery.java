package com.alandiay.parent.police.plainte.application.services.interfaces;

import com.alandiay.parent.police.plainte.application.interfaces.query.IQueryParam;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

/**
 * interface des services de consultation
 * @author alandiay
 *
 */
public interface IServiceAppSingleResultQuery {

	/**
	 * les critères doivent etre discriminant tels que un seul résultat soit
	 * retourné
	 * 
	 * @param queryParam
	 *            critères discriminants
	 * @return un seul résultat
	 */
	public PlainteAggregateRoot getResult(IQueryParam queryParam);

}
