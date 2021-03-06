package com.alandiay.police.plainte.infrastructure.spring.contexte;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * configuraion du contexte spring pour la persistence
 * 
 * @author alandiay
 *
 */

@Configuration
@EnableTransactionManagement
public class PlainteJPAConfigurationSpring {

	
	Logger logger = LoggerFactory.getLogger(PlainteJPAConfigurationSpring.class);
	
	/**
	 * factory methode de critère builder
	 * 
	 * @return CriteriaBuilder
	 */
	@Bean
	public CriteriaBuilder getCriteriaBuilder() {
		return entityManagerFactory().getCriteriaBuilder();
	}

	/**
	 * moyen d'accéder à la data source data source
	 * 
	 * @return DataSource
	 */


	/**
	 * source de données fournie par le conteneur
	 * @return
	 * @throws NamingException
	 */
	@Bean
	//@Profile("prod")
	public DataSource dataSource() {

		DataSource dataSource = null;
		try {
			Context initContext;
			initContext = new InitialContext();
			Context envContext  = (Context)initContext.lookup("java:/comp/env");
		 dataSource =  (DataSource)envContext.lookup("jdbc/plainteDB");
		} catch (NamingException e) {
		}
		
	return  dataSource;
	}
	
	

	/**
	 * 
	 * @return
	 */
	@Bean
	public EntityManagerFactory entityManagerFactory() {

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		logger.debug("hello world");
		factory.setDataSource(dataSource());
		factory.setPackagesToScan("com.alandiay.police.plainte.domaine");
		factory.setPersistenceUnitName("plainte");
		factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		factory.setJpaProperties(additionalProperties());
		factory.afterPropertiesSet();

		return factory.getObject();
	}

	

	/**
	 * configurtion de la plateforme de transaction
	 * 
	 * @param emf
	 *            entity manager factory
	 * @return PlatformTransactionManager
	 */
	@Bean
	public PlatformTransactionManager transactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		
		transactionManager.setEntityManagerFactory(entityManagerFactory());
		
		return transactionManager;
	}

	private Properties additionalProperties() {

		Properties properties = new Properties();
		//properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
		//properties.setProperty("hibernate.dialect",
			//	"org.hibernate.dialect.MySQL5Dialect");

		return properties;
	}

}
