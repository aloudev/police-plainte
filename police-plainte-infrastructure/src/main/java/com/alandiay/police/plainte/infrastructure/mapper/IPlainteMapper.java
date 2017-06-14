package com.alandiay.police.plainte.infrastructure.mapper;

import java.io.Serializable;

/**
 * interface des mapper
 * @author alandiay
 *
 * @param <Source> objet source
 * 
 * @param <Target> objet destinatioo
 */
public interface IPlainteMapper<Source extends Serializable,Target extends Serializable> {

	/**
	 * map un objet source ver une cible
	 * @param source source
	 * @return target
	 */
	public  Target map(Source source);
	
	
}
