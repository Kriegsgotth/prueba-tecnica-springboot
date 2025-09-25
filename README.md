Spring Boot API REST - Registro de Usuarios

Este proyecto es un ejemplo de una API REST sencilla desarrollada con Spring Boot. Permite registrar usuarios y obtener la lista de usuarios registrados en la sesión actual. 
No utiliza base de datos; los datos se almacenan temporalmente en memoria mientras la aplicación está corriendo.

Endpoints:
1) POST /users
Registra un usuario nuevo.
2) GET /users
Obtiene la lista de usuarios registrados durante la sesión actual.

Requisitos:
1) Java JDK 17+
2) Spring Boot 3.x
3) Maven

Cómo ejecutar:
1) Clonar el repositorio:
        git clone <URL_DEL_REPOSITORIO>
2) Abrir el proyecto en IntelliJ IDEA o Spring Tools Suite.
3) Ejecutar DemoApplication.java.
4) La API estará disponible en http://localhost:8080.

Tecnologías usadas:
- Java
- Spring Boot
- Maven
