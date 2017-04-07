
package com.avianca.esb.antifraude.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para viajeroFrecuente complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="viajeroFrecuente"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidadMillas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="categoria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codLifemiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="docViajeroFrecuente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaInscripcion" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="millasAcumuladas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="saldoMillas" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipoTransaccionLM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="viajeroFrecuenteCreado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "viajeroFrecuente", propOrder = {
    "cantidadMillas",
    "categoria",
    "codLifemiles",
    "docViajeroFrecuente",
    "eventDate",
    "fechaInscripcion",
    "millasAcumuladas",
    "saldoMillas",
    "tipoTransaccionLM",
    "viajeroFrecuenteCreado"
})
public class ViajeroFrecuente {

    protected Integer cantidadMillas;
    protected String categoria;
    protected String codLifemiles;
    protected String docViajeroFrecuente;
    protected String eventDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaInscripcion;
    protected Integer millasAcumuladas;
    protected Integer saldoMillas;
    protected String tipoTransaccionLM;
    protected String viajeroFrecuenteCreado;

    /**
     * Obtiene el valor de la propiedad cantidadMillas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidadMillas() {
        return cantidadMillas;
    }

    /**
     * Define el valor de la propiedad cantidadMillas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidadMillas(Integer value) {
        this.cantidadMillas = value;
    }

    /**
     * Obtiene el valor de la propiedad categoria.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Define el valor de la propiedad categoria.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoria(String value) {
        this.categoria = value;
    }

    /**
     * Obtiene el valor de la propiedad codLifemiles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodLifemiles() {
        return codLifemiles;
    }

    /**
     * Define el valor de la propiedad codLifemiles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodLifemiles(String value) {
        this.codLifemiles = value;
    }

    /**
     * Obtiene el valor de la propiedad docViajeroFrecuente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocViajeroFrecuente() {
        return docViajeroFrecuente;
    }

    /**
     * Define el valor de la propiedad docViajeroFrecuente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocViajeroFrecuente(String value) {
        this.docViajeroFrecuente = value;
    }

    /**
     * Obtiene el valor de la propiedad eventDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDate() {
        return eventDate;
    }

    /**
     * Define el valor de la propiedad eventDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDate(String value) {
        this.eventDate = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInscripcion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaInscripcion() {
        return fechaInscripcion;
    }

    /**
     * Define el valor de la propiedad fechaInscripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaInscripcion(XMLGregorianCalendar value) {
        this.fechaInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad millasAcumuladas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMillasAcumuladas() {
        return millasAcumuladas;
    }

    /**
     * Define el valor de la propiedad millasAcumuladas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMillasAcumuladas(Integer value) {
        this.millasAcumuladas = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoMillas.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSaldoMillas() {
        return saldoMillas;
    }

    /**
     * Define el valor de la propiedad saldoMillas.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSaldoMillas(Integer value) {
        this.saldoMillas = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoTransaccionLM.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoTransaccionLM() {
        return tipoTransaccionLM;
    }

    /**
     * Define el valor de la propiedad tipoTransaccionLM.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoTransaccionLM(String value) {
        this.tipoTransaccionLM = value;
    }

    /**
     * Obtiene el valor de la propiedad viajeroFrecuenteCreado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViajeroFrecuenteCreado() {
        return viajeroFrecuenteCreado;
    }

    /**
     * Define el valor de la propiedad viajeroFrecuenteCreado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViajeroFrecuenteCreado(String value) {
        this.viajeroFrecuenteCreado = value;
    }

	@Override
	public String toString() {
		return "ViajeroFrecuente [cantidadMillas=" + cantidadMillas
				+ ", categoria=" + categoria + ", codLifemiles=" + codLifemiles
				+ ", docViajeroFrecuente=" + docViajeroFrecuente
				+ ", eventDate=" + eventDate + ", fechaInscripcion="
				+ fechaInscripcion + ", millasAcumuladas=" + millasAcumuladas
				+ ", saldoMillas=" + saldoMillas + ", tipoTransaccionLM="
				+ tipoTransaccionLM + ", viajeroFrecuenteCreado="
				+ viajeroFrecuenteCreado + "]";
	}

    
}
