package api.controller;

import api.model.Registro;
import api.repository.RegistroRepository;
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
class RegistroController {

	private final RegistroRepository repository;

	RegistroController(RegistroRepository repository) {
		this.repository = repository;
	}


	@GetMapping("/registros")
	List<Registro> all(){
		return (List<Registro>) repository.findAll();
	}

	@PostMapping("/registrar")
	Registro newRegistro(@RequestBody Registro newRegistro) {
		return repository.save(newRegistro);
	}
}
