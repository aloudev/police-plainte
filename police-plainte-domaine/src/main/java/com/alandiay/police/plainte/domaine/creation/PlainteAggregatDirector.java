package com.alandiay.police.plainte.domaine.creation;

import java.util.Date;

import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

/**
 * factory d'une plainte 
 * @author alandiay
 *
 */
public class PlainteAggregatDirector {

	/**
	 * 
	 */
	 Date dateDeclaration;
	
	 FaitEntityBuilder faitBuilder;
	
     PlaignantEntityBuilder plaignantBuilder;
     
     MiseEnCauseEntityBuilder miseEnCauseEntityBuilder;
     
     
	

     
     public PlainteAggregateRoot get(){
    	 return new PlainteAggregateRoot(dateDeclaration, faitBuilder.build(), plaignantBuilder.build(),miseEnCauseEntityBuilder.build());
     }



	public Date getDateDeclaration() {
		return dateDeclaration;
	}



	public void setDateDeclaration(Date dateDeclaration) {
		this.dateDeclaration = dateDeclaration;
	}



	public FaitEntityBuilder getFaitBuilder() {
		return faitBuilder;
	}



	public void setFaitBuilder(FaitEntityBuilder faitBuilder) {
		this.faitBuilder = faitBuilder;
	}



	public PlaignantEntityBuilder getPlaignantBuilder() {
		return plaignantBuilder;
	}



	public void setPlaignantBuilder(PlaignantEntityBuilder plaignantBuilder) {
		this.plaignantBuilder = plaignantBuilder;
	}



	public MiseEnCauseEntityBuilder getMiseEnCauseEntityBuilder() {
		return miseEnCauseEntityBuilder;
	}



	public void setMiseEnCauseEntityBuilder(
			MiseEnCauseEntityBuilder miseEnCauseEntityBuilder) {
		this.miseEnCauseEntityBuilder = miseEnCauseEntityBuilder;
	}


     


	
}
