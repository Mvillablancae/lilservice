package api.services;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.model.Equipo;
import api.repository.EquipoRepository;

@Service
public class EquipoService {
	@Autowired
	private EquipoRepository equipoRepository;
	
	
	public Equipo SaveOrUpdate(Equipo equipo) {
		return equipoRepository.save(equipo);
	}
	public Iterable<Equipo> listAll(){
		return equipoRepository.findAll();	
	}
	
	public void RemoveEquipo(Long id) {
		equipoRepository.deleteById(id);
		
	}
	
	public Optional<Equipo> findById(Long id) {
		return equipoRepository.findById(id);
	}
	
	public Equipo findByName(String name) {
		Iterator<Equipo> it = equipoRepository.findAll().iterator();
		Equipo equipo = null;
		
		while(it.hasNext()) {
			Equipo aux = it.next();
			if(aux.getNameEquipo().equals(name)) {
				equipo = new Equipo();
				equipo.setIdEquipo(aux.getIdEquipo());
				equipo.setNameEquipo(aux.getNameEquipo());
				equipo.setPersonas(aux.getPersonas());
				/*
				equipo.setReservas(aux.getReservas());
				equipo.setSolicitudes(aux.getSolicitudes());
				*/
			}
			
		}
		return equipo;
	}

}
