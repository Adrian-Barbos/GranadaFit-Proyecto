CREATE DATABASE IF NOT EXISTS tienda_suplementos;
USE tienda_suplementos;

CREATE TABLE productos (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           nombre VARCHAR(100) NOT NULL,
                           marca VARCHAR(50),
                           precio DECIMAL(10, 2) NOT NULL,
                           stock INT DEFAULT 0

 INSERT INTO productos (nombre, marca, precio, stock) VALUES ('Creatina', 'MyProtein', 25.00, 10);
INSERT INTO productos (nombre, marca, precio, stock) VALUES ('Proteina Whey', 'ON', 60.00, 5);
);