-- INSERTO LOS DATOS SOLICITADOS EN LAS TABLAS DE MI BASE DE DATOS
-- INSERTO LOS DATOS EN LA TABLA GENERO

INSERT INTO 
    `genero` 
    (`nombre`) 
VALUES 
    ('Masculino'),
    ('Femenino');

-- INSERTO LOS DATOS EN LA TABLA PUESTO_DE_TRABAJO

INSERT INTO 
    `puesto_de_trabajo` 
    (`nombre`) 
VALUES 
    ('Desarrollador'),
    ('Diseñador'),
    ('Analista'),
    ('Gerente');

-- INSERTO LOS DATOS EN LA TABLA USUARIO

INSERT INTO 
    `usuario` 
    (`nick_usuario`, `contrasena`, `fecha_hora_creacion`, `genero_id`, `nombre`, `primer_apellido`, 
     `segundo_apellido`, `fecha_nacimiento`, `hora_desayuno`, `puesto_trabajo_id`) 
VALUES 
    ('jdoe', 'password123', '2023-01-01 00:00:00', 1, 'John', 'Doe', NULL, '1990-01-01', '08:00:00', 1);

-- INSERTO LOS DATOS EN LA TABLA DIRECCION

INSERT INTO 
    `direccion`
    (`nombre_calle`, `numero_calle`, `usuario_id`, `direccion_principal`)
VALUES
    ('Calle Mayor', 123, 1, 0),
    ('Avenida de la Constitución', 45, 1, 1),
    ('Calle del Sol', 67, 1, 0);