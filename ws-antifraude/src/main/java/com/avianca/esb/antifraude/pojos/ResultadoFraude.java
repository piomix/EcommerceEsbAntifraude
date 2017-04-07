package com.avianca.esb.antifraude.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.camel.ExchangeProperty;
import org.apache.camel.Handler;

/**
 * <p>
 * Clase Java para resultadoFraude complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoFraude"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="resultado" type="{urn:com.avianca.esb.antifraude:ws-antifraude:1.0}resultado" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoFraude", propOrder = { "resultado" })
public class ResultadoFraude {

	protected Resultado resultado;

	public ResultadoFraude() {
	}

	@Handler
	/**public ResultadoFraude factory(
	           @ExchangeProperty("codigoError") String codigoError,
	           @ExchangeProperty("codigoRespuesta") String codigoRespuesta,
	           @ExchangeProperty("contadorErrores") String contadorErrores,
	           @ExchangeProperty("descripcion") String descripcion,
	           @ExchangeProperty("identificador") String identificador,
	           @ExchangeProperty("respuestaCybersource") String respuestaCybersource,
	           @ExchangeProperty("resultado") String result) {
	       resultado = new Resultado();
	       resultado.setCodigoError(codigoError);
	       resultado.setCodigoRespuesta(codigoRespuesta);
	       resultado.setContadorErrores(Integer.parseInt(contadorErrores));
	       resultado.setIdLog("");
	       resultado.setDescripcion(descripcion);
	       resultado.setResultado(result);
	       return this;
	   }
	*/
	public ResultadoFraude factory(
	           @ExchangeProperty("codigoError") String codigoError,
	           @ExchangeProperty("codigoRespuesta") String codigoRespuesta,
	           @ExchangeProperty("descripcion") String descripcion,
	           @ExchangeProperty("identificador") String identificador,
	           @ExchangeProperty("respuestaCybersource") String respuestaCybersource,
	           @ExchangeProperty("resultado") String result) {
	       resultado = new Resultado();
	       resultado.setCodigoError(codigoError);
	       resultado.setCodigoRespuesta(codigoRespuesta);
	       resultado.setIdLog("");
	       resultado.setDescripcion(descripcion);
	       resultado.setResultado(result);
	       return this;
	   }

	/**
	 * Obtiene el valor de la propiedad resultado.
	 * 
	 * @return possible object is {@link Resultado }
	 * 
	 */
	public Resultado getResultado() {
		return resultado;
	}

	/**
	 * Define el valor de la propiedad resultado.
	 * 
	 * @param value
	 *            allowed object is {@link Resultado }
	 * 
	 */
	public void setResultado(Resultado value) {
		this.resultado = value;
	}

	@Override
	public String toString() {
		return "ResultadoFraude [resultado=" + resultado + "]";
	}

}
