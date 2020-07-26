INSERT INTO solicitud(tipo_recurso, id_recurso, equipamiento,procedimiento,equipo,estado) VALUES(1, 2543, ARRAY[1,2,3,4],'Quimio',ARRAY[1,2,3,4],false);
INSERT INTO solicitud(tipo_recurso, id_recurso, equipamiento,procedimiento,equipo,estado) VALUES(1, 245, ARRAY[1,7,3,4],'Recuperación',ARRAY[1,2,3,4],false);
INSERT INTO solicitud(tipo_recurso, id_recurso, equipamiento,procedimiento,equipo,estado) VALUES(1, 252, ARRAY[1,3,2,6],'Quimio',ARRAY[1,2,3,4],true);
INSERT INTO solicitud(tipo_recurso, id_recurso, equipamiento,procedimiento,equipo,estado) VALUES(1, 5123, ARRAY[1,4,3,4],'Quimio',ARRAY[1,2,3,4],false);
INSERT INTO solicitud(tipo_recurso, id_recurso, equipamiento,procedimiento,equipo,estado) VALUES(1, 2143, ARRAY[1,2,6,4],'Recuperación',ARRAY[1,2,3,4],true);
INSERT INTO solicitud(tipo_recurso, id_recurso, equipamiento,procedimiento,equipo,estado) VALUES(1, 1243, ARRAY[1,7,3,4],'Quimio',ARRAY[1,2,3,4],false);
INSERT INTO solicitud(tipo_recurso, id_recurso, equipamiento,procedimiento,equipo,estado) VALUES(1, 243, ARRAY[1,2,5,4],'Recuperación',ARRAY[1,2,3,4],true);

INSERT INTO reserva(idsolicitud) VALUES(1);

