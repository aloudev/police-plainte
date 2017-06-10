package com.alandiay.police.plainte.infrastructure.impl.repository.requests.builders;

import java.util.Collection;
import java.util.List;

import javax.persistence.criteria.CriteriaQuery;



import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Selection;
import javax.persistence.criteria.Predicate.BooleanOperator;

import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;
import com.alandiay.police.plainte.infrastructure.interfaces.repository.request.builder.AbstractPlainteCriteriaBuilder;


public class PlaintesJourRequestBuilder extends AbstractPlainteCriteriaBuilder {

	
	
	@Override
	public CriteriaQuery<PlainteAggregateRoot> getCritere() {
		
		return getCriteriaBuilder().createQuery(PlainteAggregateRoot.class);
	}

}
