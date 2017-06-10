package com.alandiay.police.plainte.domaine.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;

@javax.persistence.Entity
@Table(name = "t_misencause")
public class MisEnCauseEntity implements PlainteEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MISENCAUSE_ID")
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
	@SequenceGenerator (name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 1) 
	private Long idMisEnCause;

	@Column(name = "MISENCAUSE_PRENOM")
	private String prenomMisenCause;

	@Column(name = "MISENCAUSE_NOM")
	private String nomMisenCause;

	public String getPrenomMisenCause() {
		return prenomMisenCause;
	}

	public String getNomMisenCause() {
		return nomMisenCause;
	}

	public Long getId() {
		return idMisEnCause;
	}

}
