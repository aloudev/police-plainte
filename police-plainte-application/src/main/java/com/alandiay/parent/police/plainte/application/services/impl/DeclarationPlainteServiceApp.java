package com.alandiay.parent.police.plainte.application.services.impl;

import com.alandiay.parent.police.plainte.application.interfaces.query.IReverseMapper;
import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.parent.police.plainte.application.services.interfaces.IServiceAppProcessing;
import com.alandiay.police.plainte.domaine.interfaces.repository.IPlainteAggregateRootRepository;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

/**
 * service de déclaration de plainte
 * 
 * @author alandiay
 *
 */
public class DeclarationPlainteServiceApp implements IServiceAppProcessing {

	private IReverseMapper<PlainteObject, PlainteAggregateRoot> plaintemapper;



	private IPlainteAggregateRootRepository<PlainteAggregateRoot> plainteRepository;

	public void procede(PlainteObject plainte) {

		PlainteAggregateRoot plainteAggregateRoot = plaintemapper.map(plainte);
		plainteRepository.save(plainteAggregateRoot);

	}
	public void setPlaintemapper(
			IReverseMapper<PlainteObject, PlainteAggregateRoot> plaintemapper) {
		this.plaintemapper = plaintemapper;
	}
	public void setPlainteRepository(
			IPlainteAggregateRootRepository<PlainteAggregateRoot> plainteRepository) {
		this.plainteRepository = plainteRepository;
	}

}
