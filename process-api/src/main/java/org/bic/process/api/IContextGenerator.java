package org.bic.process.api;

import org.bic.process.api.objets.ProcessContexte;


public  interface IContextGenerator {
  
  public boolean  hasContext();
  
  
  public ProcessContexte nextContext();
  
  
  
}