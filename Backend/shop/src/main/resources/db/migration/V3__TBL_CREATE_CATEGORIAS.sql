CREATE TABLE IF NOT EXISTS tbl_categorias (
     id_categoria SERIAL PRIMARY KEY,
     nombre VARCHAR(100) NOT NULL,
     descripcion text,
     estadoCategoria boolean
 );
