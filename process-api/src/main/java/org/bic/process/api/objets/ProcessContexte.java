package org.bic.process.api.objets;

import org.bic.process.api.enums.ProcessStatusEnum;
/**
 * contexte du process
 * @author alandiay
 *
 */
public class ProcessContexte {

	/**
	 * statut du contexte
	 */
	private ProcessStatusEnum status;

	/**
	 * contexte ouvert ou fermé
	 */
	private boolean opened;

	public ProcessStatusEnum getStatus() {
		return status;
	}

	public void setStatus(ProcessStatusEnum status) {
		this.status = status;
	}

	public boolean isOpened() {
		return opened;
	}

	public void setOpened(boolean opened) {
		this.opened = opened;
	}

}
