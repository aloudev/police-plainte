package com.alandiay.police.plainte.infrastructure.spring.contexte;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;



@Configuration
@ComponentScan(basePackages="com.alandiay")
public class PlainteJPAConfigurationSpring {

	
	@Bean
	public CriteriaBuilder getCriteriaBuilder(){
		return entityManagerFactory().getCriteriaBuilder();
	}
	
	
	/** moyen d'accéder à la data source
	 * data source
	 * @return DataSource
	 */
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/police_plainte");
		dataSource.setUsername( "root" );
		dataSource.setPassword("");
		
		return dataSource;
	}

	/**
	 * 
	 * @return
	 */
	 @Bean
	   public EntityManagerFactory  entityManagerFactory() {
		 
		  LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		 
		  factory.setDataSource(dataSource());
		  factory.setPackagesToScan("com.alandiay.police.plainte.domaine");
		  factory.setPersistenceUnitName("plainte");
	      factory. setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	      factory.setJpaProperties(additionalProperties());
	      factory.afterPropertiesSet();
	      	
	      return factory.getObject()	;
	   }
	 
	/**
	 * configurtion de la plateforme de transaction
	 * @param emf entity manager factory
	 * @return PlatformTransactionManager
	 */
	 @Bean
	   public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
	      
		 JpaTransactionManager transactionManager = new JpaTransactionManager();
	      transactionManager.setEntityManagerFactory(emf);
	     
	      return transactionManager;
	   }

	 Properties additionalProperties() {
	      
		  Properties properties = new Properties();
	      properties.setProperty("hibernate.hbm2ddl.auto", "create-drop");
	      properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
	   
	      return properties;
	   }

  	
    
	 
}
