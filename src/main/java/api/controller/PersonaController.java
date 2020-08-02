package api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import api.model.Persona;
import api.services.PersonaService;

@CrossOrigin
@RestController
@RequestMapping("api/personas")
public class PersonaController {

	@Autowired
	private PersonaService personaService;
	
	@PostMapping("")
	public ResponseEntity<Persona> addPersona(@RequestBody Persona persona){
		Persona per = personaService.SavePersona(persona);
		return new ResponseEntity<Persona>(per,HttpStatus.CREATED);

	}

	@GetMapping("/all")
	public  @ResponseBody List<Persona> allPersonas(){
		List<Persona> allPer = new ArrayList<>();
		personaService.listAll().forEach( (p)->
		
			{allPer.add(p);}
		);
		
	return allPer;
	}
}
