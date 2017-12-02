package com.alandiay.police.plainte.infrastructure.spring.contexte;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * configuration  du contexte global spring de l'infrastructure
 * 
 * @author alandiay
 *
 */
@Configuration
@ComponentScan(basePackages="com.alandiay")
@Import({PlainteJPAConfigurationSpring.class,SwaggerConfig.class})
public class PlainteGlobalConfigurationSpring {
	
	
	@Bean
	ObjectMapper objectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		return mapper;
	}
}
