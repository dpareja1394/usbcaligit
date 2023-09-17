
CREATE TABLE EstadosPedido (
    id          INT AUTO_INCREMENT PRIMARY KEY ,
    descripcion VARCHAR(10) NOT NULL
);

CREATE TABLE Categorias (
    id          INT AUTO_INCREMENT PRIMARY KEY ,
    nombre      VARCHAR(10) NOT NULL,
    descripcion VARCHAR(255)
);

CREATE TABLE TiposDocumento (
    id          INT AUTO_INCREMENT PRIMARY KEY ,
    descripcion VARCHAR(10) NOT NULL
);

CREATE TABLE Productos (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    cate_id     INT NOT NULL,
    referencia  VARCHAR(10) NOT NULL,
    nombre  VARCHAR(50) NOT NULL,
    descripcion VARCHAR(255),
    precio_unitario NUMERIC(19,2) NOT NULL,
    unidades_disponibles NUMERIC(19,2) NOT NULL,
    FOREIGN KEY (cate_id)
        REFERENCES Categorias(id)
);

CREATE TABLE Clientes (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    tido_id     INT NOT NULL,
    nombres  VARCHAR(50) NOT NULL,
    apellidos  VARCHAR(50) NOT NULL,
    documento  VARCHAR(50) NOT NULL,
    estado  VARCHAR(1) NOT NULL,
    FOREIGN KEY (tido_id)
        REFERENCES TiposDocumento(id)
);

CREATE TABLE Pedidos (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    clie_id     INT NOT NULL,
    espe_id     INT NOT NULL,
    fecha       TIMESTAMP NOT NULL,
    total       NUMERIC(19,2) NOT NULL,
    FOREIGN KEY (clie_id)
        REFERENCES Clientes(id),
    FOREIGN KEY (espe_id)
        REFERENCES EstadosPedido(id)
);

CREATE TABLE DetallesPedido (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    pedi_id     INT NOT NULL,
    prod_id     INT NOT NULL,
    cantidad    NUMERIC(19,2) NOT NULL,
    valor       NUMERIC(19,2) NOT NULL,
    FOREIGN KEY (pedi_id)
        REFERENCES Pedidos(id),
    FOREIGN KEY (prod_id)
        REFERENCES Productos(id)
);