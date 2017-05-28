package org.bic.process.api.multithreading.enums;



public interface IMultiThreadFileInterpreter {
  
  
  /**
   * permet de dire si on est en mode multithread ou pas
   * @return retourne un booléen
   */
  public  boolean isMultiThread();
  
  
  /**
   * permet de lire le nombre de thread a lancer
   * @return
   */
  public  int getNumberOfThreads();
  
  
  /**
   * permet de preciser le type de multithread : repartition uniforme de la charge
   * 
   *  ; si chaque thread traite un element puis quand il finit prend un autre;
   *  
   *  ; traitement probabiliste
   *  
   *   
   * 
   * 
   * @return 
   */
  public TypeOfMultiThreadingEnum getType();
  
}
