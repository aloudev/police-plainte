package org.bic.process.apr.impl.io;

import java.io.File;
import java.io.IOException;

import org.bic.process.api.enums.ProcessStatusEnum;
import org.bic.process.api.io.IProcessWriter;
import org.bic.process.api.objets.ProcessContexte;
import org.bic.process.apr.objects.AprProcessContext;
import org.bic.process.apr.objects.Demande;
import org.bic.process.apr.objects.Demandes;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Component
public class ProcessFileWriterImpl implements IProcessWriter<Demande> {
  
  
    private static final String FILE_NAME = "D:\\Users\\alandiay\\Desktop\\dev\\"
      + "projects\\process-apr\\src\\main\\resources\\emission\\";


    public void  write(Demande demande, ProcessContexte context){
        
       try {
        new ObjectMapper().writeValue(new File(FILE_NAME+((AprProcessContext)context).getFile().getName()),demande);
        context.setStatus(ProcessStatusEnum.OK);
      } catch (JsonGenerationException e) {
        context.setStatus(ProcessStatusEnum.KO);
      } catch (JsonMappingException e) {
        context.setStatus(ProcessStatusEnum.KO);
      } catch (IOException e) {
        context.setStatus(ProcessStatusEnum.KO);
      }
      
      
    
      
    }
    
    
    
}
