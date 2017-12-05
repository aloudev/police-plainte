package org.bic.process.apr.impl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.bic.process.api.IContextIterator;
import org.bic.process.api.enums.ProcessStatusEnum;
import org.bic.process.api.objets.ProcessContexte;
import org.bic.process.apr.objects.AprProcessContext;
import org.springframework.stereotype.Component;

@Component
public class AprProcessContextGenerator implements IContextIterator {

	// @Value("#{process.directory}")
	private String directoryName = "D:\\Users\\alandiay\\Documents\\apr";

	File repertoire = new File(directoryName);

	/**
	 * contextes courants
	 */
	private static Map<Long, File> threadContexts;

	public boolean hasContext() {

		synchronized (threadContexts) {

			if (threadContexts == null) {
				threadContexts = new HashMap<Long, File>();
			}

			// trouver un fichier qui n'est pas en train d'être traité par un
			// thread
			for (File current : repertoire.listFiles()) {

				if (existParmiCourants(current, threadContexts)) {
					threadContexts.put(Thread.currentThread().getId(), current);
					return true;
				}
			}
			return false;
		}
	}

	/**
	 * vérifie si le fichier fichierRandom est entrain d'etre traité par un
	 * thread
	 * 
	 * @param fichierRandom
	 *            fichier du repertoire
	 * @param fichiers
	 *            fichiers en cours de traitements
	 * @return true si le fichier est parmi les fichiers en cours de traitement
	 *         par les threads
	 */
	private boolean existParmiCourants(File fichierRandom,
			Map<Long, File> fichiers) {
		return fichiers.values().contains(fichierRandom);

	}

	/**
	 * 
	 * @return nom du repertoire
	 */
	public String getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}

	/**
	 * permet de retourner le contexte à traiter
	 */
	public ProcessContexte nextContext() {

		ProcessContexte currentContext = new AprProcessContext();
		currentContext.setStatus(ProcessStatusEnum.INITIAL);
		((AprProcessContext) currentContext).setFile(this.threadContexts
				.get(Thread.currentThread().getId()));

		return currentContext;
	}

}
