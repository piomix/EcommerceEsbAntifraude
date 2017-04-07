# EcommerceEsbAntifraude

Servicio creado para verificar que una transacción no sea fraudulenta, usando como proveedores de fraude Cybersource y PayU (Pagos Online). Las transacciones cuya moneda es COP (Peso colombiano) y país es CO (Colombia) son dirigidas a PayU para ser procesadas y el resto de transacciones son enviadas a Cybersource.

### Cybersource como Antifraude
El servicio recibe un XML con los campos necesarios para evaluar el fraude, luego consume un servicio intermediario para que enriquezca de información de la reserva y envíe a Cybersource esta petición. De la misma forma recibe la respuesta y la envía al servicio antifraude para que este la muestre al consumer.

### PayU como Antifraude
El servicio recibe el mismo XML pero esta vez consume directamente el servicio de PayU sin usar intermediarios, PayU evalua la transacción y responde al servicio si ha sido aprobada por antifraude o no.

### CAMEL CXF
Tanto para exponer un endpoint soap, como para consumir un servicio soap se utilia el componente camel-cxf.
