INSERT INTO usuario(cod_registro, nombre_completo) VALUES ('open123', 'David Villca');
INSERT INTO usuario(cod_registro, nombre_completo) VALUES ('open456', 'Kevin Vargas');
INSERT INTO usuario(cod_registro, nombre_completo) VALUES ('open789', 'Mijael Mijael');
INSERT INTO usuario(cod_registro, nombre_completo) VALUES ('open321', 'Jorge Jorge');
INSERT INTO rol(tipo) VALUES ('ROLE_ADMIN');
INSERT INTO rol(tipo) VALUES ('ROLE_COMISION');
INSERT INTO usuario_rol(usuario_cod_registro, rol_id_rol, habilitado, password) VALUES('open123',1,true, '$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq');
INSERT INTO usuario_rol(usuario_cod_registro, rol_id_rol, habilitado, password) VALUES('open456',1,true, '$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK');