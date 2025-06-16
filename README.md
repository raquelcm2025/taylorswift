# Proyecto Taylor Swift 🎤

Este proyecto es una aplicación web hecha con **Spring Boot**, que permite **registrar, listar, actualizar y eliminar artistas** como Taylor Swift, entre otros.

## 🌐 Tecnologías usadas

- Java 17
- Spring Boot 3
- Thymeleaf
- Bootstrap 5
- SweetAlert y Toastr (para alertas modernas)
- JPA con MySQL
- Git & GitHub

## 🗃️ Estructura de la Base de Datos (MySQL)

Base de datos: `taylorswift`

Tabla: `artistas`

| Campo        | Tipo        | Descripción               |
|--------------|-------------|---------------------------|
| `id`         | `BIGINT`    | Clave primaria autogenerada |
| `nombre`     | `VARCHAR`   | Nombre del artista        |
| `nacionalidad` | `VARCHAR` | Nacionalidad del artista |
| `anio_inicio` | `INT`      | Año de inicio de carrera |

Script de creación:

```sql
CREATE DATABASE taylorswift;
USE taylorswift;

CREATE TABLE artistas (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100),
  nacionalidad VARCHAR(100),
  anio_inicio INT
);



--------------------------
use taylorswift;

SELECT * FROM artistas;

----Para eliminar columna:
ALTER TABLE artistas DROP COLUMN ano_inicio;

--insertar valores

Insert into artistas (nombre, nacionalidad, anio_inicio)
values
("Luna", "Argentina", 2010),
("Rachel", "Peruana", 1995),
("Ricardo", "Mexicano", 1995);
