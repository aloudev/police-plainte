package org.bic.process.apr.objects;
/**
 * 
 * @author alandiay
 *
 */

public class Demande {
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  
  private String ref;
  
  private String contexte;
  
  private  RoleTitulaire roleTitulaire;


  public String getRef() {
    return ref;
  }


  public void setRef(String ref) {
    this.ref = ref;
  }
  
  public int getA(){
    
    return 1;
  }
  
 public int getB(){
    
    return 1;
  }


public String getContexte() {
  return contexte;
}


public void setContexte(String contexte) {
  this.contexte = contexte;
}


public RoleTitulaire getRoleTitulaire() {
	return roleTitulaire;
}


public void setRoleTitulaire(RoleTitulaire roleTitulaire) {
	this.roleTitulaire = roleTitulaire;
}
}
