package org.bic.process.api;

import org.bic.process.api.io.IProcessReader;
import org.bic.process.api.io.IProcessWriter;
import org.bic.process.api.objets.ProcessContexte;

/**
 * 
 * @author alandiay
 *
 * @param <X> input
 * @param <Y> output
 */
public abstract class AbstractProcessUnit<X,Y> {
  
  
  
  public void setContext(ProcessContexte context) {
    this.context = context;
  }

  private IProcessReader<X> processFileReader;
  private IProcessWriter<Y> processFileWriter;
  private IProcessUnit<X,Y> abstractProcessor;
  private ProcessContexte context;

public void execute(){
  
  X x = processFileReader.read(context);
  Y y = abstractProcessor.process(x,context);
  processFileWriter.write(y, context);

}
  
  

public void setAbstractProcessor(IProcessUnit<X, Y> abstractProcessor) {
  this.abstractProcessor = abstractProcessor;
}

  public void setProcessFileReader(IProcessReader<X> processFileReader) {
    this.processFileReader = processFileReader;
  }

  public void setProcessFileWriter(IProcessWriter<Y> processFileWriter) {
    this.processFileWriter = processFileWriter;
  }
  
}