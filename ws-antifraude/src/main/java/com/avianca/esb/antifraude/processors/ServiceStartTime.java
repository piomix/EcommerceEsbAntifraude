package com.avianca.esb.antifraude.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class ServiceStartTime implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Inicia ServiceStartTime");
		long start = System.currentTimeMillis();
		exchange.getIn().setHeader("serviceStartTime", start);
	}

}
