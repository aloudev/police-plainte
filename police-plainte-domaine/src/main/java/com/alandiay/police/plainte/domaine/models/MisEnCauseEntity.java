package com.alandiay.police.plainte.domaine.models;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;

@javax.persistence.Entity
@Table(name="t_misencause")
public class MisEnCauseEntity  implements PlainteEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MISENCAUSE_ID")
	private Long id;

	@Column(name="MISENCAUSE_PRENOM")
	private String prenom;

	@Column(name="MISENCAUSE_NOM")
	private String nom;




	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}



	public Long getId() {
		return id;
	}
	
	


}
