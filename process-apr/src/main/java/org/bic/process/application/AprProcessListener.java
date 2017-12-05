package org.bic.process.application;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class AprProcessListener implements ServletContextListener {

	@Autowired
	ProcessJob job;

	@Autowired
	SchedulerFactory schedulerFactory;

	private Scheduler scheduler;
	

	

	public void contextInitialized(ServletContextEvent arg0) {

		try {

			JobDetail job = JobBuilder.newJob(ProcessJob.class).withIdentity(
					"CronQuartzJob", "Group").build();

			// Create a Trigger that fires every 5 minutes.
			Trigger trigger = TriggerBuilder.newTrigger()
					.withIdentity("TriggerName", "Group")
					.withSchedule(CronScheduleBuilder.cronSchedule("0/5 * * * * ?"))
					.build();


			scheduler = schedulerFactory.getScheduler();
			scheduler.start();
			scheduler.scheduleJob(job, trigger);

		} catch (SchedulerException e) {
			e.printStackTrace();
		}


	}

	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		try {
			scheduler.shutdown();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}

	}



}
