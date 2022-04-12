# dojo-arquitect

El microservicio de ordenes, genera una orden con una lista de productos y un nombre de usuario.
Cuando hacemos la peticion al endpoint "/order"(puerto 8081) nos muestra una orden con todos los datos, que se crea al momento de la peticion del endpoint.

El microservicio de factura, recibe el id de una orden generada, fecha y precio.
Cuando de hace la peticion al endpoint "/factura"(puerto 8080) nos muestra la factura con un id propio de factura

implementamos rabbitmq.

Participantes: Jorge Celis, Mathias Labora.
