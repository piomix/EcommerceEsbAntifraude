package com.avianca.esb.antifraude.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.transports.http.configuration.HTTPClientPolicy;

public class TimeOutProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Inicia TimeOutProcessor");
		exchange.getIn().removeHeader(Client.RESPONSE_CONTEXT);
		exchange.getIn().removeHeader(Client.REQUEST_CONTEXT);
		
		Map<String, Object> reqCtx = new HashMap<String, Object>();
		
		/**
		 * Se cambia el timeout de 80 segundos
		 */
		HTTPClientPolicy clientHttpPolicy = new HTTPClientPolicy();
		clientHttpPolicy.setReceiveTimeout(300000);
		reqCtx.put(HTTPClientPolicy.class.getName(), clientHttpPolicy);
		
		exchange.getIn().setHeader(Client.REQUEST_CONTEXT, reqCtx);
	}

}
