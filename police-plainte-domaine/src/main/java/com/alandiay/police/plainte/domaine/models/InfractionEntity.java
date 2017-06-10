package com.alandiay.police.plainte.domaine.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.models.AbstractReferentielEntity;

@Entity
@Table(name="t_infraction")
public class InfractionEntity extends AbstractReferentielEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INFRACTION_CODE")
	private String id;


	public InfractionEntity(String id) {
		super();
		this.id = id;
	}



	public String getId() {
		return super.getId();
	}



	@Column(name="T_INFRACTION_LIBELLE")
	public String getLibelle() {
		return super.getLibelle();
	}

}
