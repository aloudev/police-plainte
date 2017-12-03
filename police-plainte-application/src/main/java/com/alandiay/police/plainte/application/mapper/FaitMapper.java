package com.alandiay.police.plainte.application.mapper;

import com.alandiay.police.plainte.domaine.models.FaitEntity;
import com.alandiay.police.plainte.dtos.FaitDto;

public abstract class FaitMapper extends ConfigurableMapper implements
		ISmartMapper<FaitEntity, FaitDto> {

	public void setFait(FaitEntity fait) {
		this.fait = fait;
	}

	private FaitDto faitDto = new FaitDto();

	private FaitEntity fait;

	public ISmartMapper<FaitEntity, FaitDto> take(FaitEntity source) {
		this.fait = source;
		return this;
	}

	public ISmartMapper<FaitEntity, FaitDto> map() {

		setValueEntityFromSupperMapper();
		faitDto.setDescriptionFait(fait.getDescriptionFait());
		faitDto.setDateFait(fait.getDateFait());

		for (ConfigurableMapper sousMapper : getSousMappers()) {
			((ISmartMapper) sousMapper).map();
		}
		setValueDtoToSupperMapper();
		return this;
	}

	public FaitDto give() {
		return faitDto;
	}

}
