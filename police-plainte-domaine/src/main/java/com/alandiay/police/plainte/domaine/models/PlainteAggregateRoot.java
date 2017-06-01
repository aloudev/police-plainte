package com.alandiay.police.plainte.domaine.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.dtos.FaitDto;
import com.alandiay.police.plainte.domaine.interfaces.models.AggregateRoot;


@Entity
@Table(name="t_plainte")
public class PlainteAggregateRoot implements AggregateRoot<String> {

	/**
	 * plaignant
	 */


	private PlaignantEntity plaignant;

	@Id
	@Column(name="PLAINTE_ID")
	private String id;

	@Column(name="PLAINTE_DATE_DECLARATION")
	private Date dateDeclaration;

	/**
	 * fait objet de la plainte
	 */
	private FaitEntity fait;

	


	public Date getDateDeclaration() {
		return dateDeclaration;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}






	

	public void ajouterPlaignant(PlaignantEntity plaiEntity){
		this.plaignant = plaiEntity;
	}

	

	public PlaignantEntity getPlaignant() {
		return plaignant;
	}





	public FaitEntity getFait() {
		return fait;
	}

	/**
	 * constructeur vide
	 */
	public PlainteAggregateRoot(){
		super();
	}

	/**
	 * permet de créer une déclaration
	 */
	public void declaree(Date dateDeclaration, PlaignantEntity plaignant, List<MisEnCauseEntity> misEnCauses, FaitDto fait){
     
		this.dateDeclaration = dateDeclaration;

		this.fait = new FaitEntity();
		
		
		
       this.ajouterPlaignant(plaignant);

	}

}
