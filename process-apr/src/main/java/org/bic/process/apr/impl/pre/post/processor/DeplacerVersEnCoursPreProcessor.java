package org.bic.process.apr.impl.pre.post.processor;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bic.process.api.enums.ProcessStatusEnum;
import org.bic.process.api.objets.ProcessContexte;
import org.bic.process.api.pre.post.processor.IPreProcessor;
import org.bic.process.apr.objects.AprProcessContext;
import org.springframework.stereotype.Component;


@Component
public class DeplacerVersEnCoursPreProcessor  implements IPreProcessor{

  private IPreProcessor nextPreProcessor;
  
  
  private String destination =  "D:\\Users\\alandiay\\Desktop\\dev\\projects\\process-apr\\src\\main\\resources\\enCours\\";
 
  
  public void preProcess(ProcessContexte contexte) {
  
    
    
    if(nextPreProcessor!=null){
      nextPreProcessor.preProcess(contexte);  
    }
    contexte.setStatus(ProcessStatusEnum.PROGRESS);
    deplacerFichierEnCours(((AprProcessContext)contexte).getFile().getPath());
    ((AprProcessContext)contexte).setFile(new File(destination+"//"+((AprProcessContext)contexte).getFile().getName()));
  }

  
  private void deplacerFichierEnCours(String source){
    try {
      FileUtils.moveToDirectory(new File(source)
      ,new File(destination),false );
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
}
