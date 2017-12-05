package com.alandiay.police.plainte.domaine.creation;

import com.alandiay.police.plainte.domaine.models.MisEnCauseEntity;

/**
 * permet de créer un MisEnCause
 * 
 * @author alandiay
 *
 */
public class MisEnCauseEntityBuilder implements IBuilder<MisEnCauseEntity> {

	/**
	 * nom du mis en cause
	 */
	private String nom;

	/**
	 * prenom du mis en cause
	 */
	private String prenom;

	private boolean sexe;

	private MisEnCauseEntityBuilder() {

	}

	/**
	 * 
	 * @param nom
	 *            nom du mis en cause
	 * @return
	 */
	public MisEnCauseEntityBuilder withNom(String nom) {
		this.nom = nom;
		return this;
	}

	/**
	 * 
	 * @param prenom
	 *            prenom du mis en cause
	 * @return
	 */
	public MisEnCauseEntityBuilder withPreNom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	public MisEnCauseEntity build() {

		return new MisEnCauseEntity(nom, prenom, sexe);
	}

	public static MisEnCauseEntityBuilder newBuilder() {
		return new MisEnCauseEntityBuilder();
	}

}
