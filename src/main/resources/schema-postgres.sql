DROP TABLE IF EXISTS solicitud CASCADE;
DROP TABLE IF EXISTS reserva CASCADE;

CREATE TABLE solicitud(
  id SERIAL NOT NULL,
  fechasol VARCHAR(100) NOT NULL,
  tipo_recurso INTEGER NOT NULL,
  id_recurso INTEGER NOT NULL,
  equipamiento INTEGER[] NOT NULL,
  procedimiento VARCHAR(100) NOT NULL,
  equipo INTEGER[] NOT NULL,
  estado BOOL NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE reserva(
  id SERIAL NOT NULL,
  idsolicitud INTEGER NOT NULL,
  fecha_inicio VARCHAR(100) NOT NULL,
  fecha_termino VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (idsolicitud) 
    REFERENCES solicitud(id)
);