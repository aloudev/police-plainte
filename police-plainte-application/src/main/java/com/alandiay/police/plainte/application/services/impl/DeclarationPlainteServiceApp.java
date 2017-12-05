package com.alandiay.police.plainte.application.services.impl;

import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.police.plainte.application.services.interfaces.IReverseMapper;
import com.alandiay.police.plainte.application.services.interfaces.IServiceAppProcessing;
import com.alandiay.police.plainte.domaine.interfaces.repository.IPlainteAggregateRootRepository;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

/**
 * service de déclaration de plainte
 * 
 * @author alandiay
 *
 */
public class DeclarationPlainteServiceApp implements IServiceAppProcessing {

	private IReverseMapper<PlainteObject, PlainteAggregateRoot> plainteReverseMapper;

	private IPlainteAggregateRootRepository<PlainteAggregateRoot> plainteRepository;

	public void procede(PlainteObject plainte) {

		PlainteAggregateRoot plainteAggregateRoot = plainteReverseMapper.map(plainte);
		plainteRepository.save(plainteAggregateRoot);

	}

	public void setPlaintemapper(
			IReverseMapper<PlainteObject, PlainteAggregateRoot> plaintemapper) {
		this.plainteReverseMapper = plaintemapper;
	}

	public void setPlainteRepository(
			IPlainteAggregateRootRepository<PlainteAggregateRoot> plainteRepository) {
		this.plainteRepository = plainteRepository;
	}

}
