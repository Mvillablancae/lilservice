package api.services;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.model.Persona;
import api.repository.PersonaRepository;



@Service
public class PersonaService {

	@Autowired
	private PersonaRepository personaRepository;
	
	
	public Persona SavePersona(Persona persona) {
		return personaRepository.save(persona);
		
	}
	public Iterable<Persona> listAll(){
		return personaRepository.findAll();	
	}
	
	public Optional<Persona> FindPersona(long id) {
		
		
		return personaRepository.findById(id);
	
	}
	
	public Persona FindByIdentificador(long identificador) {
		Iterator<Persona> it = personaRepository.findAll().iterator();
		Persona output = null;
		while(it.hasNext()) {
			Persona aux = it.next();
			if(identificador == aux.getIdentificador()) {
				output = new Persona(aux.getIdPersona(),aux.getNombre(),aux.getApellido(),aux.getIdentificador(),
						aux.getEspecializacion(),aux.getEstado(),aux.getListaEquipos());
				output.setIdPersona(aux.getIdPersona());
			}
		}
		return output;
		
	}
}
