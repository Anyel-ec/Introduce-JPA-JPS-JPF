# CRUD de Usuario Utilizando JPA y JSP de Java

Este proyecto es una aplicación web de ejemplo que implementa un CRUD (Crear, Leer, Actualizar, Eliminar) básico para gestionar usuarios utilizando JavaServer Faces (JSF), JPA (Java Persistence API) con Hibernate como proveedor de persistencia y MySQL como base de datos.

## **Select Language:**
- [Español (Spanish)](README-es.md)
- [English](README.md)

## Requisitos previos

Para ejecutar este proyecto, necesitarás tener instalado lo siguiente:

- Java Development Kit (JDK)
- Apache Maven
- Un servidor de aplicaciones compatible con JSF, como Apache Tomcat
- MySQL Server

## Configuración de la base de datos

Este proyecto utiliza MySQL como base de datos. Antes de ejecutar la aplicación, asegúrate de haber creado una base de datos llamada `jpa` y configurado las credenciales de acceso en el archivo `persistence.xml`.

## Instalación y ejecución

1. Clona este repositorio o descarga el código fuente.
2. Importa el proyecto en tu entorno de desarrollo preferido.
3. Asegúrate de que todas las dependencias de Maven se descarguen correctamente.
4. Configura tu servidor de aplicaciones para que ejecute la aplicación.
5. Ejecuta el proyecto en el servidor de aplicaciones.

## Estructura del proyecto

El proyecto se divide en los siguientes paquetes:

- `com.espe.controller`: Contiene los controladores de la aplicación, que gestionan las interacciones de usuario y la lógica de negocio.
- `com.espe.dao`: Contiene las clases de acceso a datos que interactúan con la base de datos.
- `com.espe.idao`: Define la interfaz del acceso a datos para la entidad `Usuario`.
- `com.espe.model`: Contiene la entidad `Usuario` y la clase de utilidad `JPAUtil` para la gestión de la persistencia.
- `webapp`: Contiene las vistas de la aplicación en archivos XHTML.

## Funcionalidades principales

- **Listar usuarios**: Se muestra una tabla con los usuarios existentes.
- **Editar usuario**: Permite editar la información de un usuario existente.
- **Eliminar usuario**: Elimina un usuario de la base de datos.
- **Agregar usuario**: Permite agregar un nuevo usuario a la base de datos.

## Contribución

Si deseas contribuir a este proyecto, ¡no dudes en hacer un fork y enviar tus pull requests!

## Autor

Desarrollado por [Anyel EC](https://github.com/anyel-ec).
