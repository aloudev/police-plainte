package com.alandiay.police.plainte.domaine.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;

@Entity(name = "t_plaignant")
public class PlaignantEntity implements PlainteEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PLAIGNANT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
	@SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 1)
	private Long idPlaignant;

	public Long getId() {
		return idPlaignant;
	}

	/**
	 * nom du plaignant
	 */
	@Column(name = "PLAIGNANT_NOM")
	private String nomPlaignant;

	/**
	 * prénom du plaignant
	 */
	@Column(name = "PLAIGNANT_PRENOM")
	private String prenomPlaignant;

	/**
	 * sexe du plaignant
	 */

	@Column(name = "PLAIGNANT_SEXE")
	private Boolean sexePLaignant;

	public String getNomPlaignant() {
		return nomPlaignant;
	}

	public String getPrenomPlaignant() {
		return prenomPlaignant;
	}

	public Boolean getSexePLaignant() {
		return sexePLaignant;
	}

	/**
	 * contructeur vide
	 */

	public PlaignantEntity() {
		super();
	}

	public PlaignantEntity(String nomPlaignant, String prenomPlaignant,
			Boolean sexePLaignant) {
		super();
		this.nomPlaignant = nomPlaignant;
		this.prenomPlaignant = prenomPlaignant;
		this.sexePLaignant = sexePLaignant;
	}

}
