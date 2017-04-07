package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuesta", propOrder = {
		"fecha",
		"codigoRespuesta",
		"mensajeError",
		"codigoError",
		"respuestaMafPrevalidacion"
		})
public class Respuesta {
	@XmlElement(name="fecha")
	private String fecha;
	@XmlElement(name="codigo-respuesta")
	private String codigoRespuesta;
	@XmlElement(name="mensaje-error")
	private String mensajeError;
	@XmlElement(name="codigo-error")
	private String codigoError;
	@XmlElement(name="respuesta-maf-prevalidacion")
	private RespuestaMafPrevalidacion respuestaMafPrevalidacion;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}

	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	/**
	 * @return the respuestaMafPrevalidacion
	 */
	public RespuestaMafPrevalidacion getRespuestaMafPrevalidacion() {
		return respuestaMafPrevalidacion;
	}

	/**
	 * @param respuestaMafPrevalidacion
	 *            the respuestaMafPrevalidacion to set
	 */
	public void setRespuestaMafPrevalidacion(
			RespuestaMafPrevalidacion respuestaMafPrevalidacion) {
		this.respuestaMafPrevalidacion = respuestaMafPrevalidacion;
	}

}
