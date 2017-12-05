package com.alandiay.police.plainte.application.mapper.smart;

import java.util.Date;

import com.alandiay.parent.police.plainte.application.objects.FaitObject;
import com.alandiay.parent.police.plainte.application.objects.PlainteObject;
import com.alandiay.police.plainte.application.services.impl.ISmartMapper;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

public class AggregateRootMapper extends ConfigurableMapper implements
		ISmartMapper<PlainteAggregateRoot, PlainteObject> {

	private PlainteAggregateRoot plainte;

	private FaitObject faitObject;

	private PlainteObject plainteObject;

	private Date dateDeclaration;

	public ISmartMapper<PlainteAggregateRoot, PlainteObject> take(
			PlainteAggregateRoot x) {
		this.plainte = x;
		return this;
	}

	public ISmartMapper<PlainteAggregateRoot, PlainteObject> map() {
		this.dateDeclaration = plainte.getDateDeclarationPlainte();
		for (ConfigurableMapper sousMapper : getSousMappers()) {
			((ISmartMapper) sousMapper).map();
		}
		return this;
	}

	public PlainteObject give() {
		if (plainteObject == null) {
			plainteObject = new PlainteObject();
			plainteObject.setDateDeclaration(dateDeclaration);
			plainteObject.setFait(faitObject);
		}
		return plainteObject;
	}

	public PlainteAggregateRoot getPlainte() {
		return plainte;
	}

	public void setPlainte(PlainteAggregateRoot plainte) {
		this.plainte = plainte;
	}

	public void setFait(FaitObject faitObject) {
		this.faitObject = faitObject;
	}

	@Override
	public void setValueEntityFromSupperMapper() {

	}

	@Override
	public void setValueDtoToSupperMapper() {

	}

}
