package com.alandiay.police.plainte.infrastructure.services.factory;

import org.springframework.beans.factory.annotation.Autowired;

import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.police.plainte.application.services.impl.DeclarationPlainteServiceApp;
import com.alandiay.police.plainte.application.services.interfaces.IReverseMapper;
import com.alandiay.police.plainte.domaine.interfaces.repository.IPlainteAggregateRootRepository;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

/**
 * factory de service de déclaration
 * @author alandiay
 *
 */
public class DeclarationServiceFactory {

	@Autowired
	private IReverseMapper<PlainteObject, PlainteAggregateRoot> reverseMapper;

	@Autowired
	private IPlainteAggregateRootRepository<PlainteAggregateRoot> plainteRepository;

	/**
	 * permet de créer un service de déclaration de plaintes
	 * 
	 * @return DeclarationPlainteServiceApp
	 */
	public DeclarationPlainteServiceApp getService() {
		DeclarationPlainteServiceApp serviceDeclaration = new DeclarationPlainteServiceApp();
		serviceDeclaration.setPlaintemapper(reverseMapper);
		serviceDeclaration.setPlainteRepository(plainteRepository);
		return serviceDeclaration;
	}

}
