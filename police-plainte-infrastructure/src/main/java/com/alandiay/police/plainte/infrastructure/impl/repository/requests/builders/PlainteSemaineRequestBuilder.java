package com.alandiay.police.plainte.infrastructure.impl.repository.requests.builders;

import javax.persistence.criteria.CriteriaQuery;

import com.alandiay.police.plainte.domaine.objects.PlainteAggregateRoot;
import com.alandiay.police.plainte.infrastructure.interfaces.repository.request.builder.AbstractPlainteCriteriaBuilder;

public class PlainteSemaineRequestBuilder  extends AbstractPlainteCriteriaBuilder{

	@Override
	public CriteriaQuery<PlainteAggregateRoot> getCritere() {
		return null;
	}

}
