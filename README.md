# MICROSERVICIOS CRUD PEDIDO/PRODUCTO

Este proyecto esta diseñado para permitir la creación, lectura, actualización y eliminación de cursos. Se divide en dos partes independientes que se comunican entre sí.

El microservicio productos:

1. Exponer las lista de productos existentes
Además para poder interactuar el microservicio pedidos, permitirá:
2. Actualizar el stock del produco
3. Obtener el precio de un producto

El microservicio pedidos:

1. Recibirá los datos del pedido y los dará de alta
2. permitirá ecuperar todos los pedidos existentes
Este microservicio tendrá que interaccionar con el microservicio de producto para las actualizaciones de stock de producto y obtención del precio de cara al registro del total del pedido

## Requisitos

- Java 17
- Spring Boot 3.1.4
- Spring Boot Web Starter
- Spring Boot Test Starter

## Instalación

1. Clona el repositorio en tu máquina local.
2. Abre una terminal en la carpeta raíz del proyecto y ejecuta el siguiente comando para compilar el proyecto: `mvn clean install` esto generará la carpeta `target` con nuestro proyecto compilado en un archivo JAR.
3. Ejecutar el proyecto con el comando `run` de Spring Boot.
4. La aplicación ya debería estar disponible en [localhost:8080](http://localhost:8080)

## Uso

Mandar peticiones desde el puerto 8080 a través de postman.

- **GET /producto**: Devuelve una lista de todos los productos disponibles en la aplicación.
- **POST /pedido**: Crea un nuevo pedido con la información proporcionada en el cuerpo de la solicitud.
- **PUT /producto/{codigoProducto}/{stock}**: Actualiza el stock de un producto existente en la base de datos. Se agrega o quita del stock del producto.
- **GET /producto/{codigoProducto}/precio**: Devuelve el precio de un producto existente en la base de datos.

## Licencia

MIT License Copyright (c)
