package com.avianca.esb.antifraude.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "segmentoVuelo", propOrder = {
    "clase",
    "destino",
    "fechaSalida",
    "fechaLlegada",
    "origen",
    "vuelo"
})
public class SegmentoVuelo {
	
	protected String clase;
	protected String destino;
	protected String fechaSalida;
	protected String fechaLlegada;
	protected String origen;
	protected String vuelo;
	
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public String getFechaLlegada() {
		return fechaLlegada;
	}
	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getVuelo() {
		return vuelo;
	}
	public void setVuelo(String vuelo) {
		this.vuelo = vuelo;
	}
	@Override
	public String toString() {
		return "SegmentoVuelo [clase=" + clase + ", destino=" + destino
				+ ", fechaSalida=" + fechaSalida + ", fechaLlegada="
				+ fechaLlegada + ", origen=" + origen + ", vuelo=" + vuelo
				+ "]";
	}
				
}

