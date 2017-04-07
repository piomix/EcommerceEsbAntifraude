Camel Router Project ws-antifraude
=========================================

Este es un servicio SOAP desarrollado con Apache Camel....

1. Importar proyecto maven en jboss-fuse-6.2.1.redhat-084

2. Ejecutar un Maven Update Project para actualizar dependencias del proyecto.

3. Instalar las features necesarias en el bus jboss (jboss-fuse-6.2.1.redhat-084):

	-features:install camel-velocity
	-features:install camel-jaxrs
	-features:install camel-jaxws
	-features:install cxf
	-features:install camel-cxf
	-features:install camel-jackson

	Para el manejo de Drools se necesitan los siguientes features:

	features:addurl mvn:org.jboss.integration.fuse/karaf-features/1.3.0.redhat-002/xml/features
	features:addurl mvn:org.drools/drools-karaf-features/6.3.0.Final/xml/features

	#Si la modificación es sobre un perfil usando fabric
	profile-edit --features <feature> <nombre del perfil>

	features:install drools-common
	features:install drools-module
	features:install drools-templates
	features:install drools-decisiontable
	features:install kie
	features:install kie-ci
	features:install kie-spring
	features:install kie-camel


	
4. Colocar el archivo wsAntifraude.cfg en la carpeta etc de jboss-fuse-6.2.1.redhat-084

5. Para probar, realizar el despliegue y probar con el cliente de soap que se encuentra en la misma ubicación de este archivo: wsAntifraude-Local-soapui-project.xml (Recomendable utilizar version SoapUI 5.2.1).