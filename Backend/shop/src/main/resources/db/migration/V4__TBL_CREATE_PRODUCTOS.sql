
CREATE TABLE IF NOT EXISTS TBL_PRODUCTOS (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion text,
    cantidad INT NOT NULL,
    precio NUMERIC(10,2) NOT NULL,
    stock INT NOT NULL,
    marca VARCHAR(100) NOT NULL,
    fecha_actualizacion date,
    imagen TEXT,
    categoria_id INT NOT NULL,
    CONSTRAINT fk_categoria
        FOREIGN KEY (categoria_id)
        REFERENCES V3__TBL_CREATE_CATEGORIAS (id)
        ON DELETE CASCADE
);