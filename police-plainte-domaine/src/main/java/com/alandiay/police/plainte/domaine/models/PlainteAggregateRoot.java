package com.alandiay.police.plainte.domaine.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



import com.alandiay.police.plainte.domaine.dtos.FaitDto;
import com.alandiay.police.plainte.domaine.dtos.MisEnCauseDto;
import com.alandiay.police.plainte.domaine.dtos.PlaignantDto;
import com.alandiay.police.plainte.domaine.interfaces.models.AggregateRoot;

/**
 * class plainte : classe aggregateRoot du domaine
 * 
 * @author alandiay
 *
 */
@Entity
@Table(name = "t_plainte")
public class PlainteAggregateRoot implements AggregateRoot<Long> {

	public PlainteAggregateRoot(Date dateDeclarationPlainte, FaitDto faitdto,
			PlaignantDto plaignant) {
		super();
		this.dateDeclarationPlainte = dateDeclarationPlainte;
		this.fait = new FaitEntity();
		InfractionEntity infraction1 =	new InfractionEntity("1");
	 	InfractionEntity infraction2 =	new InfractionEntity("2");
	 	this.fait.qualifie(infraction1);
		this.fait.qualifie(infraction2);
		this.fait.ajouterMisEnCause(new MisEnCauseEntity());
		this.fait.ajouterMisEnCause(new MisEnCauseEntity());
		
		this.plaignant = new PlaignantEntity();

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * identifiant de la plainte
	 */
	@Id
	@Column(name = "PLAINTE_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
	@SequenceGenerator(name = "hibernate_sequence", sequenceName = "hibernate_sequence", allocationSize = 1)
	private Long idPlainte;

	/**
	 * de déclaration de la plainte
	 */
	@Column(name = "PLAINTE_DATE_DECLARATION")
	private Date dateDeclarationPlainte;

	/**
	 * fait objet de la plainte
	 */
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@JoinColumn(name = "FAIT_ID")
	private FaitEntity fait;

	/**
	 * plaignant
	 */

	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.REMOVE})
	@JoinColumn(name = "PLAIGNANT_ID")
	private PlaignantEntity plaignant;

	public void ajouterPlaignant(PlaignantEntity plaiEntity) {
		this.plaignant = plaiEntity;
	}

	/**
	 * constructeur vide
	 */
	public PlainteAggregateRoot() {
		super();
	}

	/**
	 * permet de créer une déclaration
	 */
	public void declaree(Date dateDeclaration, PlaignantDto plaignant,
			List<MisEnCauseDto> misEnCauses, FaitDto fait) {
		this.dateDeclarationPlainte = dateDeclaration;

	}

	public PlaignantEntity getPlaignant() {
		return plaignant;
	}

	public FaitEntity getFait() {
		return fait;
	}

	public Long getId() {
		return idPlainte;
	}

	public Date getDateDeclarationPlainte() {
		return dateDeclarationPlainte;
	}
}
