package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "evaluacion", propOrder = {
	    "alertas",
	    "acciones",
	    "transaccionId",
	    "bancoEmisor",
	    "direccionIpProxy",
	    "transaccionesSimilares",
	    "tiempoEvaluacion",
	    "analisisHeuristico",
	    "mensajeError",
	    "listasDeControl",
	    "codigoError",
	    "ubicacion",
	    "filtros"
	    
	})
public class Evaluacion {
	@XmlElement(name="alertas")
	private Alertas alertas;
	@XmlElement(name="acciones")
    private String acciones;
	@XmlElement(name="transaccion-id")
    private String transaccionId;
	@XmlElement(name="banco-emisor")
    private BancoEmisor bancoEmisor;
	@XmlElement(name="direccion-ip-proxy")
    private String direccionIpProxy;
	@XmlElement(name="transacciones-similares")
    private String transaccionesSimilares;
	@XmlElement(name="tiempo-evaluacion")
    private String tiempoEvaluacion;
	@XmlElement(name="analisis-heuristico")
    private AnalisisHeuristico analisisHeuristico;
	@XmlElement(name="mensaje-error")
    private String mensajeError;
	@XmlElement(name="listas-de-control")
    private ListasDeControl listasDeControl;
	@XmlElement(name="codigo-error")
    private String codigoError;
	@XmlElement(name="ubicacion")
    private Ubicacion ubicacion;
	@XmlElement(name="filtros")
    private String filtros;

    public Alertas getAlertas ()
    {
        return alertas;
    }

	public String getAcciones() {
		return acciones;
	}

	public void setAcciones(String acciones) {
		this.acciones = acciones;
	}

	public String getTransaccionId() {
		return transaccionId;
	}

	public void setTransaccionId(String transaccionId) {
		this.transaccionId = transaccionId;
	}

	public BancoEmisor getBancoEmisor() {
		return bancoEmisor;
	}

	public void setBancoEmisor(BancoEmisor bancoEmisor) {
		this.bancoEmisor = bancoEmisor;
	}

	public String getDireccionIpProxy() {
		return direccionIpProxy;
	}

	public void setDireccionIpProxy(String direccionIpProxy) {
		this.direccionIpProxy = direccionIpProxy;
	}

	public String getTransaccionesSimilares() {
		return transaccionesSimilares;
	}

	public void setTransaccionesSimilares(String transaccionesSimilares) {
		this.transaccionesSimilares = transaccionesSimilares;
	}

	public String getTiempoEvaluacion() {
		return tiempoEvaluacion;
	}

	public void setTiempoEvaluacion(String tiempoEvaluacion) {
		this.tiempoEvaluacion = tiempoEvaluacion;
	}

	public AnalisisHeuristico getAnalisisHeuristico() {
		return analisisHeuristico;
	}

	public void setAnalisisHeuristico(AnalisisHeuristico analisisHeuristico) {
		this.analisisHeuristico = analisisHeuristico;
	}

	public String getMensajeError() {
		return mensajeError;
	}

	public void setMensajeError(String mensajeError) {
		this.mensajeError = mensajeError;
	}

	public ListasDeControl getListasDeControl() {
		return listasDeControl;
	}

	public void setListasDeControl(ListasDeControl listasDeControl) {
		this.listasDeControl = listasDeControl;
	}

	public String getCodigoError() {
		return codigoError;
	}

	public void setCodigoError(String codigoError) {
		this.codigoError = codigoError;
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getFiltros() {
		return filtros;
	}

	public void setFiltros(String filtros) {
		this.filtros = filtros;
	}

	public void setAlertas(Alertas alertas) {
		this.alertas = alertas;
	}    
}
