package com.alandiay.police.plainte.domaine.interfaces.repository;



import java.util.List;

import com.alandiay.police.plainte.domaine.interfaces.objects.AggregateRoot;
/**
 * 
 * @author alandiay
 *
 * @param <T>
 * @param <Critere>
 */
@SuppressWarnings("rawtypes")
public interface IPlainteAggregateRootRepository< T extends AggregateRoot, C extends CritereBuilder> {
	
	
	public void save(T t);
	
	public T find(T t);
	
	public void delete(T t);
	
	public List<T> findAll(C c);

}
