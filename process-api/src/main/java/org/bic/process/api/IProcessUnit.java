package org.bic.process.api;

import org.bic.process.api.objets.ProcessContexte;

/**
 * interface processor
 * 
 * @author alandiay
 *
 */
public interface  IProcessUnit<X,Y> {  
  
  
  /**
   * contient les traitement métiers
   */
  public Y process(X t, ProcessContexte context);

  

  
 
}
