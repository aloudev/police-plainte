package org.bic.process.application;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletConfig;

import org.bic.process.apr.objects.Demande;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Application {

	public static void main(String[] args) {
		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(ProcessSpringConfiguration.class);
		// context.getBean(AprProcessExecutor.class).execute();
	
	}

}
