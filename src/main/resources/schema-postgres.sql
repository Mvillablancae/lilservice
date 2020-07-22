DROP TABLE IF EXISTS solicitud CASCADE;
DROP TABLE IF EXISTS registro CASCADE;

CREATE TABLE solicitud(
  id SERIAL NOT NULL,
  fechasol TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  equipamiento VARCHAR(100),
  procedimiento VARCHAR(100),
  equipo VARCHAR(100) NOT NULL,
  p_or_s BOOL NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE registro(
  id SERIAL NOT NULL ,
  idSolicitud INT NOT NULL,
  fechaReg TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  bloqueHorario VARCHAR(15) NOT NULL,
  idRecurso INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (idSolicitud) 
    REFERENCES solicitud(id)
);