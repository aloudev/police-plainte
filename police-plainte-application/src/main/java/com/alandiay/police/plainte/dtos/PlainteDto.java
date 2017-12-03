package com.alandiay.police.plainte.dtos;

import java.io.Serializable;
import java.util.Date;

public class PlainteDto implements Serializable {

	public PlainteDto() {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date dateDeclaration;

	private FaitDto fait;

	public PlainteDto(FaitDto faitDto, Date dateDeclaration) {

		this.dateDeclaration = dateDeclaration;
		this.fait = faitDto;

	}

	public Date getDateDeclaration() {
		return dateDeclaration;
	}

	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}



	@Override
	public String toString() {
		return "PlainteDto [dateDeclaration=" + dateDeclaration + ", fait="
				+ fait + "]";
	}

	public FaitDto getFait() {
		return fait;
	}

	public void setFait(FaitDto fait) {
		this.fait = fait;
	}
}
