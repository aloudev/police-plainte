package com.alandiay.police.plainte.infrastructure.spring.contexte;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * configuration  du contexte global spring de l'infrastructure
 * 
 * @author alandiay
 *
 */
@Configuration
@ComponentScan(basePackages="com.alandiay")
@Import(PlainteJPAConfigurationSpring.class)
public class PlainteGlobalConfigurationSpring {

}
