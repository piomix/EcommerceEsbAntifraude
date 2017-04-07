package com.avianca.esb.antifraude.processors;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import javax.xml.soap.Detail;
import javax.xml.soap.DetailEntry;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPMessage;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.log4j.Logger;

public class SoapFaultHandler implements Processor{

	private static final Logger LOG = Logger.getLogger(SoapFaultHandler.class);

    @Override
    public void process(Exchange exchange) throws Exception 
    {   
        Exception ex = exchange.getProperty(Exchange.EXCEPTION_CAUGHT, Exception.class);
        // Se verifica el contenido de la exception.
        if (ex != null) 
        {
            exchange.getIn().setBody(createSOAPFaultServerError(ex));
        }
    }
    
    public static String createSOAPFaultServerError(final Exception cause) {
    String result = null;
    try
    {
        SOAPMessage message = MessageFactory.newInstance().createMessage();
        SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
        SOAPBody body = message.getSOAPBody();
        SOAPFault fault = body.addFault();
        fault.setFaultCode(cause.getClass().toString());
        fault.setFaultString("Ha ocurrido un error al procesar la transacción ");
        Detail detail = fault.addDetail();
        Name entryName = envelope.createName("esb-error");
        DetailEntry entry = detail.addDetailEntry(entryName);
        entry.addTextNode("El servidor no ha sido capaz de procesar la petición \n" + cause.toString());
        result = soapMessage2String(message);
        System.out.println("Ha ocurrido un error al procesar la transacción \n MENSAJE:" + result);
		
    } catch (Exception e) {
        LOG.error("Error Soap Fault Handler", e);
    }

    return result;
}

private static String soapMessage2String(final SOAPMessage message) throws SOAPException, IOException {
    String result = null;

    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
    message.writeTo(outStream);
    result = new String(outStream.toByteArray(), StandardCharsets.UTF_8);

    return result;
}

}
