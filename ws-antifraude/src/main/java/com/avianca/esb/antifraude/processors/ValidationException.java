package com.avianca.esb.antifraude.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.avianca.esb.antifraude.pojos.Resultado;
import com.avianca.esb.antifraude.pojos.ResultadoFraude;

public class ValidationException implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Inicia ValidationException");
		Exception cause = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
		ResultadoFraude resultado = new ResultadoFraude();
		Resultado r = new Resultado();
		r.setCodigoError("ESB-01");
		r.setCodigoRespuesta("100");
		r.setContadorErrores(0);
		r.setDescripcion(cause.toString());
		r.setIdentificador("MAF");
		r.setIdLog("1");
		r.setRespuestaCybersource("<xml de cbs>");
		r.setResultado("OK");
		resultado.setResultado(r);
		exchange.getIn().setBody(resultado);
	}

}
