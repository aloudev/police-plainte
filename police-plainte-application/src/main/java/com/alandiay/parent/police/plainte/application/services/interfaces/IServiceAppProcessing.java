package com.alandiay.parent.police.plainte.application.services.interfaces;

import com.alandiay.parent.police.plainte.application.objects.PlainteObject;


/**
 * interface des services de traitement 
 * @author alandiay
 *
 */
public interface IServiceAppProcessing {

	/**
	 * permet de traiter
	 * @param plainte plainte à traiter
	 */
	public void procede(PlainteObject plainte);
	
}
