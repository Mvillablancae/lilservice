package api.services;

import java.util.Iterator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.model.Solicitud;
import api.repository.SolicitudRepository;

@Service
public class SolicitudService {
	@Autowired
	private SolicitudRepository solicitudRepository;
	
	
	public Solicitud SaveOrUpdate(Solicitud solicitud) {
		return solicitudRepository.save(solicitud);
	}
	public Iterable<Solicitud> listAll(){
		return solicitudRepository.findAll();	
	}
	
	public void RemoveSolicitud(Long id) {
		solicitudRepository.deleteById(id);
		
	}
	
	public Optional<Solicitud> findById(Long id) {
		return solicitudRepository.findById(id);
	}
	
}
