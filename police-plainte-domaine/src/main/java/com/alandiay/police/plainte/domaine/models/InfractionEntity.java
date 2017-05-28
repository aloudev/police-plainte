package com.alandiay.police.plainte.domaine.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.objects.ReferentielEntity;

@Entity
@Table(name="t_infraction")
public class InfractionEntity extends ReferentielEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INFRACTION_CODE")
	private String id;
	

	public String getId() {
		return super.getId();
	}


	
	@Column(name="T_INFRACTION_LIBELLE")
	public String getLibelle() {
		return super.getLibelle();
	}

}
