https://docs.google.com/document/d/1JJ-Hwwpb0Aa-3MRQZFum3HFfQh7J3s_IJp_UFU0Kf_Q/edit?tab=t.0#heading=h.ruqmmlu2h38j

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



--------------------ejecutar spring para actualizar base de datos------
Insert into generos (nombre)
values
('Pop'),
('Rock'),
('R&B'),
('Country');
-----------------combinando ---artista y genero--------
INSERT INTO artistas (nombre, nacionalidad, anio_inicio, id_genero) VALUES
('Taylor Swift', 'Estadounidense', 2006, 1),   -- Pop
('Ariana Grande', 'Estadounidense', 2008, 1),  -- Pop
('Beyoncé', 'Estadounidense', 1997, 3),        -- R&B
('Luis Miguel', 'Mexicano', 1982, 2),          -- Rock
('Selena', 'Estadounidense', 1980, 4);         -- Country

UPDATE artistas SET id_genero = 3 WHERE id = 5;  -- Lucía → R&B
UPDATE artistas SET id_genero = 1 WHERE id = 9;  -- Luna → Pop
UPDATE artistas SET id_genero = 2 WHERE id = 3;  
UPDATE artistas SET id_genero = 4 WHERE id = 10;  

