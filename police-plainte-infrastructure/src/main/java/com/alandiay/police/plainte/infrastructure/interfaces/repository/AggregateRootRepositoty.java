package com.alandiay.police.plainte.infrastructure.interfaces.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;




public abstract class AggregateRootRepositoty implements EntityManagerAware {
	
	@PersistenceContext
	private EntityManager entityManager;
	
    public EntityManager getEntityManager(){
    	
    	return entityManager;
    }
	
	
}
