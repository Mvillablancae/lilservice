DROP TABLE IF EXISTS solicitud CASCADE;
DROP TABLE IF EXISTS registro CASCADE;

CREATE TABLE solicitud(
  id SERIAL NOT NULL,
  fechasol CHAR(50),
  tipo_recurso INTEGER NOT NULL,
  id_recurso INTEGER NOT NULL,
  equipamiento INTEGER[] NOT NULL,
  procedimiento VARCHAR(100) NOT NULL,
  equipo INTEGER[] NOT NULL,
  estado BOOL NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE registro(
  id SERIAL NOT NULL ,
  idSolicitud INTEGER NOT NULL,
  fechaReg TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  bloqueHorario VARCHAR(15) NOT NULL,
  idRecurso INTEGER NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (idSolicitud) 
    REFERENCES solicitud(id)
);