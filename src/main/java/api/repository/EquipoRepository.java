package api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.model.Equipo;

@Repository
public interface EquipoRepository extends CrudRepository<Equipo,Long>{

}
