package api.controller;

import api.model.Solicitud;
import api.repository.SolicitudRepository;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class SolicitudController {

	private final SolicitudRepository repository;

	SolicitudController(SolicitudRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/solicitudes")
	List<Solicitud> all(){
		return (List<Solicitud>) repository.findAll();
	}

	@PostMapping("/solicitudes")
	Solicitud newSolicitud(@RequestBody Solicitud newSolicitud) {
		return repository.save(newSolicitud);
	}

	// Single item

	// tag::get-single-item[]
	/*@GetMapping("/solicitudes/{id}")
	EntityModel<Solicitud> one(@PathVariable Long id) {

		Solicitud solicitud = repository.findById(id) //
				.orElseThrow(() -> new SolicitudNotFoundException(id));

		return EntityModel.of(solicitud, //
				linkTo(methodOn(SolicitudController.class).one(id)).withSelfRel(),
				linkTo(methodOn(SolicitudController.class).all()).withRel("solicitudes"));
	}*/
	// end::get-single-item[]

	/*@PutMapping("/solicitudes/{id}")
	Solicitud replaceSolicitud(@RequestBody Solicitud newSolicitud, @PathVariable Long id) {

		return repository.findById(id) //
				.map(solicitud -> {
					solicitud.setName(newSolicitud.getName());
					solicitud.setRole(newSolicitud.getRole());
					return repository.save(solicitud);
				}) //
				.orElseGet(() -> {
					newSolicitud.setId(id);
					return repository.save(newSolicitud);
				});
	}

	@DeleteMapping("/solicitudes/{id}")
	void deleteSolicitud(@PathVariable Long id) {
		repository.deleteById(id);
	}*/
}
