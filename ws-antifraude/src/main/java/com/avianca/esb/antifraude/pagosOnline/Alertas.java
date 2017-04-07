package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "alertas", propOrder = {
    "alerta"
})
public class Alertas {

	private String[] alerta;

	public String[] getAlerta() {
		return alerta;
	}

	public void setAlerta(String[] alerta) {
		this.alerta = alerta;
	}
}
