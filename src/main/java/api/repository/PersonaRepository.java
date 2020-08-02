package api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.model.Persona;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long> {

}
