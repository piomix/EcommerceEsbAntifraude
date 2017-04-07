package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "autorizacionTemporal", propOrder = {
    "parametro",
    "coincide"
})
public class AutorizacionTemporal {

	private String parametro;

	private String coincide;

	public String getParametro() {
		return parametro;
	}

	public void setParametro(String parametro) {
		this.parametro = parametro;
	}

	public String getCoincide() {
		return coincide;
	}

	public void setCoincide(String coincide) {
		this.coincide = coincide;
	}
}
