package com.alandiay.police.plainte.infrastructure.impl.repository;

import java.util.List;








import org.springframework.stereotype.Repository;

import com.alandiay.police.plainte.domaine.interfaces.repository.IPlainteAggregateRootRepository;
import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;
import com.alandiay.police.plainte.infrastructure.interfaces.repository.AggregateRootRepositoty;
import com.alandiay.police.plainte.infrastructure.interfaces.repository.request.builder.AbstractPlainteCriteriaBuilder;

@Repository
public class PlainteRepositoryImpl extends AggregateRootRepositoty  implements IPlainteAggregateRootRepository<AbstractPlainteCriteriaBuilder> {

	public void save(PlainteAggregateRoot t) {
       getEntityManager().persist(t);		
	}

	public PlainteAggregateRoot find(String id) {
		return getEntityManager().find(PlainteAggregateRoot.class,id);
	}



	public void delete(PlainteAggregateRoot t) {
	 getEntityManager().remove(t);
		
	}

	public List<PlainteAggregateRoot> findAll(AbstractPlainteCriteriaBuilder critereBuilder) {
		return getEntityManager().createQuery(critereBuilder.getCritere()).getResultList() ;
	}

	

}
