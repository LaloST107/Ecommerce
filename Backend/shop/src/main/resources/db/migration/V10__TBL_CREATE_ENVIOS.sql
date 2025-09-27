-- Crear tabla envíos (después de tbl_ordenes)
CREATE TABLE IF NOT EXISTS tbl_envios (
    id_envio SERIAL PRIMARY KEY,
    numero_orden VARCHAR(50),
    costo_envio NUMERIC(12,2),
    fecha_envio TIMESTAMP,
    fecha_estimada_llegada TIMESTAMP,
    estado_envio VARCHAR(50),
    proveedor_envio VARCHAR(150),
    direccion_entrega TEXT
);
