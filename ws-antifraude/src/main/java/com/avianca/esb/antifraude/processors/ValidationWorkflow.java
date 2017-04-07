package com.avianca.esb.antifraude.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class ValidationWorkflow implements Processor{
	
	private static final Logger LOG = Logger.getLogger("wsantifraudeLog");

	@Override
	public void process(Exchange exchange) throws Exception {
		LOG.info("Comienza validación de workflow...");
		
		@SuppressWarnings("unchecked")
		Map<String, String> crUser = exchange.getIn().getBody(Map.class);

		if(crUser.isEmpty())
			throw new Exception("No existe workflow configurado para su transaccion.");
		
		LOG.info("Validación de workflow terminado con éxito.");
	}

}
