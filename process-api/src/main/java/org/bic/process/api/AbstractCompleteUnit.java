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
	private IContextIterator contextGenerator;
	@Autowired
	private IPostProcessor postProcessor;
	@Autowired
	private IPreProcessor preProcessor;








	public void process(){  	


		ProcessContexte context =  new ProcessContexte();
		context.setStatus(ProcessStatusEnum.INITIAL);

		while(contextGenerator.hasContext()){

			try{

				//génération du contexte
				context = contextGenerator.nextContext();
				
				// preprocess
				preProcessor.preProcess(context);

				//process
				processCompleteUnit.process(context);

				// postprocess
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







	public void setContextGenerator(IContextIterator contextGenerator) {
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
