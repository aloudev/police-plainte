package org.bic.process.api.io;

import org.bic.process.api.objets.ProcessContexte;


public interface IProcessWriter<T> {
  
  public  void  write(T t, ProcessContexte contexte); 
}
