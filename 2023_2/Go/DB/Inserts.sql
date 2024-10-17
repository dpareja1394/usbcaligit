INSERT INTO godbdev.TiposDocumento (descripcion) VALUES ('Cédula');
INSERT INTO godbdev.TiposDocumento (descripcion) VALUES ('NIT');

INSERT INTO godbdev.EstadosPedido (descripcion) VALUES ('Pendiente');
INSERT INTO godbdev.EstadosPedido (descripcion) VALUES ('Aceptado');
INSERT INTO godbdev.EstadosPedido (descripcion) VALUES ('Cancelado');


INSERT INTO godbdev.Clientes (tido_id, nombres, apellidos, documento, estado)
VALUES(1, 'Daniel', 'Pareja Londoño', '101234', 'A');