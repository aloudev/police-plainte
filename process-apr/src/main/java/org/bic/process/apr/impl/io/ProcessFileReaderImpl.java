package org.bic.process.apr.impl.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.bic.process.api.enums.ProcessStatusEnum;
import org.bic.process.api.exception.ProcessException;
import org.bic.process.api.io.IProcessReader;
import org.bic.process.api.io.streaming.IStreamHandler;
import org.bic.process.api.objets.ProcessContexte;
import org.bic.process.apr.objects.AprProcessContext;
import org.bic.process.apr.objects.Demande;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class ProcessFileReaderImpl implements IProcessReader<Demande> {

	private static String rejet = "D:\\Users\\alandiay\\Desktop\\dev\\"
			+ "projects\\process-apr\\src\\main\\resources\\rejet\\";
	
	@Autowired
	private IStreamHandler streamHandler;

	public Demande read(ProcessContexte context) {

		Demande demande = null;

		try {
			streamHandler.handle();
			demande = new ObjectMapper().readValue(streamHandler.getElement()
					, Demande.class);
			context.setStatus(ProcessStatusEnum.PROGRESS);

			deplacerFichierVersRejet(((AprProcessContext) context).getFile());

			context.setStatus(ProcessStatusEnum.KO);

			ProcessException exception = new ProcessException();
			exception.setContext(context);

					} catch (Exception e) {
			context.setStatus(ProcessStatusEnum.KO);
		} finally {
			
		}
		

		return demande;
	}


	private void deplacerFichierVersRejet(File source) {
		try {
			FileUtils.moveToDirectory(source, new File(rejet), false);
		} catch (IOException e) {
			throw new ProcessException();
		}
	}

	
}
