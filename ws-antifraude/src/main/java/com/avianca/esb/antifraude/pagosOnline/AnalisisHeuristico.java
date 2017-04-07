package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "analisisHeuristico", propOrder = {
    "puntajeEmail",
    "puntaje"
})
public class AnalisisHeuristico {

	private String puntajeEmail;

	private String puntaje;

	/**
	 * @return the puntajeEmail
	 */
	public String getPuntajeEmail() {
		return puntajeEmail;
	}

	/**
	 * @param puntajeEmail
	 *            the puntajeEmail to set
	 */
	public void setPuntajeEmail(String puntajeEmail) {
		this.puntajeEmail = puntajeEmail;
	}

	/**
	 * @return the puntaje
	 */
	public String getPuntaje() {
		return puntaje;
	}

	/**
	 * @param puntaje
	 *            the puntaje to set
	 */
	public void setPuntaje(String puntaje) {
		this.puntaje = puntaje;
	}

}
