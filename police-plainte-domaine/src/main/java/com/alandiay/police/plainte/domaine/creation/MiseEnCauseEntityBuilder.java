package com.alandiay.police.plainte.domaine.creation;

import com.alandiay.police.plainte.domaine.models.MisEnCauseEntity;

/**
 * permet de créer un MisEnCause
 * 
 * @author alandiay
 *
 */
public class MiseEnCauseEntityBuilder implements IBuilder<MisEnCauseEntity> {

	/**
	 * nom du mis en cause
	 */
	private String nom;

	/**
	 * prenom du mis en cause
	 */
	private String prenom;

	private boolean sexe;

	private MiseEnCauseEntityBuilder() {

	}

	/**
	 * 
	 * @param nom
	 *            nom du mis en cause
	 * @return
	 */
	public MiseEnCauseEntityBuilder withNom(String nom) {
		this.nom = nom;
		return this;
	}

	/**
	 * 
	 * @param prenom
	 *            prenom du mis en cause
	 * @return
	 */
	public MiseEnCauseEntityBuilder withPreNom(String prenom) {
		this.prenom = prenom;
		return this;
	}

	public MisEnCauseEntity build() {

		return new MisEnCauseEntity(nom, prenom, sexe);
	}

	public static MiseEnCauseEntityBuilder newBuilder() {
		return new MiseEnCauseEntityBuilder();
	}

}
