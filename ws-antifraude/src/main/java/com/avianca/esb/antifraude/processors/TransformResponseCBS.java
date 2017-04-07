package com.avianca.esb.antifraude.processors;

import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import com.avianca.esb.antifraude.pojos.Resultado;
import com.avianca.esb.antifraude.pojos.ResultadoFraude;

public class TransformResponseCBS implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Inicia TransformResponseCBS");
		@SuppressWarnings("unchecked")
		Map<String,Object> rules = exchange.getIn().getBody(Map.class);
		ResultadoFraude resultado = new ResultadoFraude();
		Resultado r = new Resultado();
		if((String)rules.get("codeCBS") != null)
			r.setCodigoRespuesta((String)rules.get("codeCBS"));
		else
			r.setCodigoRespuesta((String)rules.get("codigo"));
			r.setCodigoError("ESB-00");
			r.setContadorErrores((Integer)rules.get("contadorErrores"));
			r.setDescripcion((String)rules.get("descripcion"));
			r.setIdentificador((String)rules.get("identificador"));
			r.setIdLog((String)rules.get("idLog"));
			r.setRespuestaCybersource((String)rules.get("xmlResponse"));
		if((String)rules.get("responseCBS") != null)
			r.setResultado((String)rules.get("responseCBS"));
		else
			r.setResultado((String)rules.get("mensaje"));
		resultado.setResultado(r);
		exchange.getIn().setBody(resultado);
		System.out.println("Se ha procesado la validaciÃ³n antifraude satisfactoriamente.");
	}
	
}
