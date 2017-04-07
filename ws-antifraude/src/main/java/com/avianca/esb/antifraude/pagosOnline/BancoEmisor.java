package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bancoEmisor", propOrder = {
    "codigoIsoPais",
    "banco",
    "telefono"
})
public class BancoEmisor {
	@XmlElement(name="codigo-iso-pais")
	private String codigoIsoPais;
	@XmlElement(name="banco")
	private String banco;
	@XmlElement(name="telefono")
	private String telefono;

	public String getCodigoIsoPais() {
		return codigoIsoPais;
	}

	public void setCodigoIsoPais(String codigoIsoPais) {
		this.codigoIsoPais = codigoIsoPais;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
