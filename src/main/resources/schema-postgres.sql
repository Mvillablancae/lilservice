DROP TABLE IF EXISTS solicitud CASCADE;
DROP TABLE IF EXISTS reserva CASCADE;

CREATE TABLE solicitud(
  id SERIAL NOT NULL,
  fechasol TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
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
  fecha_inicio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  fecha_termino TIMESTAMP,
  PRIMARY KEY (id),
  FOREIGN KEY (idsolicitud) 
    REFERENCES solicitud(id)
);