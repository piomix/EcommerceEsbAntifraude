package com.avianca.esb.antifraude.pojos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

	private final static QName _AntiFraudEsb_QNAME = new QName("urn:com.avianca.esb.antifraude:ws-antifraude:1.0", "antiFraudEsb");
	private final static QName _ResultadoFraude_QNAME = new QName("urn:com.avianca.esb.antifraude:ws-antifraude:1.0", "resultadoFraude");

	public ObjectFactory() {
	}

	public AntiFraudEsb createAntiFraudEsb() {
		return new AntiFraudEsb();
	}

	public ResultadoFraude createResultadoFraude() {
		return new ResultadoFraude();
	}

	public Encabezado createEncabezado() {
		return new Encabezado();
	}

	public Cliente createCliente() {
		return new Cliente();
	}
	
	public Compra createCompra() {
		return new Compra();
	}
	
	public Vuelo createVuelo() {
		return new Vuelo();
	}
	
	public TarjetaCredito createTarjetaCredito() {
		return new TarjetaCredito();
	}
	
	public ViajeroFrecuente createViajeroFrecuente() {
		return new ViajeroFrecuente();
	}
	
	public DatosPassenger createDatosPassenger() {
		return new DatosPassenger();
	}
	
	
	@XmlElementDecl(namespace = "urn:com.avianca.esb.antifraude:ws-antifraude:1.0", name = "antiFraudEsb")
	public JAXBElement<AntiFraudEsb> createAntiFraudEsb(AntiFraudEsb value) {
		return new JAXBElement<AntiFraudEsb>(_AntiFraudEsb_QNAME,
				AntiFraudEsb.class, null, value);
	}

	@XmlElementDecl(namespace = "urn:com.avianca.esb.antifraude:ws-antifraude:1.0", name = "resultadoFraude")
	public JAXBElement<ResultadoFraude> createResultadoFraude(
			ResultadoFraude value) {
		return new JAXBElement<ResultadoFraude>(_ResultadoFraude_QNAME,
				ResultadoFraude.class, null, value);
	}

}
