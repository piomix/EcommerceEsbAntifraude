
package com.avianca.esb.antifraude.pojos;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "compra", propOrder = {
    "compraBoleto",
    "cuotas",
    "hotel",
    "montoTotal",
    "pais",
    "tipoMoneda",
    "eventDate",
    "corpCod",
    "corpName",
    "corpStatus",
    "thirdPartyBooking",
    "travelInsurance",
    "additionalCharges",
    "duration",
    "copypasteTC",
    "copypasteNameTH",
    "copypasteBank",
    "copypasteCVV",
    "copypasteEmail",
    "flexible",
    "languaje",
    "idTransaccion",
    "gapRegistrationTCandBuy",
    "agent",
    "descriptionAncillary",
    "containsAncillary"
})
public class Compra {

    protected String compraBoleto;
    protected Integer cuotas;
    protected String hotel;
    protected BigDecimal montoTotal;
    protected String pais;
    protected String tipoMoneda;
    protected String eventDate;
    protected String corpCod;
    protected String corpName;
    protected String corpStatus;
    protected String thirdPartyBooking;
    protected String travelInsurance;
    protected String additionalCharges;
    protected String duration;
    protected String copypasteTC;
    protected String copypasteNameTH;
    protected String copypasteBank;
    protected String copypasteCVV;
    protected String copypasteEmail;
    protected String flexible;
    protected String languaje;
    protected String idTransaccion;
    // para requerimiento flujo CCE
    protected String gapRegistrationTCandBuy;
    protected String agent;
    protected String descriptionAncillary;
    protected String containsAncillary;
	public String getCompraBoleto() {
		return compraBoleto;
	}
	public void setCompraBoleto(String compraBoleto) {
		this.compraBoleto = compraBoleto;
	}
	public Integer getCuotas() {
		return cuotas;
	}
	public void setCuotas(Integer cuotas) {
		this.cuotas = cuotas;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public BigDecimal getMontoTotal() {
		return montoTotal;
	}
	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getTipoMoneda() {
		return tipoMoneda;
	}
	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	public String getEventDate() {
		return eventDate;
	}
	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
	}
	public String getCorpCod() {
		return corpCod;
	}
	public void setCorpCod(String corpCod) {
		this.corpCod = corpCod;
	}
	public String getCorpName() {
		return corpName;
	}
	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}
	public String getCorpStatus() {
		return corpStatus;
	}
	public void setCorpStatus(String corpStatus) {
		this.corpStatus = corpStatus;
	}
	public String getThirdPartyBooking() {
		return thirdPartyBooking;
	}
	public void setThirdPartyBooking(String thirdPartyBooking) {
		this.thirdPartyBooking = thirdPartyBooking;
	}
	public String getTravelInsurance() {
		return travelInsurance;
	}
	public void setTravelInsurance(String travelInsurance) {
		this.travelInsurance = travelInsurance;
	}
	public String getAdditionalCharges() {
		return additionalCharges;
	}
	public void setAdditionalCharges(String additionalCharges) {
		this.additionalCharges = additionalCharges;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getCopypasteTC() {
		return copypasteTC;
	}
	public void setCopypasteTC(String copypasteTC) {
		this.copypasteTC = copypasteTC;
	}
	public String getCopypasteNameTH() {
		return copypasteNameTH;
	}
	public void setCopypasteNameTH(String copypasteNameTH) {
		this.copypasteNameTH = copypasteNameTH;
	}
	public String getCopypasteBank() {
		return copypasteBank;
	}
	public void setCopypasteBank(String copypasteBank) {
		this.copypasteBank = copypasteBank;
	}
	public String getCopypasteCVV() {
		return copypasteCVV;
	}
	public void setCopypasteCVV(String copypasteCVV) {
		this.copypasteCVV = copypasteCVV;
	}
	public String getCopypasteEmail() {
		return copypasteEmail;
	}
	public void setCopypasteEmail(String copypasteEmail) {
		this.copypasteEmail = copypasteEmail;
	}
	public String getFlexible() {
		return flexible;
	}
	public void setFlexible(String flexible) {
		this.flexible = flexible;
	}
	public String getLanguaje() {
		return languaje;
	}
	public void setLanguaje(String languaje) {
		this.languaje = languaje;
	}
	public String getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(String idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public String getGapRegistrationTCandBuy() {
		return gapRegistrationTCandBuy;
	}
	public void setGapRegistrationTCandBuy(String gapRegistrationTCandBuy) {
		this.gapRegistrationTCandBuy = gapRegistrationTCandBuy;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getDescriptionAncillary() {
		return descriptionAncillary;
	}
	public void setDescriptionAncillary(String descriptionAncillary) {
		this.descriptionAncillary = descriptionAncillary;
	}
	public String getContainsAncillary() {
		return containsAncillary;
	}
	public void setContainsAncillary(String containsAncillary) {
		this.containsAncillary = containsAncillary;
	}
	@Override
	public String toString() {
		return "Compra [compraBoleto=" + compraBoleto + ", cuotas=" + cuotas
				+ ", hotel=" + hotel + ", montoTotal=" + montoTotal + ", pais="
				+ pais + ", tipoMoneda=" + tipoMoneda + ", eventDate="
				+ eventDate + ", corpCod=" + corpCod + ", corpName=" + corpName
				+ ", corpStatus=" + corpStatus + ", thirdPartyBooking="
				+ thirdPartyBooking + ", travelInsurance=" + travelInsurance
				+ ", additionalCharges=" + additionalCharges + ", duration="
				+ duration + ", copypasteTC=" + copypasteTC
				+ ", copypasteNameTH=" + copypasteNameTH + ", copypasteBank="
				+ copypasteBank + ", copypasteCVV=" + copypasteCVV
				+ ", copypasteEmail=" + copypasteEmail + ", flexible="
				+ flexible + ", languaje=" + languaje + ", idTransaccion="
				+ idTransaccion + ", gapRegistrationTCandBuy="
				+ gapRegistrationTCandBuy + ", agent=" + agent
				+ ", descriptionAncillary=" + descriptionAncillary
				+ ", containsAncillary=" + containsAncillary + "]";
	}
    
    

}
