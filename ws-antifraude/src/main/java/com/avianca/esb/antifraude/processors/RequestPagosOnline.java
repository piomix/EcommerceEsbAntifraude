package com.avianca.esb.antifraude.processors;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.camel.BeanInject;
import org.apache.camel.Exchange;
import org.apache.camel.Handler;

import com.avianca.esb.antifraude.pojos.AntiFraudEsb;
import com.avianca.esb.antifraude.pojos.Vuelo;

public class RequestPagosOnline {

	@BeanInject("props")
	private Properties properties;

	private String pnr;
	private String idTransaccion;
	private String paisCompra;
	private String pais;
	private String nombre;
	private String apellido;
	private String tipoDocumentoTH;
	private String numDocumentoTH;
	private String sexo;
	private XMLGregorianCalendar fechaNacimiento;
	private String emailCliente;
	private String telAlterno;
	private String ciudad;
	private String direccion;
	private String codPostal;
	private String ip;
	private String deviceFingerprint;
	private String userAgent;
	private String franquicia;
	private String bin;
	private String numTarjeta;
	private String issuingBank;
	private String tipoMoneda;
	private String fechaExpiracion;
	private String nombreTH;
	private String telefonoTH;
	private String paisTH;
	private String ciudadTH;
	private String direccionTH;
	private String codPostalTH;
	private String lineaNegocio;

	/**
	 * Setea en Headers cada uno de los parametros de la solicitud realizada por
	 * el cliente que luego seran utilizados por el velocity que arma el request
	 * de consulta de Pagos Online
	 * 
	 * @param exchange
	 */

	@Handler
	public void builtRequestPagosOnline(Exchange exchange) {

		// Day today
		Date today = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

		// AntiFraudEsb antiFraudEsb =
		// exchange.getIn().getBody(AntiFraudEsb.class);
		AntiFraudEsb antiFraudEsb = exchange.getProperty("objectRequest", AntiFraudEsb.class);
		if (antiFraudEsb != null) {
			pnr = antiFraudEsb.getDatosVuelo().getPnr();
			idTransaccion = antiFraudEsb.getDatosCompra().getIdTransaccion();
			paisCompra = antiFraudEsb.getDatosCompra().getPais();
			pais = antiFraudEsb.getDatosCliente().getPais();
			nombre = antiFraudEsb.getDatosCliente().getNombre();
			apellido = antiFraudEsb.getDatosCliente().getApellido();
			tipoDocumentoTH = antiFraudEsb.getDatosTarjeta().getTipoDocumentoTH();
			numDocumentoTH = antiFraudEsb.getDatosTarjeta().getNumDocumentoTH();
			sexo = antiFraudEsb.getDatosCliente().getSexo();
			fechaNacimiento = antiFraudEsb.getDatosCliente().getFechaNacimiento();
			emailCliente = antiFraudEsb.getDatosCliente().getEmail();
			telAlterno = antiFraudEsb.getDatosCliente().getTelAlterno();
			ciudad = antiFraudEsb.getDatosCliente().getCiudad();
			direccion = antiFraudEsb.getDatosCliente().getDireccion();
			codPostal = antiFraudEsb.getDatosCliente().getCodPostal();
			ip = antiFraudEsb.getEncabezado().getIp();
			deviceFingerprint = antiFraudEsb.getEncabezado().getDeviceFingerprint();
			userAgent = antiFraudEsb.getEncabezado().getUserAgent();
			franquicia = antiFraudEsb.getDatosTarjeta().getFranquicia();
			bin = antiFraudEsb.getDatosTarjeta().getBin();
			numTarjeta = antiFraudEsb.getDatosTarjeta().getNumTarjeta();
			issuingBank = antiFraudEsb.getDatosTarjeta().getIssuingBank();
			tipoMoneda = antiFraudEsb.getDatosCompra().getTipoMoneda();
			fechaExpiracion = antiFraudEsb.getDatosTarjeta().getMesVencimiento()
					+ antiFraudEsb.getDatosTarjeta().getAnioVencimiento();
			nombreTH = antiFraudEsb.getDatosTarjeta().getNombreTH();
			telefonoTH = antiFraudEsb.getDatosTarjeta().getTelefonoTH();
			paisTH = antiFraudEsb.getDatosTarjeta().getPaisTH();
			ciudadTH = antiFraudEsb.getDatosTarjeta().getCiudadTH();
			direccionTH = antiFraudEsb.getDatosTarjeta().getDireccionTH();
			codPostalTH = antiFraudEsb.getDatosTarjeta().getCodPostalTH();
			lineaNegocio = antiFraudEsb.getEncabezado().getLineaNegocio();
			
			if (antiFraudEsb.getDatosVuelo() != null) {
				Vuelo vuelo = antiFraudEsb.getDatosVuelo();
				exchange.setProperty("datosVuelo", vuelo);
			}
			exchange.setProperty("datosPassenger", antiFraudEsb.getDatosPassenger());
		}

		exchange.getIn().setHeader("idTransaccion", idTransaccion != null ? idTransaccion : "");
		exchange.getIn().setHeader("pnr", pnr != null ? pnr : "");
		exchange.getIn().setHeader("fechaCreacion", sf.format(today));
		exchange.getIn().setHeader("prueba", properties.get("maf.pagosonline.uservice.prueba"));
		exchange.getIn().setHeader("paisCompra", paisCompra != null ? paisCompra : "");
		exchange.getIn().setHeader("origen", properties.get("maf.pagosonline.uservice.origen"));
		exchange.getIn().setHeader("origen", properties.get("maf.pagosonline.uservice.origen"));
		exchange.getIn().setHeader("usuario_vendedor_id",
				properties.get("maf.pagosonline.uservice.usuario_vendedor_id"));
		exchange.getIn().setHeader("usuario_vendedor_pais",
				properties.get("maf.pagosonline.uservice.usuario_vendedor_pais"));
		exchange.getIn().setHeader("usuario_vendedor_estado",
				properties.get("maf.pagosonline.uservice.usuario_vendedor_estado"));
		exchange.getIn().setHeader("pais", pais != null ? pais : "");
		exchange.getIn().setHeader("nombre", nombre != null ? nombre : "");
		exchange.getIn().setHeader("apellido", apellido != null ? apellido : "");
		exchange.getIn().setHeader("tipoDocumentoTH", tipoDocumentoTH != null ? tipoDocumentoTH : "");
		exchange.getIn().setHeader("numDocumentoTH", numDocumentoTH != null ? numDocumentoTH : "");
		exchange.getIn().setHeader("sexo", sexo != null ? sexo : "");
		exchange.getIn().setHeader("fechaNacimiento", fechaNacimiento != null ? fechaNacimiento : "");
		exchange.getIn().setHeader("emailCliente", emailCliente != null ? emailCliente : "");
		exchange.getIn().setHeader("telAlterno", telAlterno != null ? telAlterno : "");
		exchange.getIn().setHeader("ciudad", ciudad != null ? ciudad : "");
		exchange.getIn().setHeader("direccion", direccion != null ? direccion : "");
		exchange.getIn().setHeader("codPostal", codPostal != null ? codPostal : "");
		exchange.getIn().setHeader("ip", ip != null ? ip : "");
		exchange.getIn().setHeader("deviceFingerprint", deviceFingerprint != null ? deviceFingerprint : "");
		exchange.getIn().setHeader("userAgent", userAgent != null ? userAgent : "");
		exchange.getIn().setHeader("tipoDocumento",
				properties.get("maf.pagosonline.uservice.tipoDocumento." + tipoDocumentoTH));
		exchange.getIn().setHeader("tipoMedioPago",
				properties.get("maf.pagosonline.uservice.tipoMedioPago.tarjetaCredito"));
		exchange.getIn().setHeader("franquicia", validateFranquicia(franquicia));
		exchange.getIn().setHeader("bin", bin != null ? bin : "");
		exchange.getIn().setHeader("numTarjeta", numTarjeta != null ? numTarjeta : "");
		exchange.getIn().setHeader("issuingBank", issuingBank != null ? issuingBank : "");
		exchange.getIn().setHeader("tipoMoneda", tipoMoneda != null ? tipoMoneda : "");
		exchange.getIn().setHeader("fechaExpiracion", fechaExpiracion != null ? fechaExpiracion : "");
		exchange.getIn().setHeader("cuotas",
				antiFraudEsb.getDatosCompra().getCuotas() != null ? antiFraudEsb.getDatosCompra().getCuotas() : 0);
		exchange.getIn().setHeader("nombreTH", nombreTH != null ? nombreTH : "");
		exchange.getIn().setHeader("telefonoTH", telefonoTH != null ? telefonoTH : "");
		exchange.getIn().setHeader("paisTH", paisTH != null ? paisTH : "");
		exchange.getIn().setHeader("ciudadTH", ciudadTH != null ? ciudadTH : "");
		exchange.getIn().setHeader("direccionTH", direccionTH != null ? direccionTH : "");
		exchange.getIn().setHeader("codPostalTH", codPostalTH != null ? codPostalTH : "");
		exchange.getIn().setHeader("montoTotal", antiFraudEsb.getDatosCompra().getMontoTotal() != null
				? antiFraudEsb.getDatosCompra().getMontoTotal() : 0);
		exchange.getIn().setHeader("lineaNegocio", lineaNegocio != null ? lineaNegocio : "");
	}

	/**
	 * Valida el tipo de franquicia
	 * 
	 * @param franquicia
	 * @return
	 */
	public String validateFranquicia(String franquicia) {

		if (franquicia.equals("VI")) {
			return "10";
		}

		if (franquicia.equals("AX")) {
			return "12";
		}

		if (franquicia.equals("CA")) {
			return "11";
		}

		if (franquicia.equals("DC")) {
			return "22";
		}

		if (franquicia.equals("DS")) {
			return "51";
		}

		return "";
	}

}