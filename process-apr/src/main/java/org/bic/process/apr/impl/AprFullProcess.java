package org.bic.process.apr.impl;

import org.bic.process.api.AbstractFullProcess;
import org.bic.process.apr.objects.Demandes;
import org.springframework.stereotype.Component;

@Component
public class AprFullProcess extends AbstractFullProcess<Demandes, Demandes> {

	@Override
	protected void beforeStartup() {
		
	}

	@Override
	protected void beforeShutdown() {
		
	}

}
