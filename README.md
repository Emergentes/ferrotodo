# FERROTODO

**FERROTODO** es un sistema web para la gestión de compra y venta de productos de construcción desarrollado en **JAVA** con **SPRING BOOT**.

## Antes de comenzar

Asegúrate de leer estos puntos antes de avanzar en el proyecto:

- Si deseas agregar una nueva característica o modificar algo, crea tu propia rama a partir de la rama "master" y luego realiza el merge cuando consideres que has terminado.
- Antes de hacer un commit, asegúrate de que el mensaje del commit describa claramente lo que has hecho.

## Empezando

### Configuración de la base de datos

1. Instala XAMPP para utilizar la base de datos. Por defecto, XAMPP incluye MariaSQL.
2. Crea una base de datos llamada `bd_ferrotodo` desde phpMyAdmin o utilizando el siguiente comando SQL:

```sql
CREATE DATABASE bd_ferrotodo;
```

**NOTA:** MariaDB utiliza el puerto `3306` con la IP `localhost` de forma predeterminada. Tenlo en cuenta para la siguiente sección.

### Para levantar el proyecto

1. Abre tu IDE favorito de Java que soporte Maven y ejecuta el método `main(...)` de la clase `FerroTodoApplication.java`.
2. Spring Boot utiliza Tomcat embebido que se levanta en el puerto `8081` de forma predeterminada. Si necesitas cambiar el puerto, modifica el archivo `application.properties`:

```properties
server.port=8081
```

3. Después de ejecutar `main(...)`, verás el index en la carpeta `resources/static/` cuando ingreses a la URL: `http://localhost:8081/` en tu navegador.

**NOTA:** Si necesitas agregar configuraciones adicionales de tu base de datos, como usuario o contraseña, agrégalas al archivo `application.properties` de la siguiente manera:

```properties
spring.datasource.url=jdbc:mariadb://localhost:3306/bd_ferrotodo
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=
```
**NOTA:** Cambia `username=` y `password=` según corresponda a tu base de datos.

### Para los Frontends

- Todos los archivos relacionados al frontend deben ser colocados dentro de la carpeta `static/`.
- Puedes desarrollar en React o Angular.
- Abre la carpeta `static/` en tu IDE favorito y comienza a trabajar.
- Para ver tus avances, puedes usar LiveServer si estás utilizando VScode.
- No es necesario levantar todo el proyecto Spring Boot para ver tus cambios en el frontend. Simplemente coloca tus archivos en la carpeta `static/`.

### Lógica de negocio de la empresa Ferrotodo (Dominio)

- El Administrador gestiona la empresa Ferrotodo.
- El Cliente realiza compras en la empresa Ferrotodo.
- La Ferretería expone sus productos en stock tanto en la tienda física como en la web.
- El Proveedor suministra productos a la empresa Ferrotodo.
- El Vendedor de Ferrotodo se encarga de vender los productos de la empresa.

Si hay más requisitos funcionales, se irán actualizando en este documento.

---

Este archivo `.md` se actualizará conforme avance el proyecto.
