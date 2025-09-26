CREATE SEQUENCE SEQ_ID_ENVIO
START WITH 1
INCREMENT BY 1;

CREATE TABLE TBL_ENVIO (
    idEnvio INT PRIMARY KEY DEFAULT nextval('SEQ_ID_ENVIO'),
    orden_id INT NOT NULL,
	costo_envío NUMERIC(10,2) NOT NULL,
	fecha_envío date,
	fecha_estimada_llegada date,
	estado_envío VARCHAR(255),
	proveedor_envío VARCHAR(255),
	dirección_entrega VARCHAR(255),
	FOREIGN KEY (orden_id) REFERENCES TBL_ORDEN(idOrden)
	ON DELETE CASCADE
);

