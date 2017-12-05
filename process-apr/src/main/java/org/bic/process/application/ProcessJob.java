package org.bic.process.application;

import java.io.File;
import java.io.FileReader;

import org.apache.commons.io.FileUtils;
import org.bic.process.apr.impl.AprProcessExecutor;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
/**
 * job quartz du process APR
 * @author alandiay
 *
 */
public class ProcessJob implements Job {

@Autowired
private AprProcessExecutor processExecutor;

	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		processExecutor.execute();
	}

}
