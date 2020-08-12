package api.controller;

import api.model.Reserva;
import api.repository.ReservaRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.hateoas.EntityModel;


@RestController
class ReservaController {

	private final ReservaRepository repository;

	ReservaController(ReservaRepository repository) {
		this.repository = repository;
	}
	

	@CrossOrigin
	@GetMapping("/reservas")
	List<Reserva> all(){
		return (List<Reserva>) repository.findAll();
	}

	@CrossOrigin
	@GetMapping("/reservas/{id}")
	Reserva one(@PathVariable Long id) {

		Reserva reserva = repository.findById(id) //
				.orElseThrow(() -> new ReservaNotFoundException(id));

		return reserva;
	}

	@CrossOrigin
	@PostMapping("/reservar")
	Reserva newReserva(@RequestBody Reserva newReserva) {
		return repository.save(newReserva);
	}

}
