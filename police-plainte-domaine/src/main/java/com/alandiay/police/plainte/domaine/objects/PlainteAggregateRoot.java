package com.alandiay.police.plainte.domaine.objects;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.objects.AggregateRoot;


@Entity
@Table(name="t_plainte")
public class PlainteAggregateRoot implements AggregateRoot<String> {

	/**
	 * plaignant
	 */
	
	//private PlaignantEntity plaignant;

	@Id
	@Column(name="PLAINTE_ID")
	private String id;
	
	/**
	 * fait objet de la plainte
	 */
//private FaitEntity fait;
	
//	private List<MisEnCauseEntity> miseEnCauses;
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getId() {
		return id;
	}

//
//	/**
//	 * une plainte est par un plaignant
//	 *  
//	 * @param plaignant plaignant de la plainte
//	 */
//	public void estDeposeePar(PlaignantEntity plaignant) {
//		this.plaignant = plaignant;
//	}
//	
//	/**
//	 * 
//	 * @param fait
//	 */
//	public void concerne(FaitEntity fait){
//		this.fait = fait;
//	}
//	
//	/**
//	 * met en cause
//	 * @param miseEnCause mise en cause
//	 */
//	public void ajouterMiseEnCause(MisEnCauseEntity miseEnCause){
//		this.getMiseEnCauses().add(miseEnCause);
//	}
//
//
//	public List<MisEnCauseEntity> getMiseEnCauses() {
//		if(miseEnCauses==null){
//			return new ArrayList<MisEnCauseEntity>();
//		}
//		return miseEnCauses;
//	}
//
//
//	public PlaignantEntity getPlaignant() {
//		return plaignant;
//	}
//
//
//	
//
//
//	public FaitEntity getFait() {
//		return fait;
//	}
//
//
//	/**
//	 * 
//	 * @param plaignant plaignant
//	 * @param miseEnCause mise en cause
//	 * @param fait fait
//	 */
//	public PlainteAggregateRoot (PlaignantEntity plaignant,MisEnCauseEntity miseEnCause, FaitEntity fait){
//		this.plaignant = plaignant;
//		this.getMiseEnCauses().add(miseEnCause);
//		this.fait = fait;
//	}
//	
//	/**
//	 * 
//	 * @param plaignant plaignat
//	 * @param miseEnCauses mis en cause
//	 * @param fait fait
//	 */
//	
//	public PlainteAggregateRoot (PlaignantEntity plaignant,List<MisEnCauseEntity> miseEnCauses, FaitEntity fait){
//		this.plaignant = plaignant;
//		this.getMiseEnCauses().addAll(miseEnCauses);
//		this.fait = fait;
//	}
//
//
	



}
