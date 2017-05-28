package com.alandiay.police.plainte.infrastructure.spring.contexte;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;

@Configuration
@Import({PlainteJPAConfigurationSpring.class})
public class PlainteGlobalConfigurationSpring {

}
