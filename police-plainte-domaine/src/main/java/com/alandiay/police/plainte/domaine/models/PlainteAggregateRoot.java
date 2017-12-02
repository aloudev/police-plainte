package com.alandiay.police.plainte.domaine.models;

import java.util.Date;

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

	public PlainteAggregateRoot(Date dateDeclarationPlainte, FaitEntity fait,
			PlaignantEntity plaignant) {
		super();
		this.dateDeclarationPlainte = dateDeclarationPlainte;
		this.fait = fait;

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "PlainteAggregateRoot [idPlainte=" + idPlainte
				+ ", dateDeclarationPlainte=" + dateDeclarationPlainte
				+ ", fait=" + fait + ", plaignant=" + plaignant + "]";
	}

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
	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "FAIT_ID")
	private FaitEntity fait;

	/**
	 * plaignant
	 */

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "PLAIGNANT_ID")
	private PlaignantEntity plaignant;

	/**
	 * constructeur vide
	 */
	public PlainteAggregateRoot() {
		super();
	}

	public PlainteAggregateRoot(Date dateDeclaration, FaitEntity faitEntity,
			PlaignantEntity plaignantEntity, MisEnCauseEntity misEnCauseEntity) {
	}

	/**
	 * 
	 * @param dateDeclaration
	 *            date de la déclaration
	 * @param plaignant
	 *            plaignant
	 * @param fait
	 *            fait de la plainte
	 */
	public PlainteAggregateRoot(Date dateDeclaration,
			PlaignantEntity plaignant, FaitEntity fait) {
		this.dateDeclarationPlainte = dateDeclaration;
		this.plaignant = plaignant;
		this.fait = fait;
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
