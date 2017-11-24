package com.alandiay.police.plainte.domaine.dtos;

import java.io.Serializable;
import java.util.Date;

public class PlainteDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date dateDeclaration;

	public PlainteDto(FaitDto faitDto, PlaignantDto plaignantDto)   {
	}

	public Date getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}

	@Override
	public String toString() {
		return "{dateDeclaration : " + dateDeclaration + "}";
	}
	
	

}
