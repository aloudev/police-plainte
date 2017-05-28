package com.alandiay.police.plainte.domaine.objects;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.alandiay.police.plainte.domaine.interfaces.objects.PlainteEntity;

@Entity(name="t_plaignant")
public class PlaignantEntity  implements PlainteEntity<Long>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//private List<PlainteAggregateRoot> plaintes ;

	@Id
	@Column(name="PLAIGNANT_ID")
	private Long id;
	
	public Long getId() {
		return id;
	}
	
	
//	/**
//	 * un plaignant porte plainte
//	 * @param plainte plainte deposee
//	 */
//	void depose(PlainteAggregateRoot plainte){
//		 getPlaintes().add(plainte);
//	}
    

//	public List<PlainteAggregateRoot> getPlaintes() {
//		if(plaintes==null){
//			return new ArrayList<PlainteAggregateRoot>();
//		}
//		return plaintes;
//	}


	
	
	

}
