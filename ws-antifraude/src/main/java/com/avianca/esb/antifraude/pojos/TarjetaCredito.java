
package com.avianca.esb.antifraude.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Clase Java para tarjetaCredito complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tarjetaCredito"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anioVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ciudadTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codPostalTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion2TH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mesVencimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numDocumentoTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numTarjeta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paisTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoDocumentoTH" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="issuingBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tarjetaCredito", propOrder = {
    "anioVencimiento",
    "apellidoTH",
    "bin",
    "ciudadTH",
    "codPostalTH",
    "direccion2TH",
    "direccionTH",
    "estadoTH",
    "mesVencimiento",
    "nombreTH",
    "numDocumentoTH",
    "numTarjeta",
    "paisTH",
    "telefonoTH",
    "tipoDocumentoTH",
    "franquicia",
    "cvv",
    "issuingBank",
    "registrationDateTC"

})
public class TarjetaCredito {

    protected String anioVencimiento;
    protected String apellidoTH;
    protected String bin;
    protected String ciudadTH;
    protected String codPostalTH;
    protected String direccion2TH;
    protected String direccionTH;
    protected String estadoTH;
    protected String mesVencimiento;
    protected String nombreTH;
    protected String numDocumentoTH;
    protected String numTarjeta;
    protected String paisTH;
    protected String telefonoTH;
    protected String tipoDocumentoTH;
    protected String franquicia;
    protected String cvv;
    // para requerimiento flujo CCE
    protected String issuingBank;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationDateTC;
    
	public String getAnioVencimiento() {
		return anioVencimiento;
	}

	public void setAnioVencimiento(String anioVencimiento) {
		this.anioVencimiento = anioVencimiento;
	}

	public String getApellidoTH() {
		return apellidoTH;
	}

	public void setApellidoTH(String apellidoTH) {
		this.apellidoTH = apellidoTH;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getCiudadTH() {
		return ciudadTH;
	}

	public void setCiudadTH(String ciudadTH) {
		this.ciudadTH = ciudadTH;
	}

	public String getCodPostalTH() {
		return codPostalTH;
	}

	public void setCodPostalTH(String codPostalTH) {
		this.codPostalTH = codPostalTH;
	}

	public String getDireccion2TH() {
		return direccion2TH;
	}

	public void setDireccion2TH(String direccion2th) {
		direccion2TH = direccion2th;
	}

	public String getDireccionTH() {
		return direccionTH;
	}

	public void setDireccionTH(String direccionTH) {
		this.direccionTH = direccionTH;
	}

	public String getEstadoTH() {
		return estadoTH;
	}

	public void setEstadoTH(String estadoTH) {
		this.estadoTH = estadoTH;
	}

	public String getMesVencimiento() {
		return mesVencimiento;
	}

	public void setMesVencimiento(String mesVencimiento) {
		this.mesVencimiento = mesVencimiento;
	}

	public String getNombreTH() {
		return nombreTH;
	}

	public void setNombreTH(String nombreTH) {
		this.nombreTH = nombreTH;
	}

	public String getNumDocumentoTH() {
		return numDocumentoTH;
	}

	public void setNumDocumentoTH(String numDocumentoTH) {
		this.numDocumentoTH = numDocumentoTH;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getPaisTH() {
		return paisTH;
	}

	public void setPaisTH(String paisTH) {
		this.paisTH = paisTH;
	}

	public String getTelefonoTH() {
		return telefonoTH;
	}

	public void setTelefonoTH(String telefonoTH) {
		this.telefonoTH = telefonoTH;
	}

	public String getTipoDocumentoTH() {
		return tipoDocumentoTH;
	}

	public void setTipoDocumentoTH(String tipoDocumentoTH) {
		this.tipoDocumentoTH = tipoDocumentoTH;
	}

	public String getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getIssuingBank() {
		return issuingBank;
	}

	public void setIssuingBank(String issuingBank) {
		this.issuingBank = issuingBank;
	}

	public XMLGregorianCalendar getRegistrationDateTC() {
		return registrationDateTC;
	}

	public void setRegistrationDateTC(XMLGregorianCalendar registrationDateTC) {
		this.registrationDateTC = registrationDateTC;
	}

	@Override
	public String toString() {
		return "TarjetaCredito [anioVencimiento=" + anioVencimiento
				+ ", apellidoTH=" + apellidoTH + ", bin=" + bin + ", ciudadTH="
				+ ciudadTH + ", codPostalTH=" + codPostalTH + ", direccion2TH="
				+ direccion2TH + ", direccionTH=" + direccionTH + ", estadoTH="
				+ estadoTH + ", mesVencimiento=" + mesVencimiento
				+ ", nombreTH=" + nombreTH + ", numDocumentoTH="
				+ numDocumentoTH + ", numTarjeta=" + numTarjeta + ", paisTH="
				+ paisTH + ", telefonoTH=" + telefonoTH + ", tipoDocumentoTH="
				+ tipoDocumentoTH + ", franquicia=" + franquicia + ", cvv="
				+ cvv + ", issuingBank=" + issuingBank
				+ ", registrationDateTC=" + registrationDateTC + "]";
	}
	
    
}
