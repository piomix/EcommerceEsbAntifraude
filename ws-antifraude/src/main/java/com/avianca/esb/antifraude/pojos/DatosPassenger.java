package com.avianca.esb.antifraude.pojos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para datosPassenger complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosPassenger"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passengerEge1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="passengerEge2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="passengerEge3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosPassenger", propOrder = { 
		"passengerEge1",
		"passengerEge2", 
		"passengerEge3", 
		"officePhone", 
		"homePhone",
		"nombres", 
		"apellidos", 
		"email" 
})
public class DatosPassenger {

	protected Integer passengerEge1;
	protected Integer passengerEge2;
	protected Integer passengerEge3;
	protected String officePhone;
	protected String homePhone;
	protected String nombres;
	protected String apellidos;
	protected String email;

	/**
	 * Obtiene el valor de la propiedad passengerEge1.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPassengerEge1() {
		return passengerEge1;
	}

	/**
	 * Define el valor de la propiedad passengerEge1.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPassengerEge1(Integer value) {
		this.passengerEge1 = value;
	}

	/**
	 * Obtiene el valor de la propiedad passengerEge2.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPassengerEge2() {
		return passengerEge2;
	}

	/**
	 * Define el valor de la propiedad passengerEge2.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPassengerEge2(Integer value) {
		this.passengerEge2 = value;
	}

	/**
	 * Obtiene el valor de la propiedad passengerEge3.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getPassengerEge3() {
		return passengerEge3;
	}

	/**
	 * Define el valor de la propiedad passengerEge3.
	 * 
	 * @param value
	 *            allowed object is {@link Integer }
	 * 
	 */
	public void setPassengerEge3(Integer value) {
		this.passengerEge3 = value;
	}

	/**
	 * Obtiene el valor de la propiedad officePhone.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOfficePhone() {
		return officePhone;
	}

	/**
	 * Define el valor de la propiedad officePhone.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOfficePhone(String value) {
		this.officePhone = value;
	}

	/**
	 * Obtiene el valor de la propiedad homePhone.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHomePhone() {
		return homePhone;
	}

	/**
	 * Define el valor de la propiedad homePhone.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHomePhone(String value) {
		this.homePhone = value;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "DatosPassenger [passengerEge1=" + passengerEge1
				+ ", passengerEge2=" + passengerEge2 + ", passengerEge3="
				+ passengerEge3 + ", officePhone=" + officePhone
				+ ", homePhone=" + homePhone 
				+ ", nombres=" + nombres 
				+ ", apellidos=" + apellidos 
				+ ", email=" + email + "]";
	}

}
