package com.avianca.esb.antifraude.processors;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

import com.avianca.esb.antifraude.pojos.AntiFraudEsb;

public class MAFService implements Processor{
	
	private static final Logger LOG = Logger.getLogger("wsantifraudeLog");

	public MAFService() {}

	@Override
	public void process(Exchange exchange) throws Exception {
		System.out.println("Inicia MAFService");
		LOG.info("Creando mapa para ser usado en la tabla de decisión...");
		
		long startingTime = System.currentTimeMillis();
		exchange.setProperty("startingTime", startingTime);					
		
		Map<String, String> wf = new HashMap<String, String>();
		AntiFraudEsb trx = exchange.getIn().getBody(AntiFraudEsb.class);
		
		XMLGregorianCalendar fecNac = trx.getDatosCliente().getFechaNacimiento();
		XMLGregorianCalendar fecIns = trx.getViajeroFrecuente().getFechaInscripcion();
		
		XMLGregorianCalendar fecRegisTC = trx.getDatosTarjeta().getRegistrationDateTC();
		XMLGregorianCalendar fecChange = trx.getDatosVuelo().getChangeDate();
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd h:mm a z");
		df.setTimeZone(TimeZone.getTimeZone("GMT-6"));
		
		if(fecNac != null){
			Date fecNacDate = fecNac.toGregorianCalendar().getTime();
			String fecNacFormat = df.format(fecNacDate);
			fecNacFormat = fecNacFormat.replaceAll("AM", "a.m.");
			fecNacFormat = fecNacFormat.replaceAll("PM", "p.m.");
			exchange.setProperty("fecNac", fecNacFormat);
		}
		
		if(fecIns != null){
			Date fecInsDate = fecIns.toGregorianCalendar().getTime();
			String fecInsFormat = df.format(fecInsDate);
			fecInsFormat = fecInsFormat.replaceAll("AM", "a.m.");
			fecInsFormat = fecInsFormat.replaceAll("PM", "p.m.");
			exchange.setProperty("fecIns", fecInsFormat);
		}
		
		if(fecRegisTC != null){
			Date fecInsDate = fecRegisTC.toGregorianCalendar().getTime();
			String fecInsFormat = df.format(fecInsDate);
			fecInsFormat = fecInsFormat.replaceAll("AM", "a.m.");
			fecInsFormat = fecInsFormat.replaceAll("PM", "p.m.");
			exchange.setProperty("fecRegisTC", fecInsFormat);
		}
		
		if(fecChange != null){
			Date fecInsDate = fecRegisTC.toGregorianCalendar().getTime();
			String fecInsFormat = df.format(fecInsDate);
			fecInsFormat = fecInsFormat.replaceAll("AM", "a.m.");
			fecInsFormat = fecInsFormat.replaceAll("PM", "p.m.");
			exchange.setProperty("fecChange", fecInsFormat);
		}
		String canal = trx.getEncabezado().getCanal().toUpperCase();
		String tipoPerfil = trx.getEncabezado().getTipoPerfil().toUpperCase();
		String lineaNegocio = trx.getEncabezado().getLineaNegocio().toUpperCase();
		
		wf.put("canal", canal);
		wf.put("tipoPerfil", tipoPerfil);
		wf.put("lineaNegocio", lineaNegocio);
		
		exchange.setProperty("trx", trx);
		exchange.getIn().setBody(wf);
		
		LOG.debug("Se ha creado el mapa satisfactoriamente " + wf);
	}

}
