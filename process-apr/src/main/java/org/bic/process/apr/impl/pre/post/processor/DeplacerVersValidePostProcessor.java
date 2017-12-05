package org.bic.process.apr.impl.pre.post.processor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bic.process.api.enums.ProcessStatusEnum;
import org.bic.process.api.objets.ProcessContexte;
import org.bic.process.api.pre.post.processor.IPostProcessor;
import org.bic.process.apr.objects.AprProcessContext;
import org.springframework.stereotype.Component;


@Component
public class DeplacerVersValidePostProcessor implements IPostProcessor {

  private IPostProcessor nextPostProcessor;
  
  private String destination  = "D:\\Users\\alandiay\\Desktop\\dev\\"+ "projects\\process-apr\\src\\main\\resources\\valide";
  
  public void postProcess(ProcessContexte contexte) {
   
    
    if(nextPostProcessor!=null){
      nextPostProcessor.postProcess(contexte);
    }
      deplacerFichierVersValide(((AprProcessContext)contexte).getFile());
      contexte.setStatus(ProcessStatusEnum.OK);
    
  }
 
  
  private void deplacerFichierVersValide(File source){
    try {
      FileUtils.moveToDirectory(source
      ,new File(destination),false );
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
}
