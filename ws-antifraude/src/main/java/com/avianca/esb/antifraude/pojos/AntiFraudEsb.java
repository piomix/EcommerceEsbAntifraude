package com.avianca.esb.antifraude.pojos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Clase Java para antiFraudEsb complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="antiFraudEsb"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="encabezado" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}encabezado"/&gt;
 *         &lt;element name="datosCliente" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}cliente"/&gt;
 *         &lt;element name="datosCompra" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}compra"/&gt;
 *         &lt;element name="datosTarjeta" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}tarjetaCredito"/&gt;
 *         &lt;element name="datosVuelo" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}vuelo" minOccurs="0"/&gt;
 *         &lt;element name="viajeroFrecuente" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}viajeroFrecuente" minOccurs="0"/&gt;
 *         &lt;element name="datosPassenger" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}datosPassenger" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "antiFraudEsb", propOrder = { 
		"encabezado", 
		"datosCliente", 
		"datosCompra",
		"datosTarjeta", 
		"datosVuelo", 
		"viajeroFrecuente", 
		"datosPassenger"
	}
)

public class AntiFraudEsb implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@XmlElement(required = true)
	protected Encabezado encabezado;
	@XmlElement(required = true)
	protected Cliente datosCliente;
	@XmlElement(required = true)
	protected Compra datosCompra;
	@XmlElement(required = true)
	protected TarjetaCredito datosTarjeta;	
	@XmlElement(required = true)
	protected Vuelo datosVuelo;	
	@XmlElement(required = true)
	protected ViajeroFrecuente viajeroFrecuente;	
	@XmlElement(required = true)
	protected DatosPassenger datosPassenger;
	
	public Encabezado getEncabezado() {
		return encabezado;
	}

	public void setEncabezado(Encabezado value) {
		this.encabezado = value;
	}
	
	public Cliente getDatosCliente() {
		return datosCliente;
	}

	public void setDatosCliente(Cliente datosCliente) {
		this.datosCliente = datosCliente;
	}

	public Compra getDatosCompra() {
		return datosCompra;
	}

	public void setDatosCompra(Compra datosCompra) {
		this.datosCompra = datosCompra;
	}

	public Vuelo getDatosVuelo() {
		return datosVuelo;
	}

	public void setDatosVuelo(Vuelo datosVuelo) {
		this.datosVuelo = datosVuelo;
	}

	public TarjetaCredito getDatosTarjeta() {
		return datosTarjeta;
	}

	public void setDatosTarjeta(TarjetaCredito datosTarjeta) {
		this.datosTarjeta = datosTarjeta;
	}

	public ViajeroFrecuente getViajeroFrecuente() {
		return viajeroFrecuente;
	}

	public void setViajeroFrecuente(ViajeroFrecuente viajeroFrecuente) {
		this.viajeroFrecuente = viajeroFrecuente;
	}

	public DatosPassenger getDatosPassenger() {
		return datosPassenger;
	}

	public void setDatosPassenger(DatosPassenger datosPassenger) {
		this.datosPassenger = datosPassenger;
	}

	@Override
	public String toString() {
		return "AntiFraudEsb [encabezado=" + encabezado + ", datosCliente="
				+ datosCliente + ", datosCompra=" + datosCompra
				+ ", datosTarjeta=" + datosTarjeta + ", datosVuelo="
				+ datosVuelo + ", viajeroFrecuente=" + viajeroFrecuente
				+ ", datosPassenger=" + datosPassenger + "]";
	}
	
}
