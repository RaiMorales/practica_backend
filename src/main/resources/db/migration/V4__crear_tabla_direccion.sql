CREATE TABLE `direccion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `direccion_principal` bit(1) NOT NULL,
  `nombre_calle` varchar(255) NOT NULL,
  `numero_calle` int DEFAULT NULL,
  `usuario_id` int NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK73vv55f8i3n3b5me7kprxjr6o` (`usuario_id`),
  CONSTRAINT `FK73vv55f8i3n3b5me7kprxjr6o` FOREIGN KEY (`usuario_id`) REFERENCES `usuario` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci