package org.bic.process.api.exception;

import org.bic.process.api.objets.ProcessContexte;

/**
 * 
 * @author alandiay
 *
 */
public class ProcessException extends RuntimeException {
  
  /**
   * 
   */
  private static final long serialVersionUID = -8611554541074619932L;
  private ProcessContexte context;

  
  public ProcessException() {
	super();
}


public ProcessException(ProcessContexte context, Throwable exception) {
	super(exception);
	this.context = context;
}


public ProcessContexte getContext() {
    return context;
  }

  
  public void setContext(ProcessContexte context) {
    this.context = context;
  }
  
}
