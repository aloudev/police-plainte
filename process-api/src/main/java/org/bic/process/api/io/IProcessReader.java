package org.bic.process.api.io;

import org.bic.process.api.objets.ProcessContexte;


public interface IProcessReader<T> {
  
    public T read(ProcessContexte context);
  
}
