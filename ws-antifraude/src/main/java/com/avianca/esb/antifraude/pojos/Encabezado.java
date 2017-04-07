package com.avianca.esb.antifraude.pojos;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "encabezado", propOrder = {
    "canal",
    "deviceFingerprint",
    "ip",
    "lineaNegocio",
    "tipoPerfil",
    "userAgent",
    "commerce",
    "riskValidationService",
    "phoneCallerID",
    "reference"
})

public class Encabezado implements Serializable{

    private static final long serialVersionUID = 1L;
	
	protected String canal;
    protected String deviceFingerprint;
    protected String ip;
    protected String lineaNegocio;
    protected String tipoPerfil;
    protected String userAgent;
    // para requerimiento flujo CCE
    protected String commerce;
   	protected String riskValidationService;
    protected String phoneCallerID;
    protected String reference;
    
	public String getCanal() {
		return canal;
	}
	public void setCanal(String canal) {
		this.canal = canal;
	}
	public String getDeviceFingerprint() {
		return deviceFingerprint;
	}
	public void setDeviceFingerprint(String deviceFingerprint) {
		this.deviceFingerprint = deviceFingerprint;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLineaNegocio() {
		return lineaNegocio;
	}
	public void setLineaNegocio(String lineaNegocio) {
		this.lineaNegocio = lineaNegocio;
	}
	public String getTipoPerfil() {
		return tipoPerfil;
	}
	public void setTipoPerfil(String tipoPerfil) {
		this.tipoPerfil = tipoPerfil;
	}
	public String getUserAgent() {
		return userAgent;
	}
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
	public String getCommerce() {
		return commerce;
	}
	public void setCommerce(String commerce) {
		this.commerce = commerce;
	}
	public String getRiskValidationService() {
		return riskValidationService;
	}
	public void setRiskValidationService(String riskValidationService) {
		this.riskValidationService = riskValidationService;
	}
	public String getPhoneCallerID() {
		return phoneCallerID;
	}
	public void setPhoneCallerID(String phoneCallerID) {
		this.phoneCallerID = phoneCallerID;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	@Override
	public String toString() {
		return "Encabezado [canal=" + canal + ", deviceFingerprint="
				+ deviceFingerprint + ", ip=" + ip + ", lineaNegocio="
				+ lineaNegocio + ", tipoPerfil=" + tipoPerfil + ", userAgent="
				+ userAgent + ", commerce=" + commerce
				+ ", riskValidationService=" + riskValidationService
				+ ", phoneCallerID=" + phoneCallerID + ", reference="
				+ reference + "]";
	}
}
