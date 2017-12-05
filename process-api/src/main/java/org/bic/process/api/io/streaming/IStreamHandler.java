package org.bic.process.api.io.streaming;

import org.bic.process.api.objets.ProcessContexte;

public interface IStreamHandler {
	
	
	
	
	
	public void startStreaming();
	
	/**
	 * lit l'élèment qui nous intéresse
	 */
	public void readElement();
	
	
	/**
	 * fin du flux
	 */
	public void endStream();
	
	/**
	 * permet de retourner l'élèment que l'on veut lire
	 * @return
	 */
	public String getElement();

	void handle(ProcessContexte context);

}
