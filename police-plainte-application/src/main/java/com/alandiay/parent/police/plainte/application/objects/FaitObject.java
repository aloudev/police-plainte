package com.alandiay.parent.police.plainte.application.objects;

import java.util.Date;
import java.util.List;

/**
 * objet fait de la couche application
 * 
 * @author alandiay
 *
 */
public class FaitObject {

	private String description;

	private Date dateFait;

	private Date heureDebutFait;

	private Date heureFinFait;

	private List<MisEnCauseObject> misEnCauses;

	private List<InfractionObject> infractions;

	public List<MisEnCauseObject> getMisEnCauses() {
		return misEnCauses;
	}

	public void setMisEnCauses(List<MisEnCauseObject> misEnCauses) {
		this.misEnCauses = misEnCauses;
	}

	public Date getHeureDebutFait() {
		return heureDebutFait;
	}

	public void setHeureDebutFait(Date heureDebutFait) {
		this.heureDebutFait = heureDebutFait;
	}

	public Date getHeureFinFait() {
		return heureFinFait;
	}

	public void setHeureFinFait(Date heureFinFait) {
		this.heureFinFait = heureFinFait;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateFait() {
		return dateFait;
	}

	public void setDateFait(Date dateFait) {
		this.dateFait = dateFait;
	}

	public List<InfractionObject> getInfractions() {
		return infractions;
	}

	public void setInfractions(List<InfractionObject> infractions) {
		this.infractions = infractions;
	}

}
