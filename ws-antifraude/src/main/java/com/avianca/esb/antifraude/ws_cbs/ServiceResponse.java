
package com.avianca.esb.antifraude.ws_cbs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="FullXml" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Respuesta" type="{http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO}ProcessResponse" minOccurs="0"/>
 *         &lt;element name="RespuestaCybersource" type="{http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO}CybersourceResponse" minOccurs="0"/>
 *         &lt;element name="XmlInput" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="XmlMiddelWare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xmlCybersource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponse", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", propOrder = {
    "errorCount",
    "fullXml",
    "respuesta",
    "respuestaCybersource",
    "xmlInput",
    "xmlMiddelWare",
    "xmlCybersource"
})
public class ServiceResponse {

    @XmlElement(name = "ErrorCount")
    protected Integer errorCount;
    @XmlElementRef(name = "FullXml", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fullXml;
    @XmlElementRef(name = "Respuesta", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<ProcessResponse> respuesta;
    @XmlElementRef(name = "RespuestaCybersource", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<CybersourceResponse> respuestaCybersource;
    @XmlElementRef(name = "XmlInput", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmlInput;
    @XmlElementRef(name = "XmlMiddelWare", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmlMiddelWare;
    @XmlElementRef(name = "xmlCybersource", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmlCybersource;

    /**
     * Gets the value of the errorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * Sets the value of the errorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCount(Integer value) {
        this.errorCount = value;
    }

    /**
     * Gets the value of the fullXml property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFullXml() {
        return fullXml;
    }

    /**
     * Sets the value of the fullXml property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFullXml(JAXBElement<String> value) {
        this.fullXml = value;
    }

    /**
     * Gets the value of the respuesta property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}
     *     
     */
    public JAXBElement<ProcessResponse> getRespuesta() {
        return respuesta;
    }

    /**
     * Sets the value of the respuesta property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}
     *     
     */
    public void setRespuesta(JAXBElement<ProcessResponse> value) {
        this.respuesta = value;
    }

    /**
     * Gets the value of the respuestaCybersource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CybersourceResponse }{@code >}
     *     
     */
    public JAXBElement<CybersourceResponse> getRespuestaCybersource() {
        return respuestaCybersource;
    }

    /**
     * Sets the value of the respuestaCybersource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CybersourceResponse }{@code >}
     *     
     */
    public void setRespuestaCybersource(JAXBElement<CybersourceResponse> value) {
        this.respuestaCybersource = value;
    }

    /**
     * Gets the value of the xmlInput property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlInput() {
        return xmlInput;
    }

    /**
     * Sets the value of the xmlInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlInput(JAXBElement<String> value) {
        this.xmlInput = value;
    }

    /**
     * Gets the value of the xmlMiddelWare property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlMiddelWare() {
        return xmlMiddelWare;
    }

    /**
     * Sets the value of the xmlMiddelWare property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlMiddelWare(JAXBElement<String> value) {
        this.xmlMiddelWare = value;
    }

    /**
     * Gets the value of the xmlCybersource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlCybersource() {
        return xmlCybersource;
    }

    /**
     * Sets the value of the xmlCybersource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlCybersource(JAXBElement<String> value) {
        this.xmlCybersource = value;
    }

}
