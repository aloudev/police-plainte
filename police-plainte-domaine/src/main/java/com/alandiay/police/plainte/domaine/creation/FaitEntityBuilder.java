package com.alandiay.police.plainte.domaine.creation;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alandiay.police.plainte.domaine.models.FaitEntity;
import com.alandiay.police.plainte.domaine.models.InfractionEntity;

/**
 * permet de créer un fait
 * 
 * @author alandiay
 *
 */
public class FaitEntityBuilder implements IBuilder<FaitEntity> {

	private String description;

	private Date date;

	private String adresse;

	private FaitEntity fait;

	private List<InfractionEntity> infractions;


	/**
	 * constructeur privé
	 */
	private FaitEntityBuilder() {
		super();
	}

	/**
	 * 
	 */
	public FaitEntityBuilder withDescription(String desc) {
		this.description = desc;
		return this;
	}

	public FaitEntityBuilder withDate(Date date) {
		this.date = date;
		return this;
	}

	public FaitEntityBuilder withAdresse(String adresse) {
		this.adresse = adresse;
		return this;
	}

	/**
	 * @param extended
	 *            permet d'etendre la liste des infractions si true. Si false,
	 *            initialise la liste avec l'element {@link InfractionEntity}
	 * @param infractionEntity infraction 
	 * @return
	 */
	public FaitEntityBuilder withInfraction(InfractionEntity infractionEntity,
			boolean extended) {
       if(extended){
    	   if(infractions==null){
    		   infractions = new ArrayList<InfractionEntity>();
    	   }
    	   infractions.clear();
    	   
       }
       infractions.add(infractionEntity);
		return this;
	}

	public FaitEntity build() {
		if (fait == null) {
			this.fait = new FaitEntity(this.date, this.description,
					this.adresse);
		}

		return fait;
	}

	public static FaitEntityBuilder newBuilder() {
		return  new FaitEntityBuilder();
	}

}
