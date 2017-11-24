package com.alandiay.police.plainte.domaine.models;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.models.PlainteEntity;

@javax.persistence.Entity
@Table(name = "T_FAIT")
public class FaitEntity implements PlainteEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "FAIT_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
	@SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 1)
	private Long idFait;

	@Column(name = "FAIT_DATE")
	private Date dateFait;

	@Column(name = "FAIT_DESCRIPTION")
	private String descriptionFait;

	@Column(name = "FAIT_ADRESSE")
	private String adresseFait;

	@Column(name = "FAIT_HEURE_DEBUT")
	private Date heureDebutFait;

	
	@Column(name = "FAIT_HEURE_FIN")
	private Date heureFinFait;

	@OneToMany(cascade = { CascadeType.PERSIST } )
	@JoinTable(name = "T_FAIT_T_INFRACTION", joinColumns = { @JoinColumn(name = "FAIT_ID") }, inverseJoinColumns = { @JoinColumn(name = "INFRACTION_ID") })
	private Set<InfractionEntity> infractions = new HashSet<InfractionEntity>();

	@OneToMany(cascade = { CascadeType.PERSIST })
	@JoinTable(name = "T_FAIT_T_MISENCAUSE", joinColumns = { @JoinColumn(name = "FAIT_ID") }, inverseJoinColumns = { @JoinColumn(name = "MISENCAUSE_ID") })
	private Set<MisEnCauseEntity> miseEnCauses = new HashSet<MisEnCauseEntity>();

	
	public FaitEntity() {
		super();
	}

	
	
	
	public FaitEntity(Date dateFait, String descriptionFait, String adresseFait) {
		super();
		this.dateFait = dateFait;
		this.descriptionFait = descriptionFait;
		this.adresseFait = adresseFait;
	}




	public FaitEntity(Long idFait, Date dateFait, String descriptionFait,
			String adresseFait, Date heureDebutFait, Date heureFinFait,
			Set<InfractionEntity> infractions,
			Set<MisEnCauseEntity> miseEnCauses) {
		super();
		this.idFait = idFait;
		this.dateFait = dateFait;
		this.descriptionFait = descriptionFait;
		this.adresseFait = adresseFait;
		this.heureDebutFait = heureDebutFait;
		this.heureFinFait = heureFinFait;
		this.infractions = infractions;
		this.miseEnCauses = miseEnCauses;
	}

	
	public Set<MisEnCauseEntity> getMiseEnCauses() {
		if (miseEnCauses == null) {
			miseEnCauses = new HashSet<MisEnCauseEntity>();
		}
		return miseEnCauses;
	}

	public String getAdresseFait() {
		return adresseFait;
	}

	/**
	 * 
	 * @param infraction
	 *            infraction
	 */
	void qualifie(InfractionEntity infraction) {
		this.infractions.add(infraction);
	}

	/**
	 * qualife un fait avec les infractions
	 * 
	 * @param infractions
	 */
	void qualifie(List<InfractionEntity> infractions) {
		this.infractions.addAll(infractions);
	}
	
	/**
	 * permet d'ajouter un mis en cause
	 * @param misEnCauseEntity mis en cause
	 */
	void ajouterMisEnCause(MisEnCauseEntity misEnCauseEntity){
		this.miseEnCauses.add(misEnCauseEntity);
	}
	
	/**
	 * permet d'ajouter une liste de mis en cause au fait
	 * @param misEnCauseEntitys liste de mis en cause
	 */
	void ajouterMisEnCause(Set<MisEnCauseEntity> misEnCauseEntitys){
		this.miseEnCauses.addAll(misEnCauseEntitys);
	}


	public Date getDateFait() {
		return dateFait;
	}

	public String getDescriptionFait() {
		return descriptionFait;
	}

	public Date getHeureDebutFait() {
		return heureDebutFait;
	}

	public Date getHeureFinFait() {
		return heureFinFait;
	}

	public Set<InfractionEntity> getInfractions() {
		if (infractions == null) {
			infractions = new HashSet<InfractionEntity>();
		}
		return infractions;
	}

	public Long getId() {		
		return this.idFait;
	}

}
