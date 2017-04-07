package com.pagosonline.xsd2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.pagosonline.xsd2 package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _EvaluarResponse_QNAME = new QName(
			"http://ws.maf.pagosonline.com", "evaluarResponse");
	private final static QName _Evaluar_QNAME = new QName(
			"http://ws.maf.pagosonline.com", "evaluar");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.pagosonline.xsd2
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Evaluar }
	 * 
	 */
	public Evaluar createEvaluar() {
		return new Evaluar();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link EvaluarResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.maf.pagosonline.com", name = "evaluarResponse")
	public JAXBElement<EvaluarResponse> createEvaluarResponse(
			EvaluarResponse value) {
		return new JAXBElement<EvaluarResponse>(_EvaluarResponse_QNAME,
				EvaluarResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Evaluar }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://ws.maf.pagosonline.com", name = "evaluar")
	public JAXBElement<Evaluar> createEvaluar(Evaluar value) {
		return new JAXBElement<Evaluar>(_Evaluar_QNAME, Evaluar.class, null,
				value);
	}

}
