package org.bic.process.api;




import org.bic.process.api.exception.ProcessException;
import org.bic.process.api.multithreading.enums.ProcessStatusEnum;
import org.bic.process.api.objets.ProcessContexte;
import org.bic.process.api.pre.post.processor.IPostProcessor;
import org.bic.process.api.pre.post.processor.IPreProcessor;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractCompleteUnit<X,Y> {
    
	@Autowired
	  private AbstractProcessUnit<X, Y> processCompleteUnit;
	@Autowired  
	  private IContextGenerator contextGenerator;
	@Autowired
	  private IPostProcessor postProcessor;
	@Autowired
	  private IPreProcessor preProcessor;
	    
	
	





    public void execute(){  	
      

    	ProcessContexte context =  new ProcessContexte();
    	context.setStatus(ProcessStatusEnum.INITIAL);
    	
    	while(contextGenerator.hasContext()){

        try{
        
        	context = contextGenerator.nextContext();
             preProcessor.preProcess(context);
          
          processCompleteUnit.setContext(context);
          processCompleteUnit.execute();
          
          postProcessor.postProcess(context);   
        }
        catch(Throwable exception){
        	
        	if(exception instanceof ProcessException)
        	{
        		LoggerFactory.getLogger("").warn("erreur non bloquante", exception);
        	}
        	 context.setStatus(ProcessStatusEnum.FAILED);
        	 
        	 throw new ProcessException((ProcessContexte)context,exception) ;
        	
        }
      
      }
        
     
    }

  




    
    public void setContextGenerator(IContextGenerator contextGenerator) {
      this.contextGenerator = contextGenerator;
    }



   
    public void setPostProcessor(IPostProcessor postProcessor) {
      this.postProcessor = postProcessor;
    }

    
    public void setPreProcessor(IPreProcessor preProcessor) {
      this.preProcessor = preProcessor;
    }

    
    public void setProcessCompleteUnit(AbstractProcessUnit<X, Y> processCompleteUnit) {
      this.processCompleteUnit = processCompleteUnit;
    }




  
}
