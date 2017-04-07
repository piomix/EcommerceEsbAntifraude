/**
 * 
 */
package com.avianca.esb.antifraude.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBException;

import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.avianca.esb.antifraude.pojos.AntiFraudEsb;
import com.avianca.esb.antifraude.pojos.Encabezado;

/**
 * @author halvarenga
 *
 */
public class WsAntifraudeTest extends CamelSpringTestSupport{
	Charset UNICODE_CHARSET = Charset.forName("UTF-8");
	final File resourcesDirectory = new File("src/test/resources");
	AntiFraudEsb trx;

	@Override
	protected AbstractApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("ws-antifraude-test.xml");
	}
	
	@Before
	public void init() throws FileNotFoundException, JAXBException {
		trx = new AntiFraudEsb();
		Encabezado encabezado = new Encabezado();
		encabezado.setCanal("COM");
		encabezado.setLineaNegocio("LUKAS");
		encabezado.setTipoPerfil("AvCom");
		trx.setEncabezado(encabezado);
	}
	
	@Test
	public void elegirFlujoTest() throws Exception {
		MockEndpoint droolsMock = getMockEndpoint("mock:droolsFlujo");
		
		Map<String, String> mapaWorkflow = new HashMap<String, String>();
		mapaWorkflow.put("canal", "WEB");
		mapaWorkflow.put("lineaNegocio", "MILLAS");
		mapaWorkflow.put("tipoPerfil", "AVIANCACOM");
		
		droolsMock.expectedBodiesReceived(mapaWorkflow);
		
		template.requestBody("direct:escogerFlujoTest", readFile(resourcesDirectory.getAbsolutePath()+"/examples/canalwebmillas.xml", UNICODE_CHARSET));
		
		assertMockEndpointsSatisfied();
	}
	
	@Test
	public void consumirServicioMAFCanalCOMTest() throws Exception {
		MockEndpoint mock = getMockEndpoint("mock:serviceCBSEndpoint");
		String readFile = readFile(resourcesDirectory.getAbsolutePath()+"/examples/RedencionCBS.xml", UNICODE_CHARSET);
		
		mock.expectedBodiesReceived(readFile);
		
		Map<String, Object> headers = new HashMap<String, Object>();
		headers.put("workflow", "4");
		headers.put("usuario", "ESBAvcom");
		headers.put("template", "templates/AvCom.vm");
		
		template.requestBodyAndHeaders("direct:ValidationAFCanalCom", trx, headers);
		
		assertMockEndpointsSatisfied();
	}

	private String readFile(String path, Charset encoding) throws IOException{
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

}
