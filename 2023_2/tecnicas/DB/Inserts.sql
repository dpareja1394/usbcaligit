INSERT INTO tiposDocumento (descripcion) VALUES ('Cédula');
INSERT INTO tiposDocumento (descripcion) VALUES ('NIT');

INSERT INTO estadosPedido (descripcion) VALUES ('Pendiente');
INSERT INTO estadosPedido (descripcion) VALUES ('Aceptado');
INSERT INTO estadosPedido (descripcion) VALUES ('Cancelado');


INSERT INTO Clientes (tido_id, nombres, apellidos, documento, estado)
VALUES(1, 'Daniel', 'Pareja Londoño', '101234', 'A');

INSERT INTO categorias (nombre, descripcion) VALUES ('JUGUETES', 'Todo tipo de juguetería infantil');
INSERT INTO categorias (nombre, descripcion) VALUES ('HOGAR', 'Accesorios para el hogar');

INSERT INTO public.pedidos (clie_id, espe_id, fecha, total) VALUES(1, 1, now(), 20000);
INSERT INTO public.pedidos (clie_id, espe_id, fecha, total) VALUES(1, 1, now(), 30000);
INSERT INTO public.pedidos (clie_id, espe_id, fecha, total) VALUES(1, 1, now(), 25000);