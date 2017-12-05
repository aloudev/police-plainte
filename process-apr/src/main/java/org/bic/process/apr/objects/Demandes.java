package org.bic.process.apr.objects;

import java.io.Serializable;
import java.util.List;


public class Demandes implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  private List<Demande> demandes;

  
  public List<Demande> getDemandes() {
    return demandes;
  }

  
  public void setDemandes(List<Demande> demandes) {
    this.demandes = demandes;
  }
  
  
  
}
