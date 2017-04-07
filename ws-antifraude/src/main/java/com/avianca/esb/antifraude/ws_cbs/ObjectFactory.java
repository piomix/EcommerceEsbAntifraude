
package com.avianca.esb.antifraude.ws_cbs;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.avianca.esb.antifraude.ws_cbs package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _ServiceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "ServiceResponse");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _CybersourceResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "CybersourceResponse");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _ProcessResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "ProcessResponse");
    private final static QName _ValidationAFUserId_QNAME = new QName("http://tempuri.org/", "userId");
    private final static QName _ValidationAFXmlDocument_QNAME = new QName("http://tempuri.org/", "xmlDocument");
    private final static QName _ClearCacheItemItem_QNAME = new QName("http://tempuri.org/", "item");
    private final static QName _ProcessResponseMessageUniqueIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "MessageUniqueIdentifier");
    private final static QName _ProcessResponseAFSystemReturnCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "AFSystemReturnCode");
    private final static QName _ProcessResponseResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "Result");
    private final static QName _ProcessResponseLogTransactionNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "LogTransactionNumber");
    private final static QName _ProcessResponseDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "Description");
    private final static QName _ValidationAFResponseValidationAFResult_QNAME = new QName("http://tempuri.org/", "ValidationAFResult");
    private final static QName _ServiceResponseFullXml_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "FullXml");
    private final static QName _ServiceResponseXmlMiddelWare_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "XmlMiddelWare");
    private final static QName _ServiceResponseXmlInput_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "XmlInput");
    private final static QName _ServiceResponseRespuestaCybersource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "RespuestaCybersource");
    private final static QName _ServiceResponseXmlCybersource_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "xmlCybersource");
    private final static QName _ServiceResponseRespuesta_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "Respuesta");
    private final static QName _CybersourceResponseRequestToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "RequestToken");
    private final static QName _CybersourceResponseReplyCyberFinal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "ReplyCyberFinal");
    private final static QName _CybersourceResponseRequestCyberFinal_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "RequestCyberFinal");
    private final static QName _CybersourceResponseReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "ReasonCode");
    private final static QName _CybersourceResponseDecision_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "Decision");
    private final static QName _CybersourceResponseRequestId_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "RequestId");
    private final static QName _CybersourceResponseResponseTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "ResponseTime");
    private final static QName _CybersourceResponseAfsReplyReasonCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", "AfsReplyReasonCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.avianca.esb.antifraude.ws_cbs
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link ProcessResponse }
     * 
     */
    public ProcessResponse createProcessResponse() {
        return new ProcessResponse();
    }

    /**
     * Create an instance of {@link CybersourceResponse }
     * 
     */
    public CybersourceResponse createCybersourceResponse() {
        return new CybersourceResponse();
    }

    /**
     * Create an instance of {@link ClearCacheItemResponse }
     * 
     */
    public ClearCacheItemResponse createClearCacheItemResponse() {
        return new ClearCacheItemResponse();
    }

    /**
     * Create an instance of {@link ValidationAF }
     * 
     */
    public ValidationAF createValidationAF() {
        return new ValidationAF();
    }

    /**
     * Create an instance of {@link ClearCacheItem }
     * 
     */
    public ClearCacheItem createClearCacheItem() {
        return new ClearCacheItem();
    }

    /**
     * Create an instance of {@link ValidationAFResponse }
     * 
     */
    public ValidationAFResponse createValidationAFResponse() {
        return new ValidationAFResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "ServiceResponse")
    public JAXBElement<ServiceResponse> createServiceResponse(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ServiceResponse_QNAME, ServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CybersourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "CybersourceResponse")
    public JAXBElement<CybersourceResponse> createCybersourceResponse(CybersourceResponse value) {
        return new JAXBElement<CybersourceResponse>(_CybersourceResponse_QNAME, CybersourceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "ProcessResponse")
    public JAXBElement<ProcessResponse> createProcessResponse(ProcessResponse value) {
        return new JAXBElement<ProcessResponse>(_ProcessResponse_QNAME, ProcessResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userId", scope = ValidationAF.class)
    public JAXBElement<String> createValidationAFUserId(String value) {
        return new JAXBElement<String>(_ValidationAFUserId_QNAME, String.class, ValidationAF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "xmlDocument", scope = ValidationAF.class)
    public JAXBElement<String> createValidationAFXmlDocument(String value) {
        return new JAXBElement<String>(_ValidationAFXmlDocument_QNAME, String.class, ValidationAF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "item", scope = ClearCacheItem.class)
    public JAXBElement<String> createClearCacheItemItem(String value) {
        return new JAXBElement<String>(_ClearCacheItemItem_QNAME, String.class, ClearCacheItem.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "MessageUniqueIdentifier", scope = ProcessResponse.class)
    public JAXBElement<String> createProcessResponseMessageUniqueIdentifier(String value) {
        return new JAXBElement<String>(_ProcessResponseMessageUniqueIdentifier_QNAME, String.class, ProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "AFSystemReturnCode", scope = ProcessResponse.class)
    public JAXBElement<String> createProcessResponseAFSystemReturnCode(String value) {
        return new JAXBElement<String>(_ProcessResponseAFSystemReturnCode_QNAME, String.class, ProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "Result", scope = ProcessResponse.class)
    public JAXBElement<String> createProcessResponseResult(String value) {
        return new JAXBElement<String>(_ProcessResponseResult_QNAME, String.class, ProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "LogTransactionNumber", scope = ProcessResponse.class)
    public JAXBElement<String> createProcessResponseLogTransactionNumber(String value) {
        return new JAXBElement<String>(_ProcessResponseLogTransactionNumber_QNAME, String.class, ProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "Description", scope = ProcessResponse.class)
    public JAXBElement<String> createProcessResponseDescription(String value) {
        return new JAXBElement<String>(_ProcessResponseDescription_QNAME, String.class, ProcessResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ValidationAFResult", scope = ValidationAFResponse.class)
    public JAXBElement<ServiceResponse> createValidationAFResponseValidationAFResult(ServiceResponse value) {
        return new JAXBElement<ServiceResponse>(_ValidationAFResponseValidationAFResult_QNAME, ServiceResponse.class, ValidationAFResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "FullXml", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseFullXml(String value) {
        return new JAXBElement<String>(_ServiceResponseFullXml_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "XmlMiddelWare", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseXmlMiddelWare(String value) {
        return new JAXBElement<String>(_ServiceResponseXmlMiddelWare_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "XmlInput", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseXmlInput(String value) {
        return new JAXBElement<String>(_ServiceResponseXmlInput_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CybersourceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "RespuestaCybersource", scope = ServiceResponse.class)
    public JAXBElement<CybersourceResponse> createServiceResponseRespuestaCybersource(CybersourceResponse value) {
        return new JAXBElement<CybersourceResponse>(_ServiceResponseRespuestaCybersource_QNAME, CybersourceResponse.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "xmlCybersource", scope = ServiceResponse.class)
    public JAXBElement<String> createServiceResponseXmlCybersource(String value) {
        return new JAXBElement<String>(_ServiceResponseXmlCybersource_QNAME, String.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "Respuesta", scope = ServiceResponse.class)
    public JAXBElement<ProcessResponse> createServiceResponseRespuesta(ProcessResponse value) {
        return new JAXBElement<ProcessResponse>(_ServiceResponseRespuesta_QNAME, ProcessResponse.class, ServiceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "RequestToken", scope = CybersourceResponse.class)
    public JAXBElement<String> createCybersourceResponseRequestToken(String value) {
        return new JAXBElement<String>(_CybersourceResponseRequestToken_QNAME, String.class, CybersourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "ReplyCyberFinal", scope = CybersourceResponse.class)
    public JAXBElement<String> createCybersourceResponseReplyCyberFinal(String value) {
        return new JAXBElement<String>(_CybersourceResponseReplyCyberFinal_QNAME, String.class, CybersourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "RequestCyberFinal", scope = CybersourceResponse.class)
    public JAXBElement<String> createCybersourceResponseRequestCyberFinal(String value) {
        return new JAXBElement<String>(_CybersourceResponseRequestCyberFinal_QNAME, String.class, CybersourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "ReasonCode", scope = CybersourceResponse.class)
    public JAXBElement<String> createCybersourceResponseReasonCode(String value) {
        return new JAXBElement<String>(_CybersourceResponseReasonCode_QNAME, String.class, CybersourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "Decision", scope = CybersourceResponse.class)
    public JAXBElement<String> createCybersourceResponseDecision(String value) {
        return new JAXBElement<String>(_CybersourceResponseDecision_QNAME, String.class, CybersourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "RequestId", scope = CybersourceResponse.class)
    public JAXBElement<String> createCybersourceResponseRequestId(String value) {
        return new JAXBElement<String>(_CybersourceResponseRequestId_QNAME, String.class, CybersourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "ResponseTime", scope = CybersourceResponse.class)
    public JAXBElement<String> createCybersourceResponseResponseTime(String value) {
        return new JAXBElement<String>(_CybersourceResponseResponseTime_QNAME, String.class, CybersourceResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Avianca.AF.Application.DTO", name = "AfsReplyReasonCode", scope = CybersourceResponse.class)
    public JAXBElement<String> createCybersourceResponseAfsReplyReasonCode(String value) {
        return new JAXBElement<String>(_CybersourceResponseAfsReplyReasonCode_QNAME, String.class, CybersourceResponse.class, value);
    }

}
