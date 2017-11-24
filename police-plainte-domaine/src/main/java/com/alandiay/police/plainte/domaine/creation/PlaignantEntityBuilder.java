package com.alandiay.police.plainte.domaine.creation;

import com.alandiay.police.plainte.domaine.models.PlaignantEntity;

/**
 * permet de créer un plaignant
 * 
 * @author alandiay
 *
 */
public class PlaignantEntityBuilder implements IBuilder<PlaignantEntity> {

	private String nom;
	private String prenom;
	private Boolean sexe;

	public PlaignantEntityBuilder withNom(String nom) {
		this.nom = nom;
		return this;
	}

	public PlaignantEntityBuilder withPreNom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	/**
	 * 
	 * @param sexe
	 * @return
	 */
	public PlaignantEntityBuilder withSexe(Boolean sexe) {
		this.sexe = sexe;
		return this;
	}

	public PlaignantEntity build() {
		return new PlaignantEntity(nom, prenom, sexe);
	}
	
	
	public PlaignantEntityBuilder newBuilder(){
		return new PlaignantEntityBuilder();
	}

	private PlaignantEntityBuilder() {
		super();
	}
}
