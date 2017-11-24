package com.alandiay.police.plainte.domaine.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.models.AbstractReferentielEntity;

/**
 * le referentiel est un objet immuable
 * @author alandiay
 *
 */
@Entity
@Table(name="t_infraction")
public final class InfractionEntity extends AbstractReferentielEntity {




	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INFRACTION_CODE")
	public String getId() {
		return super.getId();
	}

	@Column(name="T_INFRACTION_LIBELLE")
	public String getLibelle() {
		return super.getLibelle();
	}


	public InfractionEntity(String id, String libelle) {
		super(id, libelle);
	}


}
