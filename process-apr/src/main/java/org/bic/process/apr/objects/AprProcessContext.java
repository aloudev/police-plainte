package org.bic.process.apr.objects;

import java.io.File;
import org.bic.process.api.objets.ProcessContexte;


public class AprProcessContext  extends ProcessContexte{
  
  
  /**
   * nom du fichier
   */
  private File file;

  
  public File getFile() {
    return file;
  }

  
  public void setFile(File file) {
    this.file = file;
  }


  
}
