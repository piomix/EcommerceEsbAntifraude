package com.avianca.esb.antifraude.processors;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.xml.XPathBuilder;

public class XPathEvaluation implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Inicia XPathEvaluation");
		String req = exchange.getIn().getBody(String.class);
		String codigo = null;
		int contadorErrores = 0;
		String descripcion = null;
		String idLog = null;
		String identificador = null;
		String xmlResponse = null;
		String mensaje = null;
		Map<String, Object> respuesta = new HashMap<String, Object>();
		try{
			XPathBuilder xpath = XPathBuilder.xpath("//a:ValidationAFResult/b:ErrorCount/text()").namespace("a", "http://tempuri.org/").namespace("b", "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO");
			contadorErrores = xpath.evaluate(exchange.getContext(), req, int.class);
			xpath = XPathBuilder.xpath("//a:ValidationAFResult/b:Respuesta/b:AFSystemReturnCode/text()").namespace("a", "http://tempuri.org/").namespace("b", "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO");
			codigo = xpath.evaluate(exchange.getContext(), req, String.class);
			xpath = XPathBuilder.xpath("//a:ValidationAFResult/b:Respuesta/b:Description/text()").namespace("a", "http://tempuri.org/").namespace("b", "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO");
			descripcion = xpath.evaluate(exchange.getContext(), req, String.class);
			xpath = XPathBuilder.xpath("//a:ValidationAFResult/b:Respuesta/b:LogTransactionNumber/text()").namespace("a", "http://tempuri.org/").namespace("b", "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO");
			idLog = xpath.evaluate(exchange.getContext(), req, String.class);
			xpath = XPathBuilder.xpath("//a:ValidationAFResult/b:Respuesta/b:MessageUniqueIdentifier/text()").namespace("a", "http://tempuri.org/").namespace("b", "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO");
			identificador = xpath.evaluate(exchange.getContext(), req, String.class);
			xpath = XPathBuilder.xpath("//a:ValidationAFResult/b:RespuestaCybersource/b:xmlResponse/text()").namespace("a", "http://tempuri.org/").namespace("b", "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO");
			xmlResponse = xpath.evaluate(exchange.getContext(), req, String.class);
			xpath = XPathBuilder.xpath("//a:ValidationAFResult/b:Respuesta/b:Result/text()").namespace("a", "http://tempuri.org/").namespace("b", "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO");
			mensaje = xpath.evaluate(exchange.getContext(), req, String.class);
		}catch(Throwable ex){
			contadorErrores = 10;
			descripcion = ex.getMessage();
			mensaje = "ERROR";
		}finally{
			/*r.setCodigoRespuesta(codigo);
			r.setCodigoError("ESB-01");
			r.setContadorErrores(contadorErrores);
			r.setDescripcion(descripcion);
			r.setIdentificador(identificador);
			r.setIdLog(idLog);
			r.setRespuestaCybersource(xmlResponse);
			r.setResultado(mensaje);
			resultado.setResultado(r);*/
			respuesta.put("contadorErrores", contadorErrores);
			respuesta.put("codigo", codigo);
			respuesta.put("descripcion", descripcion);
			respuesta.put("idLog", idLog);
			respuesta.put("identificador", identificador);
			respuesta.put("xmlResponse", xmlResponse);
			respuesta.put("mensaje", mensaje);
			exchange.getIn().setBody(respuesta);
		}
	}

}
