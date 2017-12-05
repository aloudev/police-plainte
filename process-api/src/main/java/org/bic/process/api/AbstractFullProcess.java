package org.bic.process.api;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * process complete
 * 
 * @author alandiay
 *
 * @param <X>
 * @param <Y>
 */
public abstract class AbstractFullProcess<X, Y> {

	@Autowired
	AbstractCompleteUnit<X, Y> processCompleteUnit;

	/**
	 * méthode d'exécution du process
	 */
	public void execute() {

		beforeStartup();
		processCompleteUnit.process();
		beforeShutdown();
	}

	/**
	 * appelé avant le process
	 */
	protected abstract void beforeStartup();

	/**
	 * appelé apres l'éxecution du process
	 */
	protected abstract void beforeShutdown();

}
