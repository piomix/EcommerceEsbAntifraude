
package com.avianca.esb.antifraude.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Clase Java para vuelo complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="vuelo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="oficinaReserva" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="pnr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoViaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="from" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="to" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="airlinecode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passengerTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmentoVuelo" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}segmentoVuelo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vuelo", propOrder = { "oficinaReserva", "pnr", "tipoViaje", "passengerCount", "from", "to",
		"airlinecode", "passengerTotalAmount", "paisOficinaReserva", "path", "changeDate", "duration", "fareBasis",
		"dayOfWeek", "weekOfYear", "segmentoVuelo" })
public class Vuelo {

	protected String oficinaReserva;
	protected String pnr;
	protected String tipoViaje;
	protected Integer passengerCount;
	protected String from;
	protected String to;
	protected String airlinecode;
	protected String passengerTotalAmount;
	protected String paisOficinaReserva;
	// para requerimiento flujo CCE
	protected String path;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar changeDate;
	protected String duration;
	protected String fareBasis;
	protected String dayOfWeek;
	protected String weekOfYear;
	protected List<SegmentoVuelo> segmentoVuelo;

	public Vuelo() {
	}

	public String getOficinaReserva() {
		return oficinaReserva;
	}

	public void setOficinaReserva(String oficinaReserva) {
		this.oficinaReserva = oficinaReserva;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTipoViaje() {
		return tipoViaje;
	}

	public void setTipoViaje(String tipoViaje) {
		this.tipoViaje = tipoViaje;
	}

	public Integer getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(Integer passengerCount) {
		this.passengerCount = passengerCount;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAirlinecode() {
		return airlinecode;
	}

	public void setAirlinecode(String airlinecode) {
		this.airlinecode = airlinecode;
	}

	public String getPassengerTotalAmount() {
		return passengerTotalAmount;
	}

	public void setPassengerTotalAmount(String passengerTotalAmount) {
		this.passengerTotalAmount = passengerTotalAmount;
	}

	public String getPaisOficinaReserva() {
		return paisOficinaReserva;
	}

	public void setPaisOficinaReserva(String paisOficinaReserva) {
		this.paisOficinaReserva = paisOficinaReserva;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public XMLGregorianCalendar getChangeDate() {
		return changeDate;
	}

	public void setChangeDate(XMLGregorianCalendar changeDate) {
		this.changeDate = changeDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFareBasis() {
		return fareBasis;
	}

	public void setFareBasis(String fareBasis) {
		this.fareBasis = fareBasis;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	public String getWeekOfYear() {
		return weekOfYear;
	}

	public void setWeekOfYear(String weekOfYear) {
		this.weekOfYear = weekOfYear;
	}

	public List<SegmentoVuelo> getSegmentoVuelo() {
		if (this.segmentoVuelo == null) {
			this.segmentoVuelo = new ArrayList<>();
		}
		return segmentoVuelo;
	}

	public void addSegmentoVuelo(SegmentoVuelo segmentoVuelo) {
		if (this.segmentoVuelo == null) {
			this.segmentoVuelo = new ArrayList<>();
		}
		this.segmentoVuelo.add(segmentoVuelo);
	}

	public void setSegmentoVuelo(List<SegmentoVuelo> segmentoVuelo) {
		this.segmentoVuelo = segmentoVuelo;
	}

	@Override
	public String toString() {
		return "Vuelo [oficinaReserva=" + oficinaReserva + ", pnr=" + pnr + ", tipoViaje=" + tipoViaje
				+ ", passengerCount=" + passengerCount + ", from=" + from + ", to=" + to + ", airlinecode="
				+ airlinecode + ", passengerTotalAmount=" + passengerTotalAmount + ", paisOficinaReserva="
				+ paisOficinaReserva + ", path=" + path + ", changeDate=" + changeDate + ", duration=" + duration
				+ ", fareBasis=" + fareBasis + ", dayOfWeek=" + dayOfWeek + ", weekOfYear=" + weekOfYear
				+ ", segmentoVuelo=" + segmentoVuelo + "]";
	}

}
