package org.bic.process.apr.impl.factory;

import org.bic.process.api.AbstractCompleteUnit;
import org.bic.process.api.IContextIterator;
import org.bic.process.api.pre.post.processor.IPostProcessor;
import org.bic.process.api.pre.post.processor.IPreProcessor;
import org.bic.process.apr.objects.Demande;
import org.bic.process.apr.objects.Demandes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProcessRunnableFactory  {

  
  @Autowired
   AbstractCompleteUnit<Demande, Demande> processRunnable;
  
  
  @Autowired
  IContextIterator contextGenerator;
  
  @Autowired
  IPreProcessor preProcessor;

  @Autowired
   IPostProcessor postProcessor;
  
  public  AbstractCompleteUnit<Demande, Demande>getProcessWithPrePost() {
   
		  
	    	processRunnable.setProcessCompleteUnit(ProcessorUnitFactory.getProcessUnit());
	        processRunnable.setContextGenerator(contextGenerator);
	        processRunnable.setPostProcessor(postProcessor);
	        processRunnable.setPreProcessor(preProcessor);
	 
    return processRunnable;
  
  }
  
}
