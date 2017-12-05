package org.bic.process.apr.impl.io.streaming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.bic.process.api.enums.ProcessStatusEnum;
import org.bic.process.api.objets.ProcessContexte;
import org.bic.process.apr.objects.AprProcessContext;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;

public class StreamReader {

	private JsonParser jParser;
	private StringBuilder demandeStringBuilder;
	private boolean demandeDejaTrouve = false;
	private 	int trouve ;

	private void parsingDemande(ProcessContexte context) throws IOException {
	
		//init
		beforeInitParsing(context);
		
		while (jParser.nextToken() != null && trouve != 3) {
			String fieldname = jParser.getCurrentName();
			if ("demandes".equals(fieldname) || demandeDejaTrouve) {
				demandeDejaTrouve = true;
				jParser.nextToken();
				while (trouve != 3) {
					buildDemandeString(jParser.getText(), trouve);
				}
			}
		}
		//end
		beforeEndParsing(context);
	}

	/**
	 * permet de parser une demande
	 * 
	 * @param jParser
	 * @return
	 * @throws IOException
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 */
	private void buildDemandeString(String token, int trouve)
			throws IOException, JsonParseException, JsonMappingException {
		if (token == "roleTitulaire" || token == "}" || token == "}") {
			trouve++;
		}
		demandeStringBuilder.append(token);
	}

	private void beforeEndParsing(ProcessContexte context) throws IOException {
		if (jParser.getText() == "]") {
			jParser.close();
			context.setOpened(false);
			demandeDejaTrouve = false;
		}
	}

	/**
	 * methode permettant d'initialiser le parsing
	 * 
	 * @param context
	 *            contexte du process
	 * @throws FileNotFoundException
	 *             si le fichier n'est pas trouvé
	 * @throws IOException
	 * @throws JsonParseException
	 */
	private void beforeInitParsing(ProcessContexte context)
			throws FileNotFoundException, IOException, JsonParseException {

		trouve = 0;
		
		String ligneCourante;
		
		if (ProcessStatusEnum.INITIAL.equals(context.getStatus())) {
			BufferedReader buffer = new BufferedReader(new FileReader(
					((AprProcessContext) context).getFile()));
			StringBuilder contentBuilder = new StringBuilder();
			while ((ligneCourante = buffer.readLine()) != null) {
				contentBuilder.append(ligneCourante);
			}
			buffer.close();
			jParser = new JsonFactory().createParser(contentBuilder.toString());
		}

	}

	public String getElement() {
		return demandeStringBuilder.toString();
	}

	public void handle(ProcessContexte context) {
		try {
			parsingDemande(context);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
