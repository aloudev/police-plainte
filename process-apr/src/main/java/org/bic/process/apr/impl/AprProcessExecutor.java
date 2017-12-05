package org.bic.process.apr.impl;


import org.bic.process.api.AbstractFullProcess;
import org.bic.process.apr.objects.Demandes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AprProcessExecutor {
  
  @Autowired
  private AbstractFullProcess<Demandes , Demandes> process;
  
    public void execute(){
	process.execute();
  }
  
}
