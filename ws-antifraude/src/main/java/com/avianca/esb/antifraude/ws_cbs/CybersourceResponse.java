
package com.avianca.esb.antifraude.ws_cbs;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CybersourceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CybersourceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AfsReplyReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Decision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReplyCyberFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestCyberFinal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResponseTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CybersourceResponse", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", propOrder = {
    "afsReplyReasonCode",
    "decision",
    "reasonCode",
    "replyCyberFinal",
    "requestCyberFinal",
    "requestId",
    "requestToken",
    "responseTime"
})
public class CybersourceResponse {

    @XmlElementRef(name = "AfsReplyReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> afsReplyReasonCode;
    @XmlElementRef(name = "Decision", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> decision;
    @XmlElementRef(name = "ReasonCode", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonCode;
    @XmlElementRef(name = "ReplyCyberFinal", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> replyCyberFinal;
    @XmlElementRef(name = "RequestCyberFinal", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestCyberFinal;
    @XmlElementRef(name = "RequestId", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestId;
    @XmlElementRef(name = "RequestToken", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> requestToken;
    @XmlElementRef(name = "ResponseTime", namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", type = JAXBElement.class, required = false)
    protected JAXBElement<String> responseTime;

    /**
     * Gets the value of the afsReplyReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAfsReplyReasonCode() {
        return afsReplyReasonCode;
    }

    /**
     * Sets the value of the afsReplyReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAfsReplyReasonCode(JAXBElement<String> value) {
        this.afsReplyReasonCode = value;
    }

    /**
     * Gets the value of the decision property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDecision() {
        return decision;
    }

    /**
     * Sets the value of the decision property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDecision(JAXBElement<String> value) {
        this.decision = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<String> value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the replyCyberFinal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReplyCyberFinal() {
        return replyCyberFinal;
    }

    /**
     * Sets the value of the replyCyberFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReplyCyberFinal(JAXBElement<String> value) {
        this.replyCyberFinal = value;
    }

    /**
     * Gets the value of the requestCyberFinal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestCyberFinal() {
        return requestCyberFinal;
    }

    /**
     * Sets the value of the requestCyberFinal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestCyberFinal(JAXBElement<String> value) {
        this.requestCyberFinal = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<String> value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the requestToken property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRequestToken() {
        return requestToken;
    }

    /**
     * Sets the value of the requestToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRequestToken(JAXBElement<String> value) {
        this.requestToken = value;
    }

    /**
     * Gets the value of the responseTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResponseTime() {
        return responseTime;
    }

    /**
     * Sets the value of the responseTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResponseTime(JAXBElement<String> value) {
        this.responseTime = value;
    }

}
