package com.alandiay.police.plainte.application.mapper;




public interface ISmartMapper<X ,Y> {

	/**
	 * prend un objet source
	 * @param source objet source
	 * @return retourne le Mapper 
	 */
	public ISmartMapper<X, Y> take(X source);
	
	/**
	 * retourne l'objet mapper
	 * @return objet cible
	 */
	public  Y give();
	
	/**
	 * 
	 * @param mapper sous mapper
	 * @return
	 */
	
	public  ISmartMapper map();
	
	
	
	

}
