package org.bic.process.apr.impl.factory;


import org.bic.process.api.AbstractProcessUnit;
import org.bic.process.api.IProcessUnit;
import org.bic.process.api.io.IProcessReader;
import org.bic.process.api.io.IProcessWriter;
import org.bic.process.apr.impl.AprProcessorUnitImpl;
import org.bic.process.apr.impl.AprProcessImpl;
import org.bic.process.apr.impl.io.ProcessFileReaderImpl;
import org.bic.process.apr.impl.io.ProcessFileWriterImpl;
import org.bic.process.apr.objects.Demande;
import org.bic.process.apr.objects.Demandes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ProcessorUnitFactory  {

 @Autowired
 private IProcessUnit<Demande, Demande> processor;

 @Autowired
 private IProcessReader<Demande > fileReader;
 
 @Autowired
 private IProcessWriter<Demande> fileWriter;
 
  public static AbstractProcessUnit<Demande, Demande> getProcessUnit() {
    AbstractProcessUnit<Demande, Demande> completeprocessor = new AprProcessorUnitImpl();
    
    completeprocessor.setAbstractProcessor(new AprProcessImpl());
    completeprocessor.setProcessFileReader(new ProcessFileReaderImpl());
    completeprocessor.setProcessFileWriter(new ProcessFileWriterImpl());
    
    
    return completeprocessor;
  }
  
}
