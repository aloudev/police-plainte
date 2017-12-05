package com.alandiay.police.plainte.application.mapper.smart;

import com.alandiay.parent.police.plainte.application.objects.FaitObject;
import com.alandiay.police.plainte.application.services.impl.ISmartMapper;
import com.alandiay.police.plainte.domaine.models.FaitEntity;

public abstract class FaitMapper extends ConfigurableMapper implements
		ISmartMapper<FaitEntity, FaitObject> {

	public void setFait(FaitEntity fait) {
		this.fait = fait;
	}

	private FaitObject faitObject = new FaitObject();

	private FaitEntity fait;

	public ISmartMapper<FaitEntity, FaitObject> take(FaitEntity source) {
		this.fait = source;
		return this;
	}

	public ISmartMapper<FaitEntity, FaitObject> map() {

		setValueEntityFromSupperMapper();
		faitObject.setDescription(fait.getDescriptionFait());
		faitObject.setDateFait(fait.getDateFait());

		for (ConfigurableMapper sousMapper : getSousMappers()) {
			((ISmartMapper) sousMapper).map();
		}
		setValueDtoToSupperMapper();
		return this;
	}

	public FaitObject give() {
		return faitObject;
	}

}
