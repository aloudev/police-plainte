package com.alandiay.police.plainte.application.mapper;

import java.util.Date;

import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;
import com.alandiay.police.plainte.dtos.FaitDto;
import com.alandiay.police.plainte.dtos.PlainteDto;

public class AggregateRootMapper extends ConfigurableMapper implements
		ISmartMapper<PlainteAggregateRoot, PlainteDto> {

	private PlainteAggregateRoot plainte;

	private FaitDto faitDto;

	private PlainteDto plainteDto;

	private Date dateDeclaration;

	public ISmartMapper<PlainteAggregateRoot, PlainteDto> take(
			PlainteAggregateRoot x) {
		this.plainte = x;
		return this;
	}

	public ISmartMapper<PlainteAggregateRoot, PlainteDto> map() {
		this.dateDeclaration = plainte.getDateDeclarationPlainte();
		for (ConfigurableMapper sousMapper : getSousMappers()) {
			((ISmartMapper) sousMapper).map();
		}
		return this;
	}

	public PlainteDto give() {
		if (plainteDto == null) {
			plainteDto = new PlainteDto();
			plainteDto.setDateDeclaration(dateDeclaration);
			plainteDto.setFait(faitDto);
		}
		return plainteDto;
	}

	public PlainteAggregateRoot getPlainte() {
		return plainte;
	}

	public void setPlainte(PlainteAggregateRoot plainte) {
		this.plainte = plainte;
	}

	public void setFait(FaitDto faitDto) {
		this.faitDto = faitDto;
	}

	@Override
	public void setValueEntityFromSupperMapper() {

	}

	@Override
	public void setValueDtoToSupperMapper() {

	}

}
