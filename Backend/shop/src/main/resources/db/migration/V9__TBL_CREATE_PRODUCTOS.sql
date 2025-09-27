
CREATE TABLE IF NOT EXISTS tbl_productos (
    id_producto SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    cantidad INT NOT NULL,
    precio NUMERIC(10,2) NOT NULL,
    stock INT NOT NULL,
    marca_id INT REFERENCES tbl_marcas(id_marca) ON DELETE SET NULL,
    fecha_actualizacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    imagen TEXT,
    categoria_id INT NOT NULL,
    CONSTRAINT fk_categoria
        FOREIGN KEY (categoria_id)
        REFERENCES tbl_categorias(id_categoria)
        ON DELETE CASCADE
);
