package org.bic.process.api.objets;

import org.bic.process.api.multithreading.enums.ProcessStatusEnum;


public class ProcessContexte {
  
  private ProcessStatusEnum status;

  
  public ProcessStatusEnum getStatus() {
    return status;
  }

  
  public void setStatus(ProcessStatusEnum status) {
    this.status = status;
  }
  
  
}
