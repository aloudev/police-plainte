package org.bic.process.apr.objects;

import java.io.Serializable;

/**
 * 
 * @author alandiay
 *
 */
public class RoleTitulaire implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String prmId;

	public String getPrmId() {
		return prmId;
	}

	public void setPrmId(String prmId) {
		this.prmId = prmId;
	}

}
