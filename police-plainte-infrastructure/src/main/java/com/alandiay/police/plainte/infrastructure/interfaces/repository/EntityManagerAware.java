package com.alandiay.police.plainte.infrastructure.interfaces.repository;

import javax.persistence.EntityManager;

public interface EntityManagerAware {

	public  EntityManager getEntityManager();
	
}
