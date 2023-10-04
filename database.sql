CREATE TABLE `productos` (
	`codigo_producto` INT(11) NOT NULL,
	`precio_unitario` DOUBLE NOT NULL,
	`producto` VARCHAR(255) NULL DEFAULT NULL COLLATE 'utf32_spanish_ci',
	`stock` INT(11) NOT NULL,
	PRIMARY KEY (`codigo_producto`) USING BTREE
)

INSERT INTO productos (codigo_producto, precio_unitario, producto, stock) VALUES (1, 1.5, 'Coca Cola', 100);
INSERT INTO productos (codigo_producto, precio_unitario, producto, stock) VALUES (2, 1.5, 'Fanta', 150);
INSERT INTO productos (codigo_producto, precio_unitario, producto, stock) VALUES (3, 1.5, 'Sprite', 200);
INSERT INTO productos (codigo_producto, precio_unitario, producto, stock) VALUES (4, 2.5, 'Aquarius', 250);
INSERT INTO productos (codigo_producto, precio_unitario, producto, stock) VALUES (5, 3.5, 'Nestea Maracuya', 300);

CREATE TABLE `pedidos` (
	`id_pedido` INT(11) NOT NULL,
	`codigo_producto` VARCHAR(50) NOT NULL DEFAULT '' COLLATE 'utf32_spanish_ci',
	`unidades` INT(11) NOT NULL DEFAULT '0',
	`total` DOUBLE NOT NULL DEFAULT '0',
	`fecha` DATE NOT NULL DEFAULT '0000-00-00',
	PRIMARY KEY (`id_pedido`) USING BTREE
)

INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (1, '1', 10, 0, '0000-00-00');
INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (2, '2', 20, 0, '0000-00-00');
INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (3, '3', 30, 0, '0000-00-00');
INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (4, '4', 40, 0, '0000-00-00');
INSERT INTO pedidos (id_pedido, codigo_producto, unidades, total, fecha) VALUES (5, '5', 50, 0, '0000-00-00');