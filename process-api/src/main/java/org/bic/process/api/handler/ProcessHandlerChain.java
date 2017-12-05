package org.bic.process.api.handler;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author alandiay
 *
 */

public class ProcessHandlerChain {

	private List<IPreHandler> preProcessHandlderList = new ArrayList<IPreHandler>();

	private List<IPostHandler> postProcessHandlerList = new ArrayList<IPostHandler>();

	public void addProcessHandler(IPreHandler processHandler) {
		this.preProcessHandlderList.add(processHandler);
	}

	public void addOstProcessHandler(IPostHandler processHandler) {
		this.postProcessHandlerList.add(processHandler);
	}

	protected List<IPreHandler> getPreProcessHandlderList() {
		return preProcessHandlderList;
	}

	protected List<IPostHandler> getPostProcessHandlderList() {
		return postProcessHandlerList;
	}

	protected void preHandler() {
		for (IPreHandler preHandler : preProcessHandlderList) {
			preHandler.handle();
		}
	}

	
	protected void postHandler() {
		for (IPostHandler postHandler : postProcessHandlerList) {
			postHandler.handle();
		}
	}
}
