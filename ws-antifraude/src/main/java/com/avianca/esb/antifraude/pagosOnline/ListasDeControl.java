package com.avianca.esb.antifraude.pagosOnline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listasDeControl", propOrder = {
    "listaNegra",
    "listaBlanca",
    "autorizacionTemporal"
})
public class ListasDeControl {
	
	@XmlElement(name="lista-negra")
	private ListaNegra listaNegra;
	@XmlElement(name="lista-blanca")
    private ListaBlanca listaBlanca;

    private AutorizacionTemporal autorizacionTemporal;

	public ListaNegra getListaNegra() {
		return listaNegra;
	}

	public void setListaNegra(ListaNegra listaNegra) {
		this.listaNegra = listaNegra;
	}

	public ListaBlanca getListaBlanca() {
		return listaBlanca;
	}

	public void setListaBlanca(ListaBlanca listaBlanca) {
		this.listaBlanca = listaBlanca;
	}

	public AutorizacionTemporal getAutorizacionTemporal() {
		return autorizacionTemporal;
	}

	public void setAutorizacionTemporal(AutorizacionTemporal autorizacionTemporal) {
		this.autorizacionTemporal = autorizacionTemporal;
	}

    
}
