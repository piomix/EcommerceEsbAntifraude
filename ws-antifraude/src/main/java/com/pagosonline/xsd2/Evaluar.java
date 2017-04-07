package com.pagosonline.xsd2;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.camel.ExchangeProperty;
import org.apache.camel.Handler;
import org.apache.camel.Header;

@XmlRootElement(namespace="http://ws.maf.pagosonline.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluar", propOrder = { "arg0", "arg1", "arg2", "arg3" })
public class Evaluar implements Serializable {

	@XmlElement
	protected long arg0;
	@XmlElement
	protected String arg1;
	@XmlElement
	protected String arg2;
	@XmlElement
	protected String arg3;

	public Evaluar() {
	}

	@Handler
	public Evaluar factory(@Header("clientId") Long clientId, @Header("login") String login, 
							@Header("password") String password, @ExchangeProperty("xmlParam") String xmlParam) {
		this.setArg0(clientId);
		this.setArg1(login);
		this.setArg2(password);
		this.setArg3(xmlParam);
		return this;
	}

	/**
	 * Obtiene el valor de la propiedad arg0.
	 * 
	 */
	public long getArg0() {
		return arg0;
	}

	/**
	 * Define el valor de la propiedad arg0.
	 * 
	 */
	public void setArg0(long value) {
		this.arg0 = value;
	}

	/**
	 * Obtiene el valor de la propiedad arg1.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArg1() {
		return arg1;
	}

	/**
	 * Define el valor de la propiedad arg1.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArg1(String value) {
		this.arg1 = value;
	}

	/**
	 * Obtiene el valor de la propiedad arg2.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArg2() {
		return arg2;
	}

	/**
	 * Define el valor de la propiedad arg2.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArg2(String value) {
		this.arg2 = value;
	}

	/**
	 * Obtiene el valor de la propiedad arg3.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArg3() {
		return arg3;
	}

	/**
	 * Define el valor de la propiedad arg3.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArg3(String value) {
		this.arg3 = value;
	}

}
