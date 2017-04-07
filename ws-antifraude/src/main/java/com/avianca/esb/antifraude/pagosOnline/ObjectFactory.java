package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

	public ObjectFactory() {
	}

	public Alertas createAlertas() {
		return new Alertas();
	}

	public AnalisisHeuristico createAnalisisHeuristico() {
		return new AnalisisHeuristico();
	}

	public AutorizacionTemporal createAutorizacionTemporal() {
		return new AutorizacionTemporal();
	}

	public BancoEmisor createBancoEmisor() {
		return new BancoEmisor();
	}

	public Evaluacion createEvaluacion() {
		return new Evaluacion();
	}

	public ListaBlanca createListaBlanca() {
		return new ListaBlanca();
	}

	public ListaNegra createListaNegra() {
		return new ListaNegra();
	}

	public ListasDeControl createListasDeControl() {
		return new ListasDeControl();
	}

	public Respuesta createRespuesta() {
		return new Respuesta();
	}

}
