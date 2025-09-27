CREATE TABLE IF NOT EXISTS tbl_marcas (
    id_marca SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    logo TEXT,
    categoria_id INT REFERENCES tbl_categorias(id_categoria) ON DELETE SET NULL
);
