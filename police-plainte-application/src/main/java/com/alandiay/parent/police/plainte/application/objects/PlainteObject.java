package com.alandiay.parent.police.plainte.application.objects;

import java.util.Date;

public class PlainteObject {

	private Date dateDeclaration;

	private FaitObject fait;

	private PlaignantObject plaignant;

	public FaitObject getFait() {
		return fait;
	}

	public void setFait(FaitObject fait) {
		this.fait = fait;
	}

	public PlaignantObject getPlaignant() {
		return plaignant;
	}

	public void setPlaignant(PlaignantObject plaignant) {
		this.plaignant = plaignant;
	}

	public Date getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

}
