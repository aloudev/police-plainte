package com.alandiay.police.plainte.dtos;

import java.io.Serializable;
import java.util.Date;

public class FaitDto  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Date dateFait;
	
	private String descriptionFait;

	public Date getDateFait() {
		return dateFait;
	}

	public void setDateFait(Date dateFait) {
		this.dateFait = dateFait;
	}

	public String getDescriptionFait() {
		return descriptionFait;
	}

	@Override
	public String toString() {
		return "FaitDto [dateFait=" + dateFait + ", descriptionFait="
				+ descriptionFait + "]";
	}

	public void setDescriptionFait(String descriptionFait) {
		this.descriptionFait = descriptionFait;
	}
}
