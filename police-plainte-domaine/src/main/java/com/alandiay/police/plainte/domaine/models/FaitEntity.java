package com.alandiay.police.plainte.domaine.models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;


@javax.persistence.Entity
@Table(name="t_fait")
public class FaitEntity implements PlainteEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="FAIT_ID")
	@GeneratedValue
	private Long id;

	@Column(name="fait_date")
	private Date date;

	@Column(name="fait_desc")
	private String description;

	@Column(name="fait_adresse")
	private String adresse;

	@Column(name="T_FAIT_HEURE_DEBUT")	
	private Date heureDebut;

	@Column(name="T_FAIT_HEURE_FIN")
	private Date heureFin;


	@OneToMany
	@JoinTable(name="t_fait_infraction",
	joinColumns={@JoinColumn(name="fait_id")},
	inverseJoinColumns={@JoinColumn(name="infraction_id")})
	private List<InfractionEntity> infractions;


	@OneToMany
	@JoinTable(name="t_fait_t_misencause",
	joinColumns={@JoinColumn(name="plainte_id")},
	inverseJoinColumns={@JoinColumn(name="misencause_id")})
	private List<MisEnCauseEntity> miseEnCauses;


	public List<MisEnCauseEntity> getMiseEnCauses() {
		if(miseEnCauses==null){
			miseEnCauses = new ArrayList<MisEnCauseEntity>();	
		}
		return miseEnCauses;
	}



	public void setMiseEnCauses(List<MisEnCauseEntity> miseEnCauses) {
		this.miseEnCauses = miseEnCauses;
	}



	public String getDescription() {
		return description;
	}



	public String getAdresse() {
		return adresse;
	}





	public Long getId() {
		return id;
	}



	/**
	 *  
	 * @param entity
	 */
	void qualifie(InfractionEntity entity){

	}

	public Date getDate() {
		return date;
	}



	public List<InfractionEntity> getInfractions() {
		if(infractions==null){
			infractions = new ArrayList<InfractionEntity>();
		}
		return infractions;
	}









}
