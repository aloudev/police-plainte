package com.alandiay.police.plainte.domaine.interfaces.repository;



import java.util.List;

import com.alandiay.police.plainte.domaine.models.PlainteAggregateRoot;
/**
 * 
 * @author alandiay
 *
 * @param <T>
 * @param <Critere>
 */
public interface IPlainteAggregateRootRepository<C> {
	
	
	public void save(PlainteAggregateRoot t);
	
	public PlainteAggregateRoot find(String id);
	
	public void delete(PlainteAggregateRoot t);
	
	public List<PlainteAggregateRoot> findAll(C c);

}
