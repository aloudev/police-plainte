package com.alandiay.police.plainte.infrastructure.interfaces.repository.request.builder;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.beans.factory.annotation.Autowired;

import com.alandiay.police.plainte.domaine.interfaces.repository.CritereBuilder;
import com.alandiay.police.plainte.domaine.objects.PlainteAggregateRoot;


public abstract class AbstractPlainteCriteriaBuilder implements CritereBuilder<CriteriaQuery<PlainteAggregateRoot>> {

	@Autowired
	private CriteriaBuilder criteriaBuilder;
	
	public CriteriaBuilder getCriteriaBuilder() {
		return criteriaBuilder;
	}

	public void setCriteriaBuilder(CriteriaBuilder criteriaBuilder) {
		this.criteriaBuilder = criteriaBuilder;
	}

	public abstract CriteriaQuery<PlainteAggregateRoot> getCritere();


	
}
