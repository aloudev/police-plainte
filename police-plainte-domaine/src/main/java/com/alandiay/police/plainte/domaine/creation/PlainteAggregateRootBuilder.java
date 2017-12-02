package com.alandiay.police.plainte.domaine.creation;

import java.util.Date;

import com.alandiay.police.plainte.domaine.models.FaitEntity;
import com.alandiay.police.plainte.domaine.models.PlaignantEntity;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;

public class PlainteAggregateRootBuilder implements IBuilder<PlainteAggregateRoot>{

	/**
	 *  date de  déclaration de la plainte
	 */
	private Date dateDeclaration;
	
	
	/**
	 * celui qui depose la plainte
	 */
	private PlaignantEntity plaignant;
	
	/**
	 * fait de la plainte
	 */
	private FaitEntity fait;
	
	
	/**
	 * constructeur prive afin d'interdire l'instancier du builder
	 */
	private PlainteAggregateRootBuilder (){
		
	}

	
	public static PlainteAggregateRootBuilder newBuilder(){
		return new PlainteAggregateRootBuilder();
	}
	
	
	public PlainteAggregateRoot build() {
		return new PlainteAggregateRoot(dateDeclaration,plaignant,fait) ;
	}
	
	
	public PlainteAggregateRootBuilder withDatedeclaration(Date dateDeclaration){
		this.dateDeclaration = dateDeclaration;
		return this;
	}
	
	public PlainteAggregateRootBuilder withPlaignant(PlaignantEntity plaignant){
		this.plaignant = plaignant;
		return this;
	}
	
	public PlainteAggregateRootBuilder withFait(FaitEntity fait){
		this.fait = fait;
		return this;
	}

	
}
