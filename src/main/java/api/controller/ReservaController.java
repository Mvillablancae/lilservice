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


@RestController
class ReservaController {

	private final ReservaRepository repository;

	ReservaController(ReservaRepository repository) {
		this.repository = repository;
	}


	@GetMapping("/reservas")
	List<Reserva> all(){
		return (List<Reserva>) repository.findAll();
	}

	@PostMapping("/reservar")
	Reserva newReserva(@RequestBody Reserva newReserva) {
		System.out.println("No se puede por ahora u.u");
		return null;//repository.save(newReserva);
	}
}
