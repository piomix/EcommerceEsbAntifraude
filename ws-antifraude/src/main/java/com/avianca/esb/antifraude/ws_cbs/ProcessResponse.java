
package com.avianca.esb.antifraude.ws_cbs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AFSystemReturnCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LogTransactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MessageUniqueIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessResponse", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", propOrder = {
    "afSystemReturnCode",
    "description",
    "logTransactionNumber",
    "messageUniqueIdentifier",
    "result"
})
public class ProcessResponse {

    @XmlElementRef(name = "AFSystemReturnCode", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> afSystemReturnCode;
    @XmlElementRef(name = "Description", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "LogTransactionNumber", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> logTransactionNumber;
    @XmlElementRef(name = "MessageUniqueIdentifier", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageUniqueIdentifier;
    @XmlElementRef(name = "Result", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> result;

    /**
     * Gets the value of the afSystemReturnCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAFSystemReturnCode() {
        return afSystemReturnCode;
    }

    /**
     * Sets the value of the afSystemReturnCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAFSystemReturnCode(JAXBElement<String> value) {
        this.afSystemReturnCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the logTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLogTransactionNumber() {
        return logTransactionNumber;
    }

    /**
     * Sets the value of the logTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLogTransactionNumber(JAXBElement<String> value) {
        this.logTransactionNumber = value;
    }

    /**
     * Gets the value of the messageUniqueIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessageUniqueIdentifier() {
        return messageUniqueIdentifier;
    }

    /**
     * Sets the value of the messageUniqueIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessageUniqueIdentifier(JAXBElement<String> value) {
        this.messageUniqueIdentifier = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResult(JAXBElement<String> value) {
        this.result = value;
    }

}
