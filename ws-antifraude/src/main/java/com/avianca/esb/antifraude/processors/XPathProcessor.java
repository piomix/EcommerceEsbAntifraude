package com.avianca.esb.antifraude.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.xml.XPathBuilder;

import com.avianca.esb.antifraude.pojos.Resultado;
import com.avianca.esb.antifraude.pojos.ResultadoFraude;

public class XPathProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Inicia XPathProcessor");
		
		ResultadoFraude resultado = new ResultadoFraude();
		Resultado r = new Resultado();
		String req = exchange.getIn().getBody(String.class);
		String mensaje;
		try {
			XPathBuilder xpath = XPathBuilder.xpath("//soap:Fault/detail/e:ExceptionDetail/e:Message/text()").namespace("soap", "http://schemas.xmlsoap.org/soap/envelope/").namespace("e", "http://schemas.datacontract.org/2004/07/System.ServiceModel");
			mensaje = xpath.evaluate(exchange.getContext(),req,String.class);
			if(mensaje.isEmpty()){
				mensaje = req;
			}
		} catch (Exception e) {
			// TODO: handle exception
			mensaje = null;
			
		}
		
		r.setCodigoError("ESB-01");
		r.setCodigoRespuesta("100");
		r.setContadorErrores(0);
		r.setDescripcion(mensaje);
		r.setIdentificador("MAF");
		r.setIdLog("");
		r.setRespuestaCybersource("");
		r.setResultado("ERROR");
		resultado.setResultado(r);
		exchange.getIn().setBody(resultado);
	}

}
