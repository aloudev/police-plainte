package com.alandiay.police.plainte.domaine.objects;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alandiay.police.plainte.domaine.interfaces.objects.PlainteEntity;


@javax.persistence.Entity
@Table(name="t_fait")
public class FaitEntity implements PlainteEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="fait_id")
	private Long id;
	
	@Column(name="fait_date")
	private Date date;
	
	@Column(name="fait_desc")
	private String description;
	
	@Column(name="fait_adresse")
	private String adresse;
	
//	private List<InfractionEntity> infractions;

	
	public String getDescription() {
		return description;
	}

	

	public String getAdresse() {
		return adresse;
	}

	

	

	public Long getId() {
		return id;
	}

//	public List<InfractionEntity> getInfractions() {
//		return infractions;
//	}
	
	/**
	 *  
	 * @param entity
	 */
     void qualifie(InfractionEntity entity){
		
	}

	public Date getDate() {
		return date;
	}

	



}
