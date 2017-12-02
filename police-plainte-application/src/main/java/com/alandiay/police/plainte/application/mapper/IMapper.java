package com.alandiay.police.plainte.application.mapper;

import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;

/**
 * interface des mapper
 * @author alandiay
 *
 * @param <X>
 * @param <Y>
 */
public interface IMapper<X extends PlainteEntity,Y> {
	
	
	Y map(X x);
	

}
