package org.bic.process.apr.impl;
import org.bic.process.api.IProcessUnit;
import org.bic.process.api.objets.ProcessContexte;
import org.bic.process.apr.objects.Demande;
import org.bic.process.apr.objects.Demandes;
import org.springframework.stereotype.Component;



@Component
public class AprProcessImpl implements IProcessUnit<Demande, Demande> {

  public Demande process(Demande t, ProcessContexte contexte) {
    
    t.setContexte("contexte"); 
    return t;
  }
  
  
  
}
