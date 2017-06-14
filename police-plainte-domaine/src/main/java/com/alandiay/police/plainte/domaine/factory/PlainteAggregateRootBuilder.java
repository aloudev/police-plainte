package com.alandiay.police.plainte.domaine.factory;

import java.util.Date;

import com.alandiay.police.plainte.domaine.dtos.FaitDto;
import com.alandiay.police.plainte.domaine.dtos.PlaignantDto;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

/**
 * builder d'une plainte entity
 * @author alandiay
 *
 */
public class PlainteAggregateRootBuilder {

	/**
	 * 
	 */
	 Date dateDeclaration;
	
	 FaitDto fait;
	
     PlaignantDto plaignant;
	
	

	
	public Date getDateDeclaration() {
		return dateDeclaration;
	}


	/**
	 * 
	 * @return
	 */
	public static PlainteAggregateRootBuilder  newBuilder(){
		return new PlainteAggregateRootBuilder(); 
	}
	
	/**
	 * 
	 * @param dateDeclaration
	 * @return
	 */
	public PlainteAggregateRootBuilder withDateDeclaration(Date dateDeclaration){
		this.dateDeclaration = dateDeclaration;
		return this;
	}
	
	
	/**
	 * 
	 * @param fait
	 * @return
	 */
	public PlainteAggregateRootBuilder withFait(FaitDto fait){
		this.fait = fait;
		return this;
	}
	
	/**
	 * 
	 * @param plaignant
	 * @return
	 */
	public PlainteAggregateRootBuilder withPlaignant(PlaignantDto plaignant ){
		this.plaignant = plaignant;
		return this;
	}
	
	/**
	 * 
	 * @return
	 */
	public PlainteAggregateRoot build(){
		return new PlainteAggregateRoot();
	}
	
}
